package com.soumen.calculatorclient;

public class CalculatorPojo {
    private String operation;
    private Integer[] inputs;
    private Integer output;

    public CalculatorPojo(String operation, Integer[] inputs, Integer output) {
        this.operation = operation;
        this.inputs = inputs;
        this.output = output;

    }

    public CalculatorPojo() {
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer[] getInputs() {
        return inputs;
    }

    public void setInputs(Integer[] inputs) {
        this.inputs = inputs;
    }

    public Integer getOutput() {
        return output;
    }

    public void setOutput(Integer output) {
        this.output = output;
    }
}
