package by.mikevich.transfer;

import by.mikevich.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private String firstName;
    private String lastName;

    public UserDto(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static UserDto from(User user){
        return new UserDto(user.getFirstName(), user.getLastName());
    }
}
