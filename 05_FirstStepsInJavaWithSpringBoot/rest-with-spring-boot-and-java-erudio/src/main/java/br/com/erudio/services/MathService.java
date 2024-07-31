package br.com.erudio.services;

import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.utils.MathUtils;

public class MathService {
	 public Double addition(String numberOne, String numberTwo) {
	        validateInput(numberOne, numberTwo);
	        return MathUtils.convertToDouble(numberOne) + MathUtils.convertToDouble(numberTwo);
	    }

	    public Double subtraction(String numberOne, String numberTwo) {
	        validateInput(numberOne, numberTwo);
	        return MathUtils.convertToDouble(numberOne) - MathUtils.convertToDouble(numberTwo);
	    }

	    public Double multiplication(String numberOne, String numberTwo) {
	        validateInput(numberOne, numberTwo);
	        return MathUtils.convertToDouble(numberOne) * MathUtils.convertToDouble(numberTwo);
	    }

	    public Double division(String numberOne, String numberTwo) {
	        validateInput(numberOne, numberTwo);
	        return MathUtils.convertToDouble(numberOne) / MathUtils.convertToDouble(numberTwo);
	    }

	    public Double average(String numberOne, String numberTwo) {
	        validateInput(numberOne, numberTwo);
	        return (MathUtils.convertToDouble(numberOne) + MathUtils.convertToDouble(numberTwo)) / 2;
	    }

	    public Double squareRoot(String number) {
	        if (!MathUtils.isNumeric(number)) {
	            throw new UnsupportedMathOperationException("Please set a numeric value!");
	        }
	        return Math.sqrt(MathUtils.convertToDouble(number));
	    }

	    private void validateInput(String numberOne, String numberTwo) {
	        if (!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
	            throw new UnsupportedMathOperationException("Please set a numeric value!");
	        }
	    }
}
