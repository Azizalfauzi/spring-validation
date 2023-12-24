package zuhaprogrammer.spring.validation.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import zuhaprogrammer.spring.validation.validation.Palindrome;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foo {
    @Palindrome
    private String bar;
}
