public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula();
        addOperands(arg0, arg1, formula);
        formula = formula.calculate(Calculator.Operation.SUM);

        return (int) formula.result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula();
        addOperands(arg0, arg1, formula);
        formula = formula.calculate(Calculator.Operation.MULT);

        return (int) formula.result();
    }

    @Override
    public int pow(int a, int b) {
        Calculator.Formula formula = target.newFormula();
        addOperands(a, b, formula);
        formula = formula.calculate(Calculator.Operation.POW);

        return (int) formula.result();
    }

    private void addOperands(int arg0, int arg1, Calculator.Formula formula) {
        formula.addOperand(arg0);
        formula.addOperand(arg1);
    }

}
