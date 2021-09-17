package transformers;

import java.util.Locale;

public class ReverseStringTransformer extends StringTransformer{


    public ReverseStringTransformer(String str) {
        super(str);
    }

    @Override
    public String transform() {
            int i = str.length() - 1;
            int start, end = i + 1;
            StringBuilder result = new StringBuilder();

            while(i >= 0) {
                if(str.charAt(i) == ' ')
                {
                    start = i + 1;
                    while(start != end)
                        result.append(str.charAt(start++));

                    result.append(' ');

                    end = i;
                }
                i--;
            }

            start = 0;
            while(start != end)
                result.append(str.charAt(start++));

            return result.toString();

    }
}
