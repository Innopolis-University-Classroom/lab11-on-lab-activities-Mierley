package ru.innopolis.problem1;

public class problem1
{
    public static void main(String[] args) {
        WorkShop workShop = new WorkShop();
        workShop.setWorkshop(new DisassembleOperation());
    }
}

class WorkShop {
    Operation operation;

    public void setWorkshop(Operation operation)
    {
        this.operation = operation;
    }

    public void startFiltering(String message)
    {
        operation.operate(message);
    }
}

interface Operation
{
    void operate(String message);
}

class DisassembleOperation implements Operation
{
    @Override
    public void operate(String message) {
        System.out.println("Disassemble");
    }
}

class AssembleOperation implements Operation
{
    @Override
    public void operate(String message) {
        System.out.println("Assemble");
    }
}