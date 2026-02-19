package com.smartcart.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @SequenceGenerator(name = "u", sequenceName = "user_seq", initialValue = 1000, allocationSize = 1)
    @GeneratedValue(generator = "u", strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME", length = 50)
    @NonNull
    private String firstName;

    @Column(name = "LAST_NAME", length = 50)
    @NonNull
    private String lastName;

    @Column(name = "EMAIL", length = 100, unique = true)
    @NonNull
    private String email;

    @Column(name = "PASSWORD", length = 255)
    @NonNull
    private String password;

    @Column(name = "MOBILE", length = 15)
    private String mobile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROLE_ID")
    private Role role;
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