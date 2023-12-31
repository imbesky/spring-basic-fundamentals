package besky.basicfundamentals.discount;

import besky.basicfundamentals.member.constant.Grade;
import besky.basicfundamentals.member.domain.Member;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy{
    private final static int discountPercentage = 10;
    @Override
    public int discountValue(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return price * discountPercentage / 100;
        }
        return 0;
    }
}
