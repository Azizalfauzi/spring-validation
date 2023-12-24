package zuhaprogrammer.spring.validation.helper;

import org.springframework.stereotype.Component;

@Component
public class StringHelper {
    public boolean isPalInDrome(String value) {
        String reverse = new StringBuilder(value).reverse().toString();
        return value.equals(reverse);
    }
}
