
package com.smartcart.entity;

//existing entity created by our team member
/*import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "role")
public class Role {
	
	//data
	@Id
	@SequenceGenerator(name = "r", sequenceName = "role_seq", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "r", strategy = GenerationType.IDENTITY)
	private Long role_id;
	
	@Column(name = "NAME", length = 50)
	@NonNull
	private String role_name;
	
	@Column(name = "DESCRIPTION", length = 50)
	@NonNull
	private String role_description;
	
	
	//meta data
	@Version
	@Column(name = "UPDATED_COUNT")
	private Integer updateCount;
	
	@CreationTimestamp
	@Column(name = "CREATED_ON", insertable = true, updatable = false)
	private LocalDateTime createdOn;
	
	@UpdateTimestamp
	@Column(name = "LAST_UPDATED_ON", insertable = false, updatable = true)
	private LocalDateTime lastUpdatedOn;
	
	@Column(name = "OPEN_BY")
	private String openedBy;
	
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	
}
*/


//newly updated
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;

    @Enumerated(EnumType.STRING)
    private AppRole roleName;

    public Role(AppRole roleName) {
        this.roleName = roleName;
    }
}




