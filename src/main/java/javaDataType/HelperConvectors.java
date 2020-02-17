package javaDataType;

import java.text.DecimalFormat;

abstract class HelperConvectors {

    public String cutNumToOneDecimal(String inputValue){
        return new DecimalFormat("##.0").format(inputValue);
    }

}
