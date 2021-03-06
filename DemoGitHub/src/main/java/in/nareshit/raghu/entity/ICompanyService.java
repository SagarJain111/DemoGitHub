package in.nareshit.raghu.entity;

import java.util.List;

public interface ICompanyService {
	Long createCompany(Company cob);

	void updateCompany(Company cob);

	Company getOneCompany(Long id);

	List<Company> getAllCompanies();

}
