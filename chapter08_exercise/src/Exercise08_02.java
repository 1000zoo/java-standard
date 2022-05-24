public class Exercise08_02 {
    public static void main(String[] args) {
        throw new UnsupportedFunctionException("unsupported function", 100);
    }
}

class UnsupportedFunctionException extends RuntimeException {
    final private int ERR_CODE = 100;

    UnsupportedFunctionException() {}
    UnsupportedFunctionException(String err, int err_code) {
        super(err);
    }

    public int getErrorCode() {
        return this.ERR_CODE;
    }
    public String getMessage() {
        return "[" + ERR_CODE + "]" + super.getMessage();
    }

}
