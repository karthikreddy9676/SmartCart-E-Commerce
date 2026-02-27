//package com.smartcart.dto;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import com.smartcart.entity.Address;
//import com.smartcart.entity.Product;
//import com.smartcart.entity.Role;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//public class UserDTO {
//    private Long userId;
//    private String userName;
//    private String email;
//    private String password;
//    private Set<Role> roles = new HashSet<>();
//    private Set<Product> products;
//    private List<Address> addresses = new ArrayList<>();
//}

package com.smartcart.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String userName;
    private String email;
    private String password;
}
