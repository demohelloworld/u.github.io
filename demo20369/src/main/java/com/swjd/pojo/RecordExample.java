package com.swjd.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordExample() {
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

        public Criteria andRnoIsNull() {
            addCriterion("rno is null");
            return (Criteria) this;
        }

        public Criteria andRnoIsNotNull() {
            addCriterion("rno is not null");
            return (Criteria) this;
        }

        public Criteria andRnoEqualTo(Integer value) {
            addCriterion("rno =", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotEqualTo(Integer value) {
            addCriterion("rno <>", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoGreaterThan(Integer value) {
            addCriterion("rno >", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("rno >=", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoLessThan(Integer value) {
            addCriterion("rno <", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoLessThanOrEqualTo(Integer value) {
            addCriterion("rno <=", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoIn(List<Integer> values) {
            addCriterion("rno in", values, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotIn(List<Integer> values) {
            addCriterion("rno not in", values, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoBetween(Integer value1, Integer value2) {
            addCriterion("rno between", value1, value2, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotBetween(Integer value1, Integer value2) {
            addCriterion("rno not between", value1, value2, "rno");
            return (Criteria) this;
        }

        public Criteria andPnoIsNull() {
            addCriterion("pno is null");
            return (Criteria) this;
        }

        public Criteria andPnoIsNotNull() {
            addCriterion("pno is not null");
            return (Criteria) this;
        }

        public Criteria andPnoEqualTo(Integer value) {
            addCriterion("pno =", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotEqualTo(Integer value) {
            addCriterion("pno <>", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoGreaterThan(Integer value) {
            addCriterion("pno >", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("pno >=", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoLessThan(Integer value) {
            addCriterion("pno <", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoLessThanOrEqualTo(Integer value) {
            addCriterion("pno <=", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoIn(List<Integer> values) {
            addCriterion("pno in", values, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotIn(List<Integer> values) {
            addCriterion("pno not in", values, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoBetween(Integer value1, Integer value2) {
            addCriterion("pno between", value1, value2, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotBetween(Integer value1, Integer value2) {
            addCriterion("pno not between", value1, value2, "pno");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andSelfpriceIsNull() {
            addCriterion("selfprice is null");
            return (Criteria) this;
        }

        public Criteria andSelfpriceIsNotNull() {
            addCriterion("selfprice is not null");
            return (Criteria) this;
        }

        public Criteria andSelfpriceEqualTo(Integer value) {
            addCriterion("selfprice =", value, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceNotEqualTo(Integer value) {
            addCriterion("selfprice <>", value, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceGreaterThan(Integer value) {
            addCriterion("selfprice >", value, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("selfprice >=", value, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceLessThan(Integer value) {
            addCriterion("selfprice <", value, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceLessThanOrEqualTo(Integer value) {
            addCriterion("selfprice <=", value, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceIn(List<Integer> values) {
            addCriterion("selfprice in", values, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceNotIn(List<Integer> values) {
            addCriterion("selfprice not in", values, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceBetween(Integer value1, Integer value2) {
            addCriterion("selfprice between", value1, value2, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("selfprice not between", value1, value2, "selfprice");
            return (Criteria) this;
        }

        public Criteria andFreepriceIsNull() {
            addCriterion("freeprice is null");
            return (Criteria) this;
        }

        public Criteria andFreepriceIsNotNull() {
            addCriterion("freeprice is not null");
            return (Criteria) this;
        }

        public Criteria andFreepriceEqualTo(Integer value) {
            addCriterion("freeprice =", value, "freeprice");
            return (Criteria) this;
        }

        public Criteria andFreepriceNotEqualTo(Integer value) {
            addCriterion("freeprice <>", value, "freeprice");
            return (Criteria) this;
        }

        public Criteria andFreepriceGreaterThan(Integer value) {
            addCriterion("freeprice >", value, "freeprice");
            return (Criteria) this;
        }

        public Criteria andFreepriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("freeprice >=", value, "freeprice");
            return (Criteria) this;
        }

        public Criteria andFreepriceLessThan(Integer value) {
            addCriterion("freeprice <", value, "freeprice");
            return (Criteria) this;
        }

        public Criteria andFreepriceLessThanOrEqualTo(Integer value) {
            addCriterion("freeprice <=", value, "freeprice");
            return (Criteria) this;
        }

        public Criteria andFreepriceIn(List<Integer> values) {
            addCriterion("freeprice in", values, "freeprice");
            return (Criteria) this;
        }

        public Criteria andFreepriceNotIn(List<Integer> values) {
            addCriterion("freeprice not in", values, "freeprice");
            return (Criteria) this;
        }

        public Criteria andFreepriceBetween(Integer value1, Integer value2) {
            addCriterion("freeprice between", value1, value2, "freeprice");
            return (Criteria) this;
        }

        public Criteria andFreepriceNotBetween(Integer value1, Integer value2) {
            addCriterion("freeprice not between", value1, value2, "freeprice");
            return (Criteria) this;
        }

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(Integer value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(Integer value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(Integer value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(Integer value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(Integer value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<Integer> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<Integer> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(Integer value1, Integer value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andDnoIsNull() {
            addCriterion("dno is null");
            return (Criteria) this;
        }

        public Criteria andDnoIsNotNull() {
            addCriterion("dno is not null");
            return (Criteria) this;
        }

        public Criteria andDnoEqualTo(Integer value) {
            addCriterion("dno =", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoNotEqualTo(Integer value) {
            addCriterion("dno <>", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoGreaterThan(Integer value) {
            addCriterion("dno >", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("dno >=", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoLessThan(Integer value) {
            addCriterion("dno <", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoLessThanOrEqualTo(Integer value) {
            addCriterion("dno <=", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoIn(List<Integer> values) {
            addCriterion("dno in", values, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoNotIn(List<Integer> values) {
            addCriterion("dno not in", values, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoBetween(Integer value1, Integer value2) {
            addCriterion("dno between", value1, value2, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoNotBetween(Integer value1, Integer value2) {
            addCriterion("dno not between", value1, value2, "dno");
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