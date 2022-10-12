package pwo.seq;

import java.math.BigDecimal;
import pwo.utils.SequenceGenerator;

public class Generator implements SequenceGenerator{

    protected int lastIndex = 0;
    protected BigDecimal current = null,
    f_1 = null,
    f_2 = null,
    f_3 = null;

    
    @Override
    public void reset() {
        lastIndex = 0;
    }

    @Override
    public BigDecimal nextTerm() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public BigDecimal getTerm(int i) {
        if (i < 0) throw new IllegalArgumentException();
        if (i < lastIndex) reset();
        while (lastIndex <= i) nextTerm();
        return current;
    }
    
}
