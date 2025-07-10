package model;


public class MemberWithEnrollmentDTO {
    
    private Member member;
    private Enrollment enrollment;

    public MemberWithEnrollmentDTO() {
    }
    
    public MemberWithEnrollmentDTO(MemberWithEnrollmentDTO memberWithEnrollmentDTO){
        this.member = memberWithEnrollmentDTO.getMember();
        this.enrollment = memberWithEnrollmentDTO.getEnrollment();
    }
    
    public MemberWithEnrollmentDTO(Member member, Enrollment enrollment) {
        this.member = member;
        this.enrollment = enrollment;
    }
    

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }
    
}
