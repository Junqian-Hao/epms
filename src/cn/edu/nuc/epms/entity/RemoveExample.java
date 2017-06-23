package cn.edu.nuc.epms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RemoveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RemoveExample() {
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

        public Criteria andRemoveidIsNull() {
            addCriterion("removeid is null");
            return (Criteria) this;
        }

        public Criteria andRemoveidIsNotNull() {
            addCriterion("removeid is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveidEqualTo(Integer value) {
            addCriterion("removeid =", value, "removeid");
            return (Criteria) this;
        }

        public Criteria andRemoveidNotEqualTo(Integer value) {
            addCriterion("removeid <>", value, "removeid");
            return (Criteria) this;
        }

        public Criteria andRemoveidGreaterThan(Integer value) {
            addCriterion("removeid >", value, "removeid");
            return (Criteria) this;
        }

        public Criteria andRemoveidGreaterThanOrEqualTo(Integer value) {
            addCriterion("removeid >=", value, "removeid");
            return (Criteria) this;
        }

        public Criteria andRemoveidLessThan(Integer value) {
            addCriterion("removeid <", value, "removeid");
            return (Criteria) this;
        }

        public Criteria andRemoveidLessThanOrEqualTo(Integer value) {
            addCriterion("removeid <=", value, "removeid");
            return (Criteria) this;
        }

        public Criteria andRemoveidIn(List<Integer> values) {
            addCriterion("removeid in", values, "removeid");
            return (Criteria) this;
        }

        public Criteria andRemoveidNotIn(List<Integer> values) {
            addCriterion("removeid not in", values, "removeid");
            return (Criteria) this;
        }

        public Criteria andRemoveidBetween(Integer value1, Integer value2) {
            addCriterion("removeid between", value1, value2, "removeid");
            return (Criteria) this;
        }

        public Criteria andRemoveidNotBetween(Integer value1, Integer value2) {
            addCriterion("removeid not between", value1, value2, "removeid");
            return (Criteria) this;
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

        public Criteria andRmethodIsNull() {
            addCriterion("rmethod is null");
            return (Criteria) this;
        }

        public Criteria andRmethodIsNotNull() {
            addCriterion("rmethod is not null");
            return (Criteria) this;
        }

        public Criteria andRmethodEqualTo(String value) {
            addCriterion("rmethod =", value, "rmethod");
            return (Criteria) this;
        }

        public Criteria andRmethodNotEqualTo(String value) {
            addCriterion("rmethod <>", value, "rmethod");
            return (Criteria) this;
        }

        public Criteria andRmethodGreaterThan(String value) {
            addCriterion("rmethod >", value, "rmethod");
            return (Criteria) this;
        }

        public Criteria andRmethodGreaterThanOrEqualTo(String value) {
            addCriterion("rmethod >=", value, "rmethod");
            return (Criteria) this;
        }

        public Criteria andRmethodLessThan(String value) {
            addCriterion("rmethod <", value, "rmethod");
            return (Criteria) this;
        }

        public Criteria andRmethodLessThanOrEqualTo(String value) {
            addCriterion("rmethod <=", value, "rmethod");
            return (Criteria) this;
        }

        public Criteria andRmethodLike(String value) {
            addCriterion("rmethod like", value, "rmethod");
            return (Criteria) this;
        }

        public Criteria andRmethodNotLike(String value) {
            addCriterion("rmethod not like", value, "rmethod");
            return (Criteria) this;
        }

        public Criteria andRmethodIn(List<String> values) {
            addCriterion("rmethod in", values, "rmethod");
            return (Criteria) this;
        }

        public Criteria andRmethodNotIn(List<String> values) {
            addCriterion("rmethod not in", values, "rmethod");
            return (Criteria) this;
        }

        public Criteria andRmethodBetween(String value1, String value2) {
            addCriterion("rmethod between", value1, value2, "rmethod");
            return (Criteria) this;
        }

        public Criteria andRmethodNotBetween(String value1, String value2) {
            addCriterion("rmethod not between", value1, value2, "rmethod");
            return (Criteria) this;
        }

        public Criteria andRdateIsNull() {
            addCriterion("rdate is null");
            return (Criteria) this;
        }

        public Criteria andRdateIsNotNull() {
            addCriterion("rdate is not null");
            return (Criteria) this;
        }

        public Criteria andRdateEqualTo(Date value) {
            addCriterionForJDBCDate("rdate =", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rdate <>", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThan(Date value) {
            addCriterionForJDBCDate("rdate >", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rdate >=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThan(Date value) {
            addCriterionForJDBCDate("rdate <", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rdate <=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateIn(List<Date> values) {
            addCriterionForJDBCDate("rdate in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rdate not in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rdate between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rdate not between", value1, value2, "rdate");
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