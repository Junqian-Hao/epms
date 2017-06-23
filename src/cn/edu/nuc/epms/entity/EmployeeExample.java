package cn.edu.nuc.epms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEnoIsNull() {
            addCriterion("eno is null");
            return (Criteria) this;
        }

        public Criteria andEnoIsNotNull() {
            addCriterion("eno is not null");
            return (Criteria) this;
        }

        public Criteria andEnoEqualTo(Integer value) {
            addCriterion("eno =", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoNotEqualTo(Integer value) {
            addCriterion("eno <>", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoGreaterThan(Integer value) {
            addCriterion("eno >", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("eno >=", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoLessThan(Integer value) {
            addCriterion("eno <", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoLessThanOrEqualTo(Integer value) {
            addCriterion("eno <=", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoIn(List<Integer> values) {
            addCriterion("eno in", values, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoNotIn(List<Integer> values) {
            addCriterion("eno not in", values, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoBetween(Integer value1, Integer value2) {
            addCriterion("eno between", value1, value2, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoNotBetween(Integer value1, Integer value2) {
            addCriterion("eno not between", value1, value2, "eno");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterionForJDBCDate("birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterionForJDBCDate("birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterionForJDBCDate("birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andDutyIsNull() {
            addCriterion("duty is null");
            return (Criteria) this;
        }

        public Criteria andDutyIsNotNull() {
            addCriterion("duty is not null");
            return (Criteria) this;
        }

        public Criteria andDutyEqualTo(String value) {
            addCriterion("duty =", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotEqualTo(String value) {
            addCriterion("duty <>", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThan(String value) {
            addCriterion("duty >", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThanOrEqualTo(String value) {
            addCriterion("duty >=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThan(String value) {
            addCriterion("duty <", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThanOrEqualTo(String value) {
            addCriterion("duty <=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLike(String value) {
            addCriterion("duty like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotLike(String value) {
            addCriterion("duty not like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyIn(List<String> values) {
            addCriterion("duty in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotIn(List<String> values) {
            addCriterion("duty not in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyBetween(String value1, String value2) {
            addCriterion("duty between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotBetween(String value1, String value2) {
            addCriterion("duty not between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceIsNull() {
            addCriterion("domicileplace is null");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceIsNotNull() {
            addCriterion("domicileplace is not null");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceEqualTo(String value) {
            addCriterion("domicileplace =", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceNotEqualTo(String value) {
            addCriterion("domicileplace <>", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceGreaterThan(String value) {
            addCriterion("domicileplace >", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceGreaterThanOrEqualTo(String value) {
            addCriterion("domicileplace >=", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceLessThan(String value) {
            addCriterion("domicileplace <", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceLessThanOrEqualTo(String value) {
            addCriterion("domicileplace <=", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceLike(String value) {
            addCriterion("domicileplace like", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceNotLike(String value) {
            addCriterion("domicileplace not like", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceIn(List<String> values) {
            addCriterion("domicileplace in", values, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceNotIn(List<String> values) {
            addCriterion("domicileplace not in", values, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceBetween(String value1, String value2) {
            addCriterion("domicileplace between", value1, value2, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceNotBetween(String value1, String value2) {
            addCriterion("domicileplace not between", value1, value2, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andPoliticsIsNull() {
            addCriterion("politics is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsIsNotNull() {
            addCriterion("politics is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsEqualTo(String value) {
            addCriterion("politics =", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotEqualTo(String value) {
            addCriterion("politics <>", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsGreaterThan(String value) {
            addCriterion("politics >", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsGreaterThanOrEqualTo(String value) {
            addCriterion("politics >=", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLessThan(String value) {
            addCriterion("politics <", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLessThanOrEqualTo(String value) {
            addCriterion("politics <=", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLike(String value) {
            addCriterion("politics like", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotLike(String value) {
            addCriterion("politics not like", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsIn(List<String> values) {
            addCriterion("politics in", values, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotIn(List<String> values) {
            addCriterion("politics not in", values, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsBetween(String value1, String value2) {
            addCriterion("politics between", value1, value2, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotBetween(String value1, String value2) {
            addCriterion("politics not between", value1, value2, "politics");
            return (Criteria) this;
        }

        public Criteria andPhysiologicalIsNull() {
            addCriterion("physiological is null");
            return (Criteria) this;
        }

        public Criteria andPhysiologicalIsNotNull() {
            addCriterion("physiological is not null");
            return (Criteria) this;
        }

        public Criteria andPhysiologicalEqualTo(String value) {
            addCriterion("physiological =", value, "physiological");
            return (Criteria) this;
        }

        public Criteria andPhysiologicalNotEqualTo(String value) {
            addCriterion("physiological <>", value, "physiological");
            return (Criteria) this;
        }

        public Criteria andPhysiologicalGreaterThan(String value) {
            addCriterion("physiological >", value, "physiological");
            return (Criteria) this;
        }

        public Criteria andPhysiologicalGreaterThanOrEqualTo(String value) {
            addCriterion("physiological >=", value, "physiological");
            return (Criteria) this;
        }

        public Criteria andPhysiologicalLessThan(String value) {
            addCriterion("physiological <", value, "physiological");
            return (Criteria) this;
        }

        public Criteria andPhysiologicalLessThanOrEqualTo(String value) {
            addCriterion("physiological <=", value, "physiological");
            return (Criteria) this;
        }

        public Criteria andPhysiologicalLike(String value) {
            addCriterion("physiological like", value, "physiological");
            return (Criteria) this;
        }

        public Criteria andPhysiologicalNotLike(String value) {
            addCriterion("physiological not like", value, "physiological");
            return (Criteria) this;
        }

        public Criteria andPhysiologicalIn(List<String> values) {
            addCriterion("physiological in", values, "physiological");
            return (Criteria) this;
        }

        public Criteria andPhysiologicalNotIn(List<String> values) {
            addCriterion("physiological not in", values, "physiological");
            return (Criteria) this;
        }

        public Criteria andPhysiologicalBetween(String value1, String value2) {
            addCriterion("physiological between", value1, value2, "physiological");
            return (Criteria) this;
        }

        public Criteria andPhysiologicalNotBetween(String value1, String value2) {
            addCriterion("physiological not between", value1, value2, "physiological");
            return (Criteria) this;
        }

        public Criteria andContractsigningdateIsNull() {
            addCriterion("contractSigningDate is null");
            return (Criteria) this;
        }

        public Criteria andContractsigningdateIsNotNull() {
            addCriterion("contractSigningDate is not null");
            return (Criteria) this;
        }

        public Criteria andContractsigningdateEqualTo(Date value) {
            addCriterionForJDBCDate("contractSigningDate =", value, "contractsigningdate");
            return (Criteria) this;
        }

        public Criteria andContractsigningdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("contractSigningDate <>", value, "contractsigningdate");
            return (Criteria) this;
        }

        public Criteria andContractsigningdateGreaterThan(Date value) {
            addCriterionForJDBCDate("contractSigningDate >", value, "contractsigningdate");
            return (Criteria) this;
        }

        public Criteria andContractsigningdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contractSigningDate >=", value, "contractsigningdate");
            return (Criteria) this;
        }

        public Criteria andContractsigningdateLessThan(Date value) {
            addCriterionForJDBCDate("contractSigningDate <", value, "contractsigningdate");
            return (Criteria) this;
        }

        public Criteria andContractsigningdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contractSigningDate <=", value, "contractsigningdate");
            return (Criteria) this;
        }

        public Criteria andContractsigningdateIn(List<Date> values) {
            addCriterionForJDBCDate("contractSigningDate in", values, "contractsigningdate");
            return (Criteria) this;
        }

        public Criteria andContractsigningdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("contractSigningDate not in", values, "contractsigningdate");
            return (Criteria) this;
        }

        public Criteria andContractsigningdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contractSigningDate between", value1, value2, "contractsigningdate");
            return (Criteria) this;
        }

        public Criteria andContractsigningdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contractSigningDate not between", value1, value2, "contractsigningdate");
            return (Criteria) this;
        }

        public Criteria andContractexpirationdateIsNull() {
            addCriterion("contractexpirationdate is null");
            return (Criteria) this;
        }

        public Criteria andContractexpirationdateIsNotNull() {
            addCriterion("contractexpirationdate is not null");
            return (Criteria) this;
        }

        public Criteria andContractexpirationdateEqualTo(Date value) {
            addCriterionForJDBCDate("contractexpirationdate =", value, "contractexpirationdate");
            return (Criteria) this;
        }

        public Criteria andContractexpirationdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("contractexpirationdate <>", value, "contractexpirationdate");
            return (Criteria) this;
        }

        public Criteria andContractexpirationdateGreaterThan(Date value) {
            addCriterionForJDBCDate("contractexpirationdate >", value, "contractexpirationdate");
            return (Criteria) this;
        }

        public Criteria andContractexpirationdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contractexpirationdate >=", value, "contractexpirationdate");
            return (Criteria) this;
        }

        public Criteria andContractexpirationdateLessThan(Date value) {
            addCriterionForJDBCDate("contractexpirationdate <", value, "contractexpirationdate");
            return (Criteria) this;
        }

        public Criteria andContractexpirationdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contractexpirationdate <=", value, "contractexpirationdate");
            return (Criteria) this;
        }

        public Criteria andContractexpirationdateIn(List<Date> values) {
            addCriterionForJDBCDate("contractexpirationdate in", values, "contractexpirationdate");
            return (Criteria) this;
        }

        public Criteria andContractexpirationdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("contractexpirationdate not in", values, "contractexpirationdate");
            return (Criteria) this;
        }

        public Criteria andContractexpirationdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contractexpirationdate between", value1, value2, "contractexpirationdate");
            return (Criteria) this;
        }

        public Criteria andContractexpirationdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contractexpirationdate not between", value1, value2, "contractexpirationdate");
            return (Criteria) this;
        }

        public Criteria andContractcontentsIsNull() {
            addCriterion("contractcontents is null");
            return (Criteria) this;
        }

        public Criteria andContractcontentsIsNotNull() {
            addCriterion("contractcontents is not null");
            return (Criteria) this;
        }

        public Criteria andContractcontentsEqualTo(String value) {
            addCriterion("contractcontents =", value, "contractcontents");
            return (Criteria) this;
        }

        public Criteria andContractcontentsNotEqualTo(String value) {
            addCriterion("contractcontents <>", value, "contractcontents");
            return (Criteria) this;
        }

        public Criteria andContractcontentsGreaterThan(String value) {
            addCriterion("contractcontents >", value, "contractcontents");
            return (Criteria) this;
        }

        public Criteria andContractcontentsGreaterThanOrEqualTo(String value) {
            addCriterion("contractcontents >=", value, "contractcontents");
            return (Criteria) this;
        }

        public Criteria andContractcontentsLessThan(String value) {
            addCriterion("contractcontents <", value, "contractcontents");
            return (Criteria) this;
        }

        public Criteria andContractcontentsLessThanOrEqualTo(String value) {
            addCriterion("contractcontents <=", value, "contractcontents");
            return (Criteria) this;
        }

        public Criteria andContractcontentsLike(String value) {
            addCriterion("contractcontents like", value, "contractcontents");
            return (Criteria) this;
        }

        public Criteria andContractcontentsNotLike(String value) {
            addCriterion("contractcontents not like", value, "contractcontents");
            return (Criteria) this;
        }

        public Criteria andContractcontentsIn(List<String> values) {
            addCriterion("contractcontents in", values, "contractcontents");
            return (Criteria) this;
        }

        public Criteria andContractcontentsNotIn(List<String> values) {
            addCriterion("contractcontents not in", values, "contractcontents");
            return (Criteria) this;
        }

        public Criteria andContractcontentsBetween(String value1, String value2) {
            addCriterion("contractcontents between", value1, value2, "contractcontents");
            return (Criteria) this;
        }

        public Criteria andContractcontentsNotBetween(String value1, String value2) {
            addCriterion("contractcontents not between", value1, value2, "contractcontents");
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