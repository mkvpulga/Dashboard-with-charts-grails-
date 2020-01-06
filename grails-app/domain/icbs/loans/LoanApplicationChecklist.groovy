package icbs.loans

import icbs.lov.CreditInvestigationChecklistType
import icbs.loans.LoanApplication

class LoanApplicationChecklist {
 String remarks
    CreditInvestigationChecklistType checklisttype
      //using in checklist values
    boolean formA1
    boolean formA2
    boolean formA3
    boolean formA4
    boolean formA5
    boolean formA6
    boolean formA7
    boolean formA8
    boolean formA9
    boolean formA10
    boolean formA11
    boolean formA12
    boolean formA13
    boolean formA14
    boolean formA15
    boolean formA16
    boolean formA17
    boolean formA18
     boolean formA19
    boolean formA20
    boolean formA21
    boolean formA22
    boolean formA23
    boolean formA24
    boolean formA25
    boolean formA26
    boolean formA27
    boolean formA28
    boolean formB1
    boolean formB2
    boolean formB3
    boolean formB4
    boolean formB5
    boolean formB6
    boolean formB7
    boolean formB8
    boolean formB9
    boolean formB10
    boolean formB11
     boolean formB12
    boolean formB13
    boolean formB14
    boolean formB15
    boolean formB16
    boolean formB17
    boolean formB18
    boolean formB19
    boolean formB20
    boolean formB21
     boolean formB22
    boolean formB23
    boolean formB24
    boolean formB25
    boolean formB26
    boolean formB27
    boolean formB28
    boolean formB29
    boolean formB30
    boolean formB31
     boolean formB32
    boolean formB33
    boolean formB34
    boolean formB35
    boolean formB36
    boolean formB37
    boolean formB38
    boolean formB39
    boolean formB40
    boolean formB41
    boolean formB42
    boolean formC1
    boolean formC2
    boolean formC3
    boolean formC4
    boolean formC5
    boolean formC6
    boolean formC7
    boolean formC8
    boolean formC9
    boolean formC10
    boolean formC11
    boolean formC12
    boolean formC13
    boolean formC14
    boolean formC15
    boolean formC16
    boolean formC17
    boolean formC18
     boolean formC19
    boolean formC20
    boolean formC21
    boolean formC22
    boolean formC23
    boolean formC24
    boolean formC25
    boolean formC26
    boolean formC27
    boolean formC28
    
