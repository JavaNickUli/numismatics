package jnu.numismatics.impl;

import jnu.numismatics.entity.Condition;

import java.util.List;

public interface ConditionDao {

    int createCondition(Condition condition);

    String readCondition(int id);

    int readCondition(Condition condition);

    List<String> readAllCondition();

    void updateCondition(int id, Condition condition);

    void deleteCondition(Condition condition);
}
