package jig.tutorial.domain.model.days;
import jig.tutorial.domain.model.days.LendingCount;

/**
 * 貸出制限
 */
public interface ILendingRule{
    public LendingCount lessThree();
    public LendingCount lessSeven();
    public LendingCount other();
}