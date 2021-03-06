package org.sakai.daointerfaces;

import java.util.List;

import org.sakai.commons.Assignment;
import org.sakai.commons.AssignmentSolution;


public interface IAssignmentDAO {
	public void create(Assignment a);
	public void update(Assignment a);
	public Assignment get(long id);
	public void delete(Assignment a);
	public Assignment load(long id);
	public List<AssignmentSolution> listAssignmentStudent(long student_id, long section_id);
	public AssignmentSolution getAssignmentStudent(long student_id, long assignment_id);
	public List<Assignment> getAssignmentList(long sectionId);
}
