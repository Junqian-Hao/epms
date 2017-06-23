package cn.edu.nuc.epms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TrainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainExample() {
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

        public Criteria andTrainidIsNull() {
            addCriterion("trainid is null");
            return (Criteria) this;
        }

        public Criteria andTrainidIsNotNull() {
            addCriterion("trainid is not null");
            return (Criteria) this;
        }

        public Criteria andTrainidEqualTo(Integer value) {
            addCriterion("trainid =", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidNotEqualTo(Integer value) {
            addCriterion("trainid <>", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidGreaterThan(Integer value) {
            addCriterion("trainid >", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidGreaterThanOrEqualTo(Integer value) {
            addCriterion("trainid >=", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidLessThan(Integer value) {
            addCriterion("trainid <", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidLessThanOrEqualTo(Integer value) {
            addCriterion("trainid <=", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidIn(List<Integer> values) {
            addCriterion("trainid in", values, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidNotIn(List<Integer> values) {
            addCriterion("trainid not in", values, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidBetween(Integer value1, Integer value2) {
            addCriterion("trainid between", value1, value2, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidNotBetween(Integer value1, Integer value2) {
            addCriterion("trainid not between", value1, value2, "trainid");
            return (Criteria) this;
        }

        public Criteria andTstarttimeIsNull() {
            addCriterion("tstarttime is null");
            return (Criteria) this;
        }

        public Criteria andTstarttimeIsNotNull() {
            addCriterion("tstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andTstarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("tstarttime =", value, "tstarttime");
            return (Criteria) this;
        }

        public Criteria andTstarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("tstarttime <>", value, "tstarttime");
            return (Criteria) this;
        }

        public Criteria andTstarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("tstarttime >", value, "tstarttime");
            return (Criteria) this;
        }

        public Criteria andTstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tstarttime >=", value, "tstarttime");
            return (Criteria) this;
        }

        public Criteria andTstarttimeLessThan(Date value) {
            addCriterionForJDBCDate("tstarttime <", value, "tstarttime");
            return (Criteria) this;
        }

        public Criteria andTstarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tstarttime <=", value, "tstarttime");
            return (Criteria) this;
        }

        public Criteria andTstarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("tstarttime in", values, "tstarttime");
            return (Criteria) this;
        }

        public Criteria andTstarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("tstarttime not in", values, "tstarttime");
            return (Criteria) this;
        }

        public Criteria andTstarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tstarttime between", value1, value2, "tstarttime");
            return (Criteria) this;
        }

        public Criteria andTstarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tstarttime not between", value1, value2, "tstarttime");
            return (Criteria) this;
        }

        public Criteria andTendtimeIsNull() {
            addCriterion("tendtime is null");
            return (Criteria) this;
        }

        public Criteria andTendtimeIsNotNull() {
            addCriterion("tendtime is not null");
            return (Criteria) this;
        }

        public Criteria andTendtimeEqualTo(Date value) {
            addCriterionForJDBCDate("tendtime =", value, "tendtime");
            return (Criteria) this;
        }

        public Criteria andTendtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("tendtime <>", value, "tendtime");
            return (Criteria) this;
        }

        public Criteria andTendtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("tendtime >", value, "tendtime");
            return (Criteria) this;
        }

        public Criteria andTendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tendtime >=", value, "tendtime");
            return (Criteria) this;
        }

        public Criteria andTendtimeLessThan(Date value) {
            addCriterionForJDBCDate("tendtime <", value, "tendtime");
            return (Criteria) this;
        }

        public Criteria andTendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tendtime <=", value, "tendtime");
            return (Criteria) this;
        }

        public Criteria andTendtimeIn(List<Date> values) {
            addCriterionForJDBCDate("tendtime in", values, "tendtime");
            return (Criteria) this;
        }

        public Criteria andTendtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("tendtime not in", values, "tendtime");
            return (Criteria) this;
        }

        public Criteria andTendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tendtime between", value1, value2, "tendtime");
            return (Criteria) this;
        }

        public Criteria andTendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tendtime not between", value1, value2, "tendtime");
            return (Criteria) this;
        }

        public Criteria andTcontentIsNull() {
            addCriterion("tcontent is null");
            return (Criteria) this;
        }

        public Criteria andTcontentIsNotNull() {
            addCriterion("tcontent is not null");
            return (Criteria) this;
        }

        public Criteria andTcontentEqualTo(String value) {
            addCriterion("tcontent =", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentNotEqualTo(String value) {
            addCriterion("tcontent <>", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentGreaterThan(String value) {
            addCriterion("tcontent >", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentGreaterThanOrEqualTo(String value) {
            addCriterion("tcontent >=", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentLessThan(String value) {
            addCriterion("tcontent <", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentLessThanOrEqualTo(String value) {
            addCriterion("tcontent <=", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentLike(String value) {
            addCriterion("tcontent like", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentNotLike(String value) {
            addCriterion("tcontent not like", value, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentIn(List<String> values) {
            addCriterion("tcontent in", values, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentNotIn(List<String> values) {
            addCriterion("tcontent not in", values, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentBetween(String value1, String value2) {
            addCriterion("tcontent between", value1, value2, "tcontent");
            return (Criteria) this;
        }

        public Criteria andTcontentNotBetween(String value1, String value2) {
            addCriterion("tcontent not between", value1, value2, "tcontent");
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