    boolean slNoticeOfApproval
    boolean slCreditApprovalMemorandum
    boolean slCreditApplication
    boolean slCreditRiskRating
    boolean slCashFlowFinancialStatement
    boolean slLifeInsurance
    boolean slPromissoryNote
    boolean slDisclosureStatement
    boolean slAmortization
    boolean slDeedOfAssignment
    boolean slLoanAgreement
    boolean slLoanApplicationForm
    boolean slCreditInvestigationReport
    boolean slCreditBackgroundInvestigationReport
    boolean slCreditInvestigationFromOtherBanks
    boolean slCourtClearance
    boolean slWaiveOfConfidentiality //for change AVS -> Affidavit of Voluntary Surrender
    boolean slAuthorityToReleaseOfInformation
    boolean slClientInformationSheetBorrower
    boolean slClientInformationSheetComaker
    boolean slComakerStatement
    boolean sl2pcs2x2IdPicture
    boolean sl3CopiesOf2ValidIdsWith3OriginalSpecimenSignatureEach
    boolean slProofOfBillingBrgyClearance
    boolean sl3PayslipForThePast3Months
    boolean slCertificateOfEmployment
    boolean slIncomeTaxReturnOrBIR
     boolean slProofOfOtherSourceOfIncome
    //rg prefix stands for regular type of credit investigation
    boolean buscolNoticeOfApproval
    boolean buscolCreditApprovalMemorandum
    boolean buscolCreditApplication
    boolean buscolCreditRiskRating
    boolean buscolCashFlowFinancialStatement
    boolean buscolLifeInsurance
    boolean buscolPromissoryNote
    boolean buscolDisclosureStatement
    boolean buscolAmortization
    boolean buscolDeedOfAssignment
    boolean buscolLoanAgreement
    boolean buscolLoanApplicationForm
    boolean buscolCreditInvestigationReport
    boolean buscolCreditBackgroundInvestigationReport
    boolean buscolPictureOfBusiness
    boolean buscolCreditInvestigationFromOtherBanks
    boolean buscolCourtClearance
    boolean buscolWaiveOfConfidentiality
    boolean buscolAuthorityToReleaseOfInformation
    boolean buscolClientInformationSheetBorrower
    boolean buscolClientInformationSheetComaker
    boolean buscolComakerStatement
    boolean buscol2pcs2x2IdPicture
    boolean buscol3CopiesOf2ValidIdsWith3OriginalSpecimenSignatureEach
    boolean buscolProofOfBillingBrgyClearance
    boolean buscolBrgyPermitBusinessPermitBIRRegistration
    boolean buscolDTIRegistration
    boolean buscolIncomeTaxReturnOrBIR
    boolean buscolProofOfOtherSourceOfIncome
    boolean buscolPictureOfCollateral
    boolean buscolREMContract
    boolean buscolChattelMortgage
    boolean buscolLandTitle
    boolean buscolTaxDeclaration
    boolean buscolRealEstateTaxReceipt
    boolean buscolAbsoluteOfDeedOfSale
    boolean buscolBlueprints
    boolean buscolSpecialPowerOfAtty
    boolean buscolCertificationOfNonDelinquency
    boolean buscolCertificationFromCENRO
    boolean buscolAffidavitOfNonTenancy
    boolean buscolFireInsurancePolicyDated
   
    //sl prefix stands for Salary loan type of credit investigation
    boolean busNoticeOfApproval
    boolean busCreditApprovalMemorandum
    boolean busCreditApplication
    boolean busCreditRiskRating
    boolean busCashFlowFinancialStatement
    boolean busLifeInsurance
    boolean busPromissoryNote
    boolean busDisclosureStatement
    boolean busAmortization
    boolean busDeedOfAssignment
    boolean busLoanAgreement
    boolean busLoanApplicationForm
    boolean busCreditInvestigationReport
    boolean busCreditBackgroundInvestigationReport
     boolean busPictureOfBusiness
    boolean busCreditInvestigationFromOtherBanks
    boolean busCourtClearance
    boolean busWaiveOfConfidentiality //for change AVS -> Affidavit of Voluntary Surrender
    boolean busAuthorityToReleaseOfInformation
    boolean busClientInformationSheetBorrower
    boolean busClientInformationSheetComaker
    boolean busComakerStatement
    boolean bus2pcs2x2IdPicture
    boolean bus3CopiesOf2ValidIdsWith3OriginalSpecimenSignatureEach
    boolean busProofOfBillingBrgyClearance
    boolean busBrgyPermitBusinessPermitBIRRegistration
    boolean busDTIRegistration
    boolean busIncomeTaxReturnOrBIR
     boolean busProofOfOtherSourceOfIncome
     
