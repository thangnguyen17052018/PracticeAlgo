package MrDuyExcercises;

public class LongestNumber {

    public static boolean isLarger(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return true;
        } else if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    continue;
                } else {
                    return str1.charAt(i) > str2.charAt(i);
                }
            }
        }

        return false;
    }
    
    public static boolean isNumber(char element) {
        return (element >= '0') && (element <= '9');
    }

    public static String getFractionalPartIfExisted(String str, int i) {
        StringBuilder fractionalPart = new StringBuilder();
        if (i < str.length()) {
            if (str.charAt(i) == '.') {
                i++;
                while (i < str.length() && isNumber(str.charAt(i))) {
                    fractionalPart.append(str.charAt(i));
                    i++;
                }
            }
        }

        return fractionalPart.toString();
    }
    
    public static String solve(String str) {
        String wholeNumberPart = "";
        StringBuilder fractionalPart = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (isNumber(str.charAt(i)) && (str.charAt(i) != '0')) {
                StringBuilder wholeNumber = new StringBuilder();
                StringBuilder fractional;
                while (i < str.length() && isNumber(str.charAt(i))) {
                    wholeNumber.append(str.charAt(i));
                    i++;
                }

                if (isLarger(wholeNumber.toString(), wholeNumberPart)) {
                    wholeNumberPart = wholeNumber.toString();
                    fractionalPart = new StringBuilder(getFractionalPartIfExisted(str, i));
                    i += fractionalPart.length();
                } else if (wholeNumber.toString().equals(wholeNumberPart)) {
                    fractional = new StringBuilder(getFractionalPartIfExisted(str, i));
                    int maxLength = Math.max(fractional.length(), fractionalPart.length());
                    for (int k = 1; k < maxLength; k++) {
                        if (fractional.length() < maxLength) {
                            fractional.append('0');
                        }

                        if (fractionalPart.length() < maxLength) {
                            fractionalPart.append('0');
                        }
                    }
                    if (isLarger(fractional.toString(), fractionalPart.toString())) {
                        fractionalPart = fractional;
                        while (fractionalPart.charAt(maxLength - 1) == '0') {
                            fractionalPart.deleteCharAt(maxLength - 1);
                            maxLength--;
                        }
                    }
                }

            }
        }

        String decimalPoint = (fractionalPart.length() > 0) ? "." : "";
        return wholeNumberPart + decimalPoint + fractionalPart;
    }

    public static void main(String[] args) {
        String str = "BuHf7GauEo2521xdrP2ffR8LuMJi123906kly4HW123.00ef5Vp4PZN1653548.90568bv0qxDg8OC0001016275o7GhjVzDzy8oqcyELRcEu053sqYGKPJIkvNF8mz4KV9K9Amo";
        System.out.println(solve(str));

        str = "123.21a123";
        System.out.println(solve(str));

        str = "abc12321321";
        System.out.println(solve(str));

        str = "abc12321321.2132114";
        System.out.println(solve(str));

        str = "abc123456.21asfasfasf123456.22";
        System.out.println(solve(str));

        str = "abc1545kajsjad9999.444";
        System.out.println(solve(str));

        str = "000000abc1545kajsjad00009999.4044";
        System.out.println(solve(str));

        str = "9999.4abc1545kajsjad00009999.4044";
        System.out.println(solve(str));
    }

}
