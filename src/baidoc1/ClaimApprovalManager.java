package baidoc1;

public class ClaimApprovalManager {
    public void processHeadlthClaim(HealthInsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager : Valid claim. Crurrently processing claim for  approval");
        }
    }
    public void processVehicleClaim(VehicleInsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovaManager : Valid claim.Currently prosessing claim for approval...");
        }
    }
}
