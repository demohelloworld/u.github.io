package com.swjd.pojo;

import java.util.ArrayList;
import java.util.List;

public class StoreamountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreamountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMnoIsNull() {
            addCriterion("mno is null");
            return (Criteria) this;
        }

        public Criteria andMnoIsNotNull() {
            addCriterion("mno is not null");
            return (Criteria) this;
        }

        public Criteria andMnoEqualTo(Integer value) {
            addCriterion("mno =", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoNotEqualTo(Integer value) {
            addCriterion("mno <>", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoGreaterThan(Integer value) {
            addCriterion("mno >", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("mno >=", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoLessThan(Integer value) {
            addCriterion("mno <", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoLessThanOrEqualTo(Integer value) {
            addCriterion("mno <=", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoIn(List<Integer> values) {
            addCriterion("mno in", values, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoNotIn(List<Integer> values) {
            addCriterion("mno not in", values, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoBetween(Integer value1, Integer value2) {
            addCriterion("mno between", value1, value2, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoNotBetween(Integer value1, Integer value2) {
            addCriterion("mno not between", value1, value2, "mno");
            return (Criteria) this;
        }

        public Criteria andPhnoIsNull() {
            addCriterion("phno is null");
            return (Criteria) this;
        }

        public Criteria andPhnoIsNotNull() {
            addCriterion("phno is not null");
            return (Criteria) this;
        }

        public Criteria andPhnoEqualTo(Integer value) {
            addCriterion("phno =", value, "phno");
            return (Criteria) this;
        }

        public Criteria andPhnoNotEqualTo(Integer value) {
            addCriterion("phno <>", value, "phno");
            return (Criteria) this;
        }

        public Criteria andPhnoGreaterThan(Integer value) {
            addCriterion("phno >", value, "phno");
            return (Criteria) this;
        }

        public Criteria andPhnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("phno >=", value, "phno");
            return (Criteria) this;
        }

        public Criteria andPhnoLessThan(Integer value) {
            addCriterion("phno <", value, "phno");
            return (Criteria) this;
        }

        public Criteria andPhnoLessThanOrEqualTo(Integer value) {
            addCriterion("phno <=", value, "phno");
            return (Criteria) this;
        }

        public Criteria andPhnoIn(List<Integer> values) {
            addCriterion("phno in", values, "phno");
            return (Criteria) this;
        }

        public Criteria andPhnoNotIn(List<Integer> values) {
            addCriterion("phno not in", values, "phno");
            return (Criteria) this;
        }

        public Criteria andPhnoBetween(Integer value1, Integer value2) {
            addCriterion("phno between", value1, value2, "phno");
            return (Criteria) this;
        }

        public Criteria andPhnoNotBetween(Integer value1, Integer value2) {
            addCriterion("phno not between", value1, value2, "phno");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}