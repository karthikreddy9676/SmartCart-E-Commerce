//package com.smartcart.dto;
//
//import java.util.List;
//
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
//public class LoginResponse {
//    //private String jwtToken;
//
//    private String username;
//    private List<String> roles;
//
//    public LoginResponse(String username, List<String> roles, String jwtToken) {
//        this.username = username;
//        this.roles = roles;
//        //this.jwtToken = jwtToken;
//    }
//
////    public String getJwtToken() {
////        return jwtToken;
////    }
////
////    public void setJwtToken(String jwtToken) {
////        this.jwtToken = jwtToken;
////    }
////
////    public String getUsername() {
////        return username;
////    }
////
////    public void setUsername(String username) {
////        this.username = username;
////    }
//
//    public List<String> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<String> roles) {
//        this.roles = roles;
//    }
//}
//
//

package com.smartcart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponseDTO {

    private Long userId;
    private String userName;
    private String email;
    private String message;
}
