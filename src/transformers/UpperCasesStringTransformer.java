package transformers;

import java.util.Locale;

public class UpperCasesStringTransformer extends StringTransformer {


    public UpperCasesStringTransformer(String str) {
        super(str);
    }

    public UpperCasesStringTransformer() {
        super();
    }

    @Override
    public String transform() {
        return str.toUpperCase();
    }
}
