package com.smartcart.entity;


/*import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;

@Entity
@Table(name = "payments")
@Getter
@Setter
@AllArgsConstructor

public class Payment {



    @Id
    @SequenceGenerator(name="gen1",sequenceName = "payment_seq1",initialValue = 1,allocationSize = 1)
    @GeneratedValue( generator = "gen1",strategy = GenerationType.SEQUENCE)
    private Long payment_Id;
    @OneToOne(targetEntity = Order.class,cascade = CascadeType.ALL)
    @JoinColumn(name="oder_Id",referencedColumnName = "payment_Id")
    
    private Order order;
    
   

    @Column(nullable = false)
    private String status; 
    // e.g. PENDING, SUCCESS, FAILED, REFUNDED
    
    @Column(length=30)
    private String paymentMethod; 
    // e.g. CARD, UPI, NET_BANKING, WALLET
    

    @Column(nullable = false, updatable = false)
   
    @CreationTimestamp
    private LocalDateTime createdAt;
    
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    
    @Version
    private Integer count_of_changes;
    @Column(length=30)
    private String created_by;
    
    @Column(length=30)
    private String  updated_by;
   

    // Constructors
    public Payment() {
    	
    }


	@Override
	public String toString() {
		return "Payment [payment_Id=" + payment_Id + ", status=" + status + ", paymentMethod=" + paymentMethod
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", count_of_changes=" + count_of_changes
				+ ", created_by=" + created_by + ", updated_by=" + updated_by + "]";
	}

    

    
    
}
*/


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @OneToOne(mappedBy = "payment", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Order order;

   
    private String paymentMethod;

    private String pgPaymentId;
    private String pgStatus;
    private String pgResponseMessage;

    private String pgName;


    public Payment(String paymentMethod, String pgPaymentId, String pgStatus,
                   String pgResponseMessage, String pgName) {
        this.paymentMethod = paymentMethod;
        this.pgPaymentId = pgPaymentId;
        this.pgStatus = pgStatus;
        this.pgResponseMessage = pgResponseMessage;
        this.pgName = pgName;
    }
}
