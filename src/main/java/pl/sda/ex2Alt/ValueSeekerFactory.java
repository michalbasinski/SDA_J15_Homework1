package pl.sda.ex2Alt;

class ValueSeekerFactory {
    ValueSeeker produce(ValueType valueType) {
        ValueSeeker product = null;

        if (ValueType.MAX.equals(valueType)) {

            product = values -> {
                InputValidator validator = new InputValidator();
                validator.validate(values);
                Integer max = Integer.MIN_VALUE;
                for (Integer value : values) {
                    if (value > max) {
                        max = value;
                    }
                }
                return max;
            };

        }
        if (ValueType.MIN.equals(valueType)) {
            product = values -> {
                InputValidator validator = new InputValidator();
                validator.validate(values);
                Integer min = Integer.MAX_VALUE;
                for (Integer value : values) {
                    if (value < min) {
                        min = value;
                    }
                }
                return min;
            };
        }
        return product;
    }
}
