package cn.edu.nuc.epms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RprecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RprecordExample() {
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

        public Criteria andRpidIsNull() {
            addCriterion("rpid is null");
            return (Criteria) this;
        }

        public Criteria andRpidIsNotNull() {
            addCriterion("rpid is not null");
            return (Criteria) this;
        }

        public Criteria andRpidEqualTo(Integer value) {
            addCriterion("rpid =", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidNotEqualTo(Integer value) {
            addCriterion("rpid <>", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidGreaterThan(Integer value) {
            addCriterion("rpid >", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rpid >=", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidLessThan(Integer value) {
            addCriterion("rpid <", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidLessThanOrEqualTo(Integer value) {
            addCriterion("rpid <=", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidIn(List<Integer> values) {
            addCriterion("rpid in", values, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidNotIn(List<Integer> values) {
            addCriterion("rpid not in", values, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidBetween(Integer value1, Integer value2) {
            addCriterion("rpid between", value1, value2, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidNotBetween(Integer value1, Integer value2) {
            addCriterion("rpid not between", value1, value2, "rpid");
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

        public Criteria andRptypeIsNull() {
            addCriterion("rptype is null");
            return (Criteria) this;
        }

        public Criteria andRptypeIsNotNull() {
            addCriterion("rptype is not null");
            return (Criteria) this;
        }

        public Criteria andRptypeEqualTo(Integer value) {
            addCriterion("rptype =", value, "rptype");
            return (Criteria) this;
        }

        public Criteria andRptypeNotEqualTo(Integer value) {
            addCriterion("rptype <>", value, "rptype");
            return (Criteria) this;
        }

        public Criteria andRptypeGreaterThan(Integer value) {
            addCriterion("rptype >", value, "rptype");
            return (Criteria) this;
        }

        public Criteria andRptypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rptype >=", value, "rptype");
            return (Criteria) this;
        }

        public Criteria andRptypeLessThan(Integer value) {
            addCriterion("rptype <", value, "rptype");
            return (Criteria) this;
        }

        public Criteria andRptypeLessThanOrEqualTo(Integer value) {
            addCriterion("rptype <=", value, "rptype");
            return (Criteria) this;
        }

        public Criteria andRptypeIn(List<Integer> values) {
            addCriterion("rptype in", values, "rptype");
            return (Criteria) this;
        }

        public Criteria andRptypeNotIn(List<Integer> values) {
            addCriterion("rptype not in", values, "rptype");
            return (Criteria) this;
        }

        public Criteria andRptypeBetween(Integer value1, Integer value2) {
            addCriterion("rptype between", value1, value2, "rptype");
            return (Criteria) this;
        }

        public Criteria andRptypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rptype not between", value1, value2, "rptype");
            return (Criteria) this;
        }

        public Criteria andRpmoneyIsNull() {
            addCriterion("rpmoney is null");
            return (Criteria) this;
        }

        public Criteria andRpmoneyIsNotNull() {
            addCriterion("rpmoney is not null");
            return (Criteria) this;
        }

        public Criteria andRpmoneyEqualTo(Float value) {
            addCriterion("rpmoney =", value, "rpmoney");
            return (Criteria) this;
        }

        public Criteria andRpmoneyNotEqualTo(Float value) {
            addCriterion("rpmoney <>", value, "rpmoney");
            return (Criteria) this;
        }

        public Criteria andRpmoneyGreaterThan(Float value) {
            addCriterion("rpmoney >", value, "rpmoney");
            return (Criteria) this;
        }

        public Criteria andRpmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("rpmoney >=", value, "rpmoney");
            return (Criteria) this;
        }

        public Criteria andRpmoneyLessThan(Float value) {
            addCriterion("rpmoney <", value, "rpmoney");
            return (Criteria) this;
        }

        public Criteria andRpmoneyLessThanOrEqualTo(Float value) {
            addCriterion("rpmoney <=", value, "rpmoney");
            return (Criteria) this;
        }

        public Criteria andRpmoneyIn(List<Float> values) {
            addCriterion("rpmoney in", values, "rpmoney");
            return (Criteria) this;
        }

        public Criteria andRpmoneyNotIn(List<Float> values) {
            addCriterion("rpmoney not in", values, "rpmoney");
            return (Criteria) this;
        }

        public Criteria andRpmoneyBetween(Float value1, Float value2) {
            addCriterion("rpmoney between", value1, value2, "rpmoney");
            return (Criteria) this;
        }

        public Criteria andRpmoneyNotBetween(Float value1, Float value2) {
            addCriterion("rpmoney not between", value1, value2, "rpmoney");
            return (Criteria) this;
        }

        public Criteria andRpdateIsNull() {
            addCriterion("rpdate is null");
            return (Criteria) this;
        }

        public Criteria andRpdateIsNotNull() {
            addCriterion("rpdate is not null");
            return (Criteria) this;
        }

        public Criteria andRpdateEqualTo(Date value) {
            addCriterionForJDBCDate("rpdate =", value, "rpdate");
            return (Criteria) this;
        }

        public Criteria andRpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rpdate <>", value, "rpdate");
            return (Criteria) this;
        }

        public Criteria andRpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("rpdate >", value, "rpdate");
            return (Criteria) this;
        }

        public Criteria andRpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rpdate >=", value, "rpdate");
            return (Criteria) this;
        }

        public Criteria andRpdateLessThan(Date value) {
            addCriterionForJDBCDate("rpdate <", value, "rpdate");
            return (Criteria) this;
        }

        public Criteria andRpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rpdate <=", value, "rpdate");
            return (Criteria) this;
        }

        public Criteria andRpdateIn(List<Date> values) {
            addCriterionForJDBCDate("rpdate in", values, "rpdate");
            return (Criteria) this;
        }

        public Criteria andRpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rpdate not in", values, "rpdate");
            return (Criteria) this;
        }

        public Criteria andRpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rpdate between", value1, value2, "rpdate");
            return (Criteria) this;
        }

        public Criteria andRpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rpdate not between", value1, value2, "rpdate");
            return (Criteria) this;
        }

        public Criteria andRpreasonIsNull() {
            addCriterion("rpreason is null");
            return (Criteria) this;
        }

        public Criteria andRpreasonIsNotNull() {
            addCriterion("rpreason is not null");
            return (Criteria) this;
        }

        public Criteria andRpreasonEqualTo(String value) {
            addCriterion("rpreason =", value, "rpreason");
            return (Criteria) this;
        }

        public Criteria andRpreasonNotEqualTo(String value) {
            addCriterion("rpreason <>", value, "rpreason");
            return (Criteria) this;
        }

        public Criteria andRpreasonGreaterThan(String value) {
            addCriterion("rpreason >", value, "rpreason");
            return (Criteria) this;
        }

        public Criteria andRpreasonGreaterThanOrEqualTo(String value) {
            addCriterion("rpreason >=", value, "rpreason");
            return (Criteria) this;
        }

        public Criteria andRpreasonLessThan(String value) {
            addCriterion("rpreason <", value, "rpreason");
            return (Criteria) this;
        }

        public Criteria andRpreasonLessThanOrEqualTo(String value) {
            addCriterion("rpreason <=", value, "rpreason");
            return (Criteria) this;
        }

        public Criteria andRpreasonLike(String value) {
            addCriterion("rpreason like", value, "rpreason");
            return (Criteria) this;
        }

        public Criteria andRpreasonNotLike(String value) {
            addCriterion("rpreason not like", value, "rpreason");
            return (Criteria) this;
        }

        public Criteria andRpreasonIn(List<String> values) {
            addCriterion("rpreason in", values, "rpreason");
            return (Criteria) this;
        }

        public Criteria andRpreasonNotIn(List<String> values) {
            addCriterion("rpreason not in", values, "rpreason");
            return (Criteria) this;
        }

        public Criteria andRpreasonBetween(String value1, String value2) {
            addCriterion("rpreason between", value1, value2, "rpreason");
            return (Criteria) this;
        }

        public Criteria andRpreasonNotBetween(String value1, String value2) {
            addCriterion("rpreason not between", value1, value2, "rpreason");
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