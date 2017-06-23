package cn.edu.nuc.epms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BusinesstripExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinesstripExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBtidIsNull() {
            addCriterion("btid is null");
            return (Criteria) this;
        }

        public Criteria andBtidIsNotNull() {
            addCriterion("btid is not null");
            return (Criteria) this;
        }

        public Criteria andBtidEqualTo(Integer value) {
            addCriterion("btid =", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidNotEqualTo(Integer value) {
            addCriterion("btid <>", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidGreaterThan(Integer value) {
            addCriterion("btid >", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("btid >=", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidLessThan(Integer value) {
            addCriterion("btid <", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidLessThanOrEqualTo(Integer value) {
            addCriterion("btid <=", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidIn(List<Integer> values) {
            addCriterion("btid in", values, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidNotIn(List<Integer> values) {
            addCriterion("btid not in", values, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidBetween(Integer value1, Integer value2) {
            addCriterion("btid between", value1, value2, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidNotBetween(Integer value1, Integer value2) {
            addCriterion("btid not between", value1, value2, "btid");
            return (Criteria) this;
        }

        public Criteria andBtdateIsNull() {
            addCriterion("btdate is null");
            return (Criteria) this;
        }

        public Criteria andBtdateIsNotNull() {
            addCriterion("btdate is not null");
            return (Criteria) this;
        }

        public Criteria andBtdateEqualTo(Date value) {
            addCriterionForJDBCDate("btdate =", value, "btdate");
            return (Criteria) this;
        }

        public Criteria andBtdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("btdate <>", value, "btdate");
            return (Criteria) this;
        }

        public Criteria andBtdateGreaterThan(Date value) {
            addCriterionForJDBCDate("btdate >", value, "btdate");
            return (Criteria) this;
        }

        public Criteria andBtdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("btdate >=", value, "btdate");
            return (Criteria) this;
        }

        public Criteria andBtdateLessThan(Date value) {
            addCriterionForJDBCDate("btdate <", value, "btdate");
            return (Criteria) this;
        }

        public Criteria andBtdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("btdate <=", value, "btdate");
            return (Criteria) this;
        }

        public Criteria andBtdateIn(List<Date> values) {
            addCriterionForJDBCDate("btdate in", values, "btdate");
            return (Criteria) this;
        }

        public Criteria andBtdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("btdate not in", values, "btdate");
            return (Criteria) this;
        }

        public Criteria andBtdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("btdate between", value1, value2, "btdate");
            return (Criteria) this;
        }

        public Criteria andBtdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("btdate not between", value1, value2, "btdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNull() {
            addCriterion("registerdate is null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNotNull() {
            addCriterion("registerdate is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateEqualTo(Date value) {
            addCriterionForJDBCDate("registerdate =", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("registerdate <>", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThan(Date value) {
            addCriterionForJDBCDate("registerdate >", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registerdate >=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThan(Date value) {
            addCriterionForJDBCDate("registerdate <", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registerdate <=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIn(List<Date> values) {
            addCriterionForJDBCDate("registerdate in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("registerdate not in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registerdate between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registerdate not between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andBtmessageIsNull() {
            addCriterion("btmessage is null");
            return (Criteria) this;
        }

        public Criteria andBtmessageIsNotNull() {
            addCriterion("btmessage is not null");
            return (Criteria) this;
        }

        public Criteria andBtmessageEqualTo(String value) {
            addCriterion("btmessage =", value, "btmessage");
            return (Criteria) this;
        }

        public Criteria andBtmessageNotEqualTo(String value) {
            addCriterion("btmessage <>", value, "btmessage");
            return (Criteria) this;
        }

        public Criteria andBtmessageGreaterThan(String value) {
            addCriterion("btmessage >", value, "btmessage");
            return (Criteria) this;
        }

        public Criteria andBtmessageGreaterThanOrEqualTo(String value) {
            addCriterion("btmessage >=", value, "btmessage");
            return (Criteria) this;
        }

        public Criteria andBtmessageLessThan(String value) {
            addCriterion("btmessage <", value, "btmessage");
            return (Criteria) this;
        }

        public Criteria andBtmessageLessThanOrEqualTo(String value) {
            addCriterion("btmessage <=", value, "btmessage");
            return (Criteria) this;
        }

        public Criteria andBtmessageLike(String value) {
            addCriterion("btmessage like", value, "btmessage");
            return (Criteria) this;
        }

        public Criteria andBtmessageNotLike(String value) {
            addCriterion("btmessage not like", value, "btmessage");
            return (Criteria) this;
        }

        public Criteria andBtmessageIn(List<String> values) {
            addCriterion("btmessage in", values, "btmessage");
            return (Criteria) this;
        }

        public Criteria andBtmessageNotIn(List<String> values) {
            addCriterion("btmessage not in", values, "btmessage");
            return (Criteria) this;
        }

        public Criteria andBtmessageBetween(String value1, String value2) {
            addCriterion("btmessage between", value1, value2, "btmessage");
            return (Criteria) this;
        }

        public Criteria andBtmessageNotBetween(String value1, String value2) {
            addCriterion("btmessage not between", value1, value2, "btmessage");
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