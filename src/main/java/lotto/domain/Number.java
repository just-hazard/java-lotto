package lotto.domain;

import util.CommonConstants;
import util.CommonException;
import util.Message;

public class Number implements Comparable<Number>{
    private int number;

    public Number(int number) {
        validateNumberRange(number);
    }

    private void validateNumberRange(int number) {
        if(CommonConstants.LOTTO_NUMBER_MIN > number || CommonConstants.LOTTO_NUMBER_MAX < number) {
            CommonException.IllegalArgumentException(Message.LOTTO_NUMBER_RANGE_EXCESS);
        }
        this.number = number;
    }

    @Override
    public int compareTo(Number o) {
        return Integer.compare(this.number, o.number);
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
