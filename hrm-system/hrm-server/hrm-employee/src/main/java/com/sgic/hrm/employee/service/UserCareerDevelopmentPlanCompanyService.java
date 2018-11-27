package com.sgic.hrm.employee.service;

import java.util.List;
import com.sgic.hrm.commons.entity.UserCareerDevelopmentPlanCompany;

public interface UserCareerDevelopmentPlanCompanyService {
  
  boolean addUserCareerDevelopmentPlanCompany(UserCareerDevelopmentPlanCompany careerDevelopmentPlanCompany);

  List<UserCareerDevelopmentPlanCompany> getUserCareerDevelopmentPlanCompany();

  boolean editCareerDevelopmentPlanSelf(UserCareerDevelopmentPlanCompany careerDevelopmentPlanCompany, Integer id);

  boolean deleteUserCareerDevelopmentPlanCompany(Integer id);

  UserCareerDevelopmentPlanCompany getUserCareerDevelopmentPlanCompanyById(Integer id);
}
