package com.customer.service.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Customer {

    @Id
    public int custId;
    public String name;
    public String address;
    public String phone;
    public String email;


    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = {CascadeType.ALL},
            targetEntity = Account.class)
    Set<Account> accounts;
}
