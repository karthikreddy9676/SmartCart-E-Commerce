package com.smartcart.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
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
    private Long id;

    @Column(nullable = false, unique = true)
    private String transactionId;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private String currency;

    @Column(nullable = false)
    private String status; 
    // e.g. PENDING, SUCCESS, FAILED, REFUNDED
    @Column(length=30)
    private String paymentMethod; 
    // e.g. CARD, UPI, NET_BANKING, WALLET
    @Column(length=30)
    private String payerEmail;
    @Column(length=30)
    private String description;

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
    public Payment() {}

    public Payment(String transactionId, BigDecimal amount, String currency,
                   String status, String paymentMethod, String payerEmail,
                   String description) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.currency = currency;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.payerEmail = payerEmail;
        this.description = description;
    }

    
    
}