      boolean houcolNoticeOfApproval
    boolean houcolCreditApprovalMemorandum
    boolean houcolCreditApplication
    boolean houcolCreditRiskRating
    boolean houcolCashFlowFinancialStatement
    boolean houcolLifeInsurance
    boolean houcolPromissoryNote
    boolean houcolDisclosureStatement
    boolean houcolAmortization
    boolean houcolDeedOfAssignment
    boolean houcolLoanAgreement
    boolean houcolLoanApplicationForm
    boolean houcolCreditInvestigationReport
    boolean houcolCreditBackgroundInvestigationReport
     boolean houcolPictureOfBusiness
    boolean houcolCreditInvestigationFromOtherBanks
    boolean houcolCourtClearance
    boolean houcolWaiveOfConfidentiality //for change AVS -> Affidavit of Voluntary Surrender
    boolean houcolAuthorityToReleaseOfInformation
    boolean houcolClientInformationSheetBorrower
    boolean houcolClientInformationSheetComaker
    boolean houcolComakerStatement
    boolean houcol2pcs2x2IdPicture
    boolean houcol3CopiesOf2ValidIdsWith3OriginalSpecimenSignatureEach
    boolean houcolProofOfBillingBrgyClearance
   boolean houcolDTIRegistration
    boolean houcolIncomeTaxReturnOrBIR
     boolean houcolProofOfOtherSourceOfIncome
     boolean houcolPictureOfCollateral //for change AVS -> Affidavit of Voluntary Surrender
    boolean houcolREMContract
    boolean houcolLandTitle
    boolean houcolTaxDeclaration
    boolean houcolRealEstateTaxReceipt
    boolean houcolAbsoluteOfDeedOfSale
    boolean houcolBlueprints
    boolean houcolSpecialPowerOfAtty
   boolean houcolCertificationOfNonDelinquency
    boolean houcolCertificationFromCENRO
    boolean houcolAffidavitOfNonTenancy
    boolean houcolFireInsurancePolicyDated
    
    LoanApplication loanApplication
    
