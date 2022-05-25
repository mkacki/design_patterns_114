package pl.sda.java.designPatterns.creational.builder;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
@AllArgsConstructor
public class UserLombok {

    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private int age;

}
