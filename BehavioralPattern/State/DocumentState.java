package DesignPatterns.BehavioralPattern.State;

 enum DocumentState {
    NEW,SUBMITTED,APPROVED,REJECTED
}
class DocumentService{
    private DocumentState state;


    public void setState(DocumentState state) {
        this.state = state;
    }


    public void handleRequest(){
        // seem like Factory
        switch (state) {
            case NEW:
                System.out.println("Create a new document");
                break;
            case SUBMITTED:
                System.out.println("Submitted");
                break;
            case APPROVED:
                System.out.println("Approved");
                break;
            case REJECTED:
                System.out.println("Rejected");
                break;
     
            default:
                break;
            }
        }
    }
class documentApp{
    public static void main(String[] args) {
        DocumentService  service = new DocumentService();
        service.setState(DocumentState.NEW);
        service.handleRequest();
    }
}

