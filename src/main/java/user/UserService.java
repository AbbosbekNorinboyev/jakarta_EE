package user;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserService {
    User users;
    public List<User> get(){
        return get();
    }
    public User addUser(String name){

//       return User.builder()
//               users.getName(name)
//               .build();
        return users;
    }

}
