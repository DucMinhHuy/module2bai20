package baidoc1;

public class ClaimApprovaManagerTest {
    public static void main(String[] args) {
        HealthInsuranceSurveyor healthInsuranceSurveyor=new HealthInsuranceSurveyor();
        ClaimApprovalManager claimApprovalManager=new ClaimApprovalManager();
        claimApprovalManager.processHeadlthClaim(healthInsuranceSurveyor);
        VehicleInsuranceSurveyor vehicleInsuranceSurveyor=new VehicleInsuranceSurveyor();
        ClaimApprovalManager claimApprovalManager1=new ClaimApprovalManager();
        claimApprovalManager1.processVehicleClaim(vehicleInsuranceSurveyor);
    }
}