    static constraints = {
        checklisttype nullable:true    
	 loanApplication nullable:false    
        //using in checklist values
        remarks nullable:true, size: 0..15000
           formA1 nullable:true
     formA2 nullable:true
     formA3 nullable:true
     formA4 nullable:true
     formA5 nullable:true
     formA6 nullable:true
     formA7 nullable:true
     formA8 nullable:true
     formA9 nullable:true
     formA10 nullable:true
     formA11 nullable:true
     formA12 nullable:true
     formA13 nullable:true
     formA14 nullable:true
     formA15 nullable:true
     formA16 nullable:true
     formA17 nullable:true
     formA18 nullable:true
      formA19 nullable:true
     formA20 nullable:true
     formA21 nullable:true
     formA22 nullable:true
     formA23 nullable:true
     formA24 nullable:true
     formA25 nullable:true
     formA26 nullable:true
     formA27 nullable:true
     formA28 nullable:true
     formB1 nullable:true
     formB2 nullable:true
     formB3 nullable:true
     formB4 nullable:true
     formB5 nullable:true
     formB6 nullable:true
     formB7 nullable:true
     formB8 nullable:true
     formB9 nullable:true
     formB10 nullable:true
     formB11 nullable:true
      formB12 nullable:true
     formB13 nullable:true
     formB14 nullable:true
     formB15 nullable:true
     formB16 nullable:true
     formB17 nullable:true
     formB18 nullable:true
     formB19 nullable:true
     formB20 nullable:true
     formB21 nullable:true
      formB22 nullable:true
     formB23 nullable:true
     formB24 nullable:true
     formB25 nullable:true
     formB26 nullable:true
     formB27 nullable:true
     formB28 nullable:true
     formB29 nullable:true
     formB30 nullable:true
     formB31 nullable:true
      formB32 nullable:true
     formB33 nullable:true
     formB34 nullable:true
     formB35 nullable:true
     formB36 nullable:true
     formB37 nullable:true
     formB38 nullable:true
     formB39 nullable:true
     formB40 nullable:true
     formB41 nullable:true
     formB42 nullable:true
     formC1 nullable:true
     formC2 nullable:true
     formC3 nullable:true
     formC4 nullable:true
     formC5 nullable:true
     formC6 nullable:true
     formC7 nullable:true
     formC8 nullable:true
     formC9 nullable:true
     formC10 nullable:true
     formC11 nullable:true
     formC12 nullable:true
     formC13 nullable:true
     formC14 nullable:true
     formC15 nullable:true
     formC16 nullable:true 
     formC17 nullable:true
     formC18 nullable:true
      formC19 nullable:true
     formC20 nullable:true 
     formC21 nullable:true
     formC22 nullable:true
     formC23 nullable:true 
     formC24 nullable:true
     formC25 nullable:true
     formC26 nullable:true
     formC27 nullable:true
     formC28 nullable:true
    //mf prefix stands for micro finance type of credit investigation
     slNoticeOfApproval nullable:true
     slCreditApprovalMemorandum nullable:true
     slCreditApplication nullable:true
     slCreditRiskRating nullable:true
     slCashFlowFinancialStatement nullable:true
     slLifeInsurance nullable:true
     slPromissoryNote nullable:true
     slDisclosureStatement nullable:true
     slAmortization nullable:true
     slDeedOfAssignment nullable:true
     slLoanAgreement nullable:true
     slLoanApplicationForm nullable:true
     slCreditInvestigationReport nullable:true
     slCreditBackgroundInvestigationReport nullable:true
     slCreditInvestigationFromOtherBanks nullable:true
     slCourtClearance nullable:true
     slWaiveOfConfidentiality nullable:true //for change AVS -> Affidavit of Voluntary Surrender
     slAuthorityToReleaseOfInformation nullable:true
     slClientInformationSheetBorrower nullable:true
     slClientInformationSheetComaker nullable:true
     slComakerStatement nullable:true
     sl2pcs2x2IdPicture nullable:true
     sl3CopiesOf2ValidIdsWith3OriginalSpecimenSignatureEach nullable:true
     slProofOfBillingBrgyClearance nullable:true
     sl3PayslipForThePast3Months nullable:true
     slCertificateOfEmployment nullable:true
     slIncomeTaxReturnOrBIR nullable:true
      slProofOfOtherSourceOfIncome nullable:true
    //rg prefix stands for regular type of credit investigation nullable:true
     buscolNoticeOfApproval nullable:true
     buscolCreditApprovalMemorandum nullable:true
     buscolCreditApplication nullable:true
     buscolCreditRiskRating nullable:true
     buscolCashFlowFinancialStatement nullable:true
     buscolLifeInsurance nullable:true
     buscolPromissoryNote nullable:true
     buscolDisclosureStatement nullable:true
     buscolAmortization nullable:true
     buscolDeedOfAssignment nullable:true
     buscolLoanAgreement nullable:true
     buscolLoanApplicationForm nullable:true
     buscolCreditInvestigationReport nullable:true
     buscolCreditBackgroundInvestigationReport nullable:true
     buscolPictureOfBusiness nullable:true
     buscolCreditInvestigationFromOtherBanks nullable:true
     buscolCourtClearance nullable:true
     buscolWaiveOfConfidentiality nullable:true
     buscolAuthorityToReleaseOfInformation nullable:true
     buscolClientInformationSheetBorrower nullable:true
     buscolClientInformationSheetComaker nullable:true
     buscolComakerStatement nullable:true
     buscol2pcs2x2IdPicture nullable:true
     buscol3CopiesOf2ValidIdsWith3OriginalSpecimenSignatureEach nullable:true 
     buscolProofOfBillingBrgyClearance nullable:true
     buscolBrgyPermitBusinessPermitBIRRegistration nullable:true
     buscolDTIRegistration nullable:true
     buscolIncomeTaxReturnOrBIR nullable:true
     buscolProofOfOtherSourceOfIncome nullable:true
     buscolPictureOfCollateral nullable:true
     buscolREMContract nullable:true
     buscolChattelMortgage nullable:true
     buscolLandTitle nullable:true
     buscolTaxDeclaration nullable:true
     buscolRealEstateTaxReceipt nullable:true
     buscolAbsoluteOfDeedOfSale nullable:true
     buscolBlueprints nullable:true
     buscolSpecialPowerOfAtty nullable:true
     buscolCertificationOfNonDelinquency nullable:true
     buscolCertificationFromCENRO nullable:true
     buscolAffidavitOfNonTenancy nullable:true
     buscolFireInsurancePolicyDated nullable:true
    
    //sl prefix stands for Salary loan type of credit investigation
     busNoticeOfApproval nullable:true
     busCreditApprovalMemorandum nullable:true
     busCreditApplication nullable:true
     busCreditRiskRating nullable:true
     busCashFlowFinancialStatement nullable:true
     busLifeInsurance nullable:true
     busPromissoryNote nullable:true
     busDisclosureStatement nullable:true
     busAmortization nullable:true
     busDeedOfAssignment nullable:true
     busLoanAgreement nullable:true
     busLoanApplicationForm nullable:true
     busCreditInvestigationReport nullable:true
     busCreditBackgroundInvestigationReport nullable:true
     busPictureOfBusiness nullable:true
     busCreditInvestigationFromOtherBanks nullable:true
     busCourtClearance nullable:true
     busWaiveOfConfidentiality nullable:true //for change AVS -> Affidavit of Voluntary Surrender
     busAuthorityToReleaseOfInformation nullable:true
     busClientInformationSheetBorrower nullable:true
     busClientInformationSheetComaker nullable:true
     busComakerStatement nullable:true
     bus2pcs2x2IdPicture nullable:true
     bus3CopiesOf2ValidIdsWith3OriginalSpecimenSignatureEach nullable:true
     busProofOfBillingBrgyClearance nullable:true
     busBrgyPermitBusinessPermitBIRRegistration nullable:true
     busDTIRegistration nullable:true
     busIncomeTaxReturnOrBIR nullable:true
      busProofOfOtherSourceOfIncome nullable:true
      
             houcolNoticeOfApproval nullable:true
     houcolCreditApprovalMemorandum nullable:true
     houcolCreditApplication nullable:true
     houcolCreditRiskRating nullable:true
     houcolCashFlowFinancialStatement nullable:true
     houcolLifeInsurance nullable:true
     houcolPromissoryNote nullable:true
     houcolDisclosureStatement nullable:true
     houcolAmortization nullable:true
     houcolDeedOfAssignment nullable:true
     houcolLoanAgreement nullable:true
     houcolLoanApplicationForm nullable:true
     houcolCreditInvestigationReport nullable:true
     houcolCreditBackgroundInvestigationReport nullable:true
      houcolPictureOfBusiness nullable:true
     houcolCreditInvestigationFromOtherBanks nullable:true
     houcolCourtClearance nullable:true
     houcolWaiveOfConfidentiality  nullable:true
     houcolAuthorityToReleaseOfInformation nullable:true
     houcolClientInformationSheetBorrower nullable:true
     houcolClientInformationSheetComaker nullable:true
     houcolComakerStatement nullable:true
     houcol2pcs2x2IdPicture nullable:true
     houcol3CopiesOf2ValidIdsWith3OriginalSpecimenSignatureEach nullable:true
     houcolProofOfBillingBrgyClearance nullable:true
    houcolDTIRegistration nullable:true
     houcolIncomeTaxReturnOrBIR nullable:true
      houcolProofOfOtherSourceOfIncome nullable:true
      houcolPictureOfCollateral nullable:true
     houcolREMContract nullable:true
     houcolLandTitle nullable:true
     houcolTaxDeclaration nullable:true
     houcolRealEstateTaxReceipt nullable:true
     houcolAbsoluteOfDeedOfSale nullable:true
     houcolBlueprints nullable:true
     houcolSpecialPowerOfAtty nullable:true
    houcolCertificationOfNonDelinquency nullable:true
     houcolCertificationFromCENRO nullable:true
     houcolAffidavitOfNonTenancy nullable:true
     houcolFireInsurancePolicyDated nullable:true
        
    }
     static mapping = {
    	id sqlType: "int", generator: "increment"
    	loanApplication sqlType: "int"
        remarks    sqlType: 'text' 
    }
}