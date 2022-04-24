package model.services;

import java.util.List;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDAO dao = DAOFactory.createDepartmentDAO();
	
	public List<Department> findAll() {
		return dao.findAll();
		
		//mock dos dados de teste
		/*List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Books"));
		list.add(new Department(2, "Computers"));
		list.add(new Department(3, "Electronics"));
		return list;*/
	}
	
	public void saveOrUpdate(Department obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		} else {
			dao.update(obj);
		}
	}
	
	public void remove(Department obj) {
		dao.deleteById(obj.getId());
	}
}
