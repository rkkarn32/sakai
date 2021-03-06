package org.sakai.serviceclients;

import java.util.List;

import org.sakai.commons.Assignment;
import org.sakai.commons.AssignmentSolution;
import org.sakai.commons.Section;
import org.sakai.commons.Student;
import org.sakai.commons.Teacher;


public interface IFacultyService {
	public List<Section> getSecctions(long id);
	public List<Student> getStudents(long sectionId);
	
	public void CreateAssignment(long sectionId,Assignment assignment);
	public List<Assignment> getAssignments(long sectionId);
	public Assignment getAssignment(long sectionId);
	
	public List<AssignmentSolution> getAssignmentStudentList(long assignmentId);
	public AssignmentSolution getAssignmentStudent(long assignmentStudentId);
	public void UpdateAssignmnetStudent(AssignmentSolution as);
	
	public Teacher getTeacher(long id);
	
	public List<Teacher> getFaculties();
}
