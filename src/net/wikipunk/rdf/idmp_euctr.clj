(ns net.wikipunk.rdf.idmp-euctr
  "The ontology provides an instance-based seed example for some of the data related to clincal trials representation."
  {:cmns-av/copyright ["Copyright (c) 2022 Pistoia Alliance, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/EXT/Examples/EuropeanUnionClinicalTrialsRegister.rdf",
   :dcterms/abstract
   "The ontology provides an instance-based seed example for some of the data related to clincal trials representation.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :idmp-chg/hasMaturityLevel :idmp-chg/Informative,
   :owl/imports
   ["https://www.omg.org/spec/Commons/TextDatatype/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegistrationAuthorities/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/Commons/RegistrationAuthorities/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/Commons/PartiesAndSituations/"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/TerlipressinExample/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-RegistrationAuthorities/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/AmlodipineExample/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://www.omg.org/spec/Commons/Organizations/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/20221101/Examples/EuropeanUnionClinicalTrialsRegister/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-ge-euj"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-org" "https://www.omg.org/spec/Commons/Organizations/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-ra" "https://www.omg.org/spec/Commons/RegistrationAuthorities/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-amp"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/AmlodipineExample/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "idmp-euctr"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/EuropeanUnionClinicalTrialsRegister/",
    "idmp-eura"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegistrationAuthorities/",
    "idmp-eurga"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies/",
    "idmp-mprd"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/",
    "idmp-ra"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-RegistrationAuthorities/",
    "idmp-sub"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/",
    "idmp-trlp"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/TerlipressinExample/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/EuropeanUnionClinicalTrialsRegister/",
   :rdfa/prefix "idmp-euctr",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/EuropeanUnionClinicalTrialsRegister/",
   :rdfs/label "European Union Clincal Trials Register Ontology"})

(def Aliskiren
  {:db/ident   :idmp-euctr/Aliskiren,
   :rdf/type   [:idmp-mprd/PharmaceuticalProduct :owl/NamedIndividual],
   :rdfs/label "aliskiren"})

(def AliskirenAsInvestigationalMedicinalProduct
  {:cmns-pts/isPlayedBy :idmp-euctr/AliskirenMedicinalProduct,
   :db/ident   :idmp-euctr/AliskirenAsInvestigationalMedicinalProduct,
   :rdf/type   [:idmp-mprd/InvestigationalMedicinalProduct
                :owl/NamedIndividual],
   :rdfs/label "aliskiren as investigational medicinal product"})

(def AliskirenMedicinalProduct
  {:cmns-col/comprises :idmp-euctr/Aliskiren,
   :db/ident           :idmp-euctr/AliskirenMedicinalProduct,
   :rdf/type           [:idmp-mprd/MedicinalProduct :owl/NamedIndividual],
   :rdfs/label         "aliskiren medicinal product"})

(def AluminumHydroxideAsActiveIngredient
  {:cmns-pts/isPlayedBy
   "https://gsrs.ncats.nih.gov/api/v1/substances/bba69d15-f55c-4f0d-8e24-e61b60f2a115",
   :db/ident   :idmp-euctr/AluminumHydroxideAsActiveIngredient,
   :rdf/type   [:idmp-sub/ActiveIngredient :owl/NamedIndividual],
   :rdfs/label "aluminum hydroxide as an active ingredient"})

(def AluminumPhosphateAsActiveIngredient
  {:cmns-pts/isPlayedBy
   "https://gsrs.ncats.nih.gov/api/v1/substances/beaecfe8-eccb-44ab-b842-ae2cc60ff3e4",
   :db/ident   :idmp-euctr/AluminumPhosphateAsActiveIngredient,
   :rdf/type   [:idmp-sub/ActiveIngredient :owl/NamedIndividual],
   :rdfs/label "Aluminum Phosphate as an active ingredient"})

(def ClinicalTrialAuthorization-2004-002410-11
  {:cmns-cxtdsg/appliesTo
   "https://www.clinicaltrialsregister.eu/ctr-search/trial/2004-002410-11/DE",
   :cmns-cxtdsg/isApplicableIn :lcc-3166-1/Germany,
   :db/ident :idmp-euctr/ClinicalTrialAuthorization-2004-002410-11,
   :idmp-mprd/hasAuthorizedParty
   :idmp-euctr/NovartisPharmaServicesAGAuthorizedParty,
   :idmp-mprd/hasAuthorizingParty
   :idmp-eurga/EuropeanMedicinesAgencyAsMedicinesRegulatoryAgency,
   :rdf/type [:idmp-mprd/ClinicalTrialAuthorization :owl/NamedIndividual],
   :rdfs/label "clinical trial authorization 2004-002410-11"})

(def ClinicalTrialAuthorization-2010-022372-31
  {:cmns-cxtdsg/appliesTo
   "https://www.clinicaltrialsregister.eu/ctr-search/trial/2010-022372-31/DE",
   :cmns-cxtdsg/isApplicableIn :lcc-3166-1/Germany,
   :db/ident :idmp-euctr/ClinicalTrialAuthorization-2010-022372-31,
   :idmp-mprd/hasAuthorizedParty
   :idmp-euctr/DynavaxTechnologiesCorporationAsAuthorizedParty,
   :idmp-mprd/hasAuthorizingParty
   :idmp-eurga/EuropeanMedicinesAgencyAsMedicinesRegulatoryAgency,
   :rdf/type [:idmp-mprd/ClinicalTrialAuthorization :owl/NamedIndividual],
   :rdfs/label "clinical trial authorization 2010-022372-31"})

(def ClinicalTrialAuthorization-2014-002112-16
  {:cmns-cxtdsg/appliesTo
   "https://www.clinicaltrialsregister.eu/ctr-search/trial/2014-002112-16/GB",
   :cmns-cxtdsg/isApplicableIn
   :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :db/ident :idmp-euctr/ClinicalTrialAuthorization-2014-002112-16,
   :idmp-mprd/hasAuthorizedParty
   :idmp-euctr/SheffieldTeachingHospitalsNHSFoundationTrustAuthorizedParty,
   :idmp-mprd/hasAuthorizingParty
   :idmp-eurga/EuropeanMedicinesAgencyAsMedicinesRegulatoryAgency,
   :rdf/type [:idmp-mprd/ClinicalTrialAuthorization :owl/NamedIndividual],
   :rdfs/label "clinical trial authorization 2014-002112-16"})

(def DynavaxTechnologiesCorporation
  {:db/ident   :idmp-euctr/DynavaxTechnologiesCorporation,
   :rdf/type   [:cmns-org/LegalEntity :owl/NamedIndividual],
   :rdfs/label "Dynavax Technologies Corporation"})

(def DynavaxTechnologiesCorporationAsAuthorizedParty
  {:cmns-pts/isPlayedBy :idmp-euctr/DynavaxTechnologiesCorporation,
   :db/ident   :idmp-euctr/DynavaxTechnologiesCorporationAsAuthorizedParty,
   :rdf/type   [:idmp-mprd/AuthorizedParty :owl/NamedIndividual],
   :rdfs/label "Dynavax Technologies Corporation as authorized party"})

(def DynavaxTechnologiesCorporationAsMarketingAuthorizationHolder
  {:cmns-pts/isPlayedBy :idmp-euctr/DynavaxTechnologiesCorporation,
   :db/ident
   :idmp-euctr/DynavaxTechnologiesCorporationAsMarketingAuthorizationHolder,
   :rdf/type [:idmp-mprd/MarketingAuthorizationHolder :owl/NamedIndividual],
   :rdfs/label
   "Dynavax Technologies Corporation as marketing authorization holder"})

(def EngerixBAsAuthorizedMedicinalProduct
  {:cmns-pts/isPlayedBy
   "https://www.ema.europa.eu/en/medicines/human/referrals/engerix-b",
   :db/ident   :idmp-euctr/EngerixBAsAuthorizedMedicinalProduct,
   :idmp-mprd/hasAuthorization
   :idmp-euctr/EngerixBMarketingAuthorizationInEuropeanUnion,
   :rdf/type   [:idmp-mprd/AuthorizedMedicinalProduct :owl/NamedIndividual],
   :rdfs/label "Engerix B as authorized medicinal product"})

(def EngerixBAsInvestigationalMedicinalProduct
  {:cmns-pts/isPlayedBy
   "https://www.ema.europa.eu/en/medicines/human/referrals/engerix-b",
   :db/ident   :idmp-euctr/EngerixBAsInvestigationalMedicinalProduct,
   :rdf/type   [:idmp-mprd/InvestigationalMedicinalProduct
                :owl/NamedIndividual],
   :rdfs/label "Engerix B as investigational medicinal product"})

(def EngerixBMarketingAuthorizationInEuropeanUnion
  {:cmns-cxtdsg/appliesTo :idmp-euctr/EngerixBAsAuthorizedMedicinalProduct,
   :cmns-cxtdsg/isApplicableIn :cmns-ge-euj/EuropeanUnionJurisdiction,
   :db/ident :idmp-euctr/EngerixBMarketingAuthorizationInEuropeanUnion,
   :idmp-mprd/hasAuthorizedParty
   :idmp-euctr/GlaxoSmithKlineBiologicalsAsMarketingAuthorizationHolder,
   :idmp-mprd/hasAuthorizingParty
   :idmp-eurga/EuropeanMedicinesAgencyAsMedicinesRegulatoryAgency,
   :rdf/type [:idmp-mprd/MarketingAuthorization :owl/NamedIndividual],
   :rdfs/label "Engerix B Market Authorization in European Union"})

(def EngerixBPharmaceuticalProduct
  {:cmns-col/comprises [:idmp-euctr/HepatitisBSurfaceAntigenAsActiveIngredient
                        :idmp-euctr/AluminumHydroxideAsActiveIngredient],
   :db/ident           :idmp-euctr/EngerixBPharmaceuticalProduct,
   :rdf/type           [:idmp-mprd/PharmaceuticalProduct :owl/NamedIndividual],
   :rdfs/label         "Engerix B PP"})

(def EudraClinicalTrialsNumber-2004-002410-11
  {:cmns-id/identifies
   "https://www.clinicaltrialsregister.eu/ctr-search/trial/2004-002410-11/DE",
   :cmns-txt/hasTextValue "2004-002410-11",
   :db/ident :idmp-euctr/EudraClinicalTrialsNumber-2004-002410-11,
   :rdf/type [:idmp-eura/EudraClinicalTrialsNumber :owl/NamedIndividual],
   :rdfs/label "Eudra clinical trials number 2004-002410-11"})

(def EudraClinicalTrialsNumber-2010-022372-31
  {:cmns-id/identifies
   "https://www.clinicaltrialsregister.eu/ctr-search/trial/2010-022372-31/DE",
   :cmns-txt/hasTextValue "2010-022372-31",
   :db/ident :idmp-euctr/EudraClinicalTrialsNumber-2010-022372-31,
   :rdf/type [:idmp-eura/EudraClinicalTrialsNumber :owl/NamedIndividual],
   :rdfs/label "Eudra clinical trials number 2010-022372-31"})

(def EudraClinicalTrialsNumber-2014-002112-16
  {:cmns-id/identifies
   "https://www.clinicaltrialsregister.eu/ctr-search/trial/2014-002112-16/GB",
   :cmns-txt/hasTextValue "2014-002112-16",
   :db/ident :idmp-euctr/EudraClinicalTrialsNumber-2014-002112-16,
   :rdf/type [:idmp-eura/EudraClinicalTrialsNumber :owl/NamedIndividual],
   :rdfs/label "Eudra clinical trials number 2014-002112-16"})

(def FendrixAsAuthorizedMedicinalProduct
  {:cmns-pts/isPlayedBy
   "https://www.ema.europa.eu/en/medicines/human/EPAR/fendrix",
   :db/ident   :idmp-euctr/FendrixAsAuthorizedMedicinalProduct,
   :idmp-mprd/hasAuthorization
   :idmp-euctr/FendrixMarketingAuthorizationInEuropeanUnion,
   :rdf/type   [:idmp-mprd/AuthorizedMedicinalProduct :owl/NamedIndividual],
   :rdfs/label "Fedrix as authorized medicinal product"})

(def FendrixAsInvestigationalMedicinalProduct
  {:cmns-pts/isPlayedBy
   "https://www.ema.europa.eu/en/medicines/human/EPAR/fendrix",
   :db/ident   :idmp-euctr/FendrixAsInvestigationalMedicinalProduct,
   :rdf/type   [:idmp-mprd/InvestigationalMedicinalProduct
                :owl/NamedIndividual],
   :rdfs/label "Fedrix as investigational medicinal product"})

(def FendrixMarketingAuthorizationInEuropeanUnion
  {:cmns-cxtdsg/appliesTo :idmp-euctr/FendrixAsAuthorizedMedicinalProduct,
   :cmns-cxtdsg/isApplicableIn :cmns-ge-euj/EuropeanUnion,
   :db/ident :idmp-euctr/FendrixMarketingAuthorizationInEuropeanUnion,
   :idmp-mprd/hasAuthorizedParty
   :idmp-euctr/GlaxoSmithKlineBiologicalsAsMarketingAuthorizationHolder,
   :idmp-mprd/hasAuthorizingParty
   :idmp-eurga/EuropeanMedicinesAgencyAsMedicinesRegulatoryAgency,
   :rdf/type [:idmp-mprd/MarketingAuthorization :owl/NamedIndividual],
   :rdfs/label "Fedrix Market Authorization in European Union"})

(def FendrixPharmaceuticalProduct
  {:cmns-col/comprises
   [:idmp-euctr/MonophosphorylLipidA-1-3-O-desacyl-4'AsActiveIngredient
    :idmp-euctr/HepatitisBSurfaceAntigenAsActiveIngredient
    :idmp-euctr/AluminumPhosphateAsActiveIngredient],
   :db/ident :idmp-euctr/FendrixPharmaceuticalProduct,
   :rdf/type [:idmp-mprd/PharmaceuticalProduct :owl/NamedIndividual],
   :rdfs/label "Fendrix suspension For injection in pre-filled syringe PP"})

(def GlaxoSmithKlineBiologicalsAsMarketingAuthorizationHolder
  {:cmns-pts/isPlayedBy :idmp-euctr/GlaxoSmithKlineBiologicalsSA,
   :db/ident
   :idmp-euctr/GlaxoSmithKlineBiologicalsAsMarketingAuthorizationHolder,
   :rdf/type [:idmp-mprd/MarketingAuthorizationHolder :owl/NamedIndividual],
   :rdfs/label "GlaxoSmithKline Biologicals as marketing authorization holder"})

(def GlaxoSmithKlineBiologicalsSA
  {:db/ident   :idmp-euctr/GlaxoSmithKlineBiologicalsSA,
   :rdf/type   [:cmns-org/LegalEntity :owl/NamedIndividual],
   :rdfs/label "GlaxoSmithKline Biologicals s.a."})

(def HepatitisBSurfaceAntigenAsActiveIngredient
  {:cmns-pts/isPlayedBy
   "https://gsrs.ncats.nih.gov/api/v1/substances/e67c9314-1e17-4876-a745-47f27c2169e6",
   :db/ident   :idmp-euctr/HepatitisBSurfaceAntigenAsActiveIngredient,
   :rdf/type   [:idmp-sub/ActiveIngredient :owl/NamedIndividual],
   :rdfs/label "hepatitis B surface antigen as an active ingredient"})

(def HeplisavAsInvestigationalMedicinalProduct
  {:cmns-pts/isPlayedBy
   "https://www.ema.europa.eu/en/medicines/human/withdrawn-applications/heplisav",
   :db/ident   :idmp-euctr/HeplisavAsInvestigationalMedicinalProduct,
   :rdf/type   [:idmp-mprd/InvestigationalMedicinalProduct
                :owl/NamedIndividual],
   :rdfs/label "HEPLISAV as investigational medicinal product"})

(def HeplisavPharmaceuticalProduct
  {:cmns-col/comprises :idmp-euctr/HepatitisBSurfaceAntigenAsActiveIngredient,
   :db/ident           :idmp-euctr/HeplisavPharmaceuticalProduct,
   :rdf/type           [:idmp-mprd/PharmaceuticalProduct :owl/NamedIndividual],
   :rdfs/label         "HEPLISAV suspension For injection PP"})

(def MarketingAuthorizationNumber-CPMP-1493-01
  {:cmns-id/identifies :idmp-euctr/FendrixMarketingAuthorizationInEuropeanUnion,
   :cmns-ra/isRegisteredBy
   :idmp-eurga/EuropeanMedicinesAgencyAsMedicinesRegulatoryAgency,
   :cmns-txt/hasTextValue "CPMP/1493/01",
   :db/ident           :idmp-euctr/MarketingAuthorizationNumber-CPMP-1493-01,
   :rdf/type           [:idmp-mprd/MarketingAuthorizationNumber
                        :owl/NamedIndividual],
   :rdfs/label         "marketing authorization number CPMP-1493-01"})

(def MarketingAuthorizationNumber-EMEA-H-C-000550
  {:cmns-id/identifies :idmp-euctr/FendrixMarketingAuthorizationInEuropeanUnion,
   :cmns-ra/isRegisteredBy
   :idmp-eurga/EuropeanMedicinesAgencyAsMedicinesRegulatoryAgency,
   :cmns-txt/hasTextValue "EMEA/H/C/000550",
   :db/ident           :idmp-euctr/MarketingAuthorizationNumber-EMEA-H-C-000550,
   :rdf/type           [:idmp-mprd/MarketingAuthorizationNumber
                        :owl/NamedIndividual],
   :rdfs/label         "marketing authorization number EMEA-H-C-000550"})

(def MonophosphorylLipidA-1-3-O-desacyl-4'AsActiveIngredient
  {:cmns-pts/isPlayedBy
   "https://gsrs.ncats.nih.gov/api/v1/substances/c9925b82-5d36-4e00-b54d-d3b7189625de",
   :db/ident
   :idmp-euctr/MonophosphorylLipidA-1-3-O-desacyl-4'AsActiveIngredient,
   :rdf/type [:idmp-sub/ActiveIngredient :owl/NamedIndividual],
   :rdfs/label
   "1-3-O-desacyl-4' monophosphoryl lipid A as an active ingredient"})

(def NorvascAsAuthorizedMedicinalProduct
  {:cmns-pts/isPlayedBy :idmp-amp/NorvascMedicinalProduct,
   :db/ident   :idmp-euctr/NorvascAsAuthorizedMedicinalProduct,
   :idmp-mprd/hasAuthorization
   :idmp-euctr/NorvascMarketingAuthorizationInGermany,
   :rdf/type   [:idmp-mprd/AuthorizedMedicinalProduct :owl/NamedIndividual],
   :rdfs/label "Norvasc as authorized medicinal product"})

(def NorvascAsInvestigationalMedicinalProduct
  {:cmns-pts/isPlayedBy :idmp-amp/NorvascMedicinalProduct,
   :db/ident   :idmp-euctr/NorvascAsInvestigationalMedicinalProduct,
   :rdf/type   [:idmp-mprd/InvestigationalMedicinalProduct
                :owl/NamedIndividual],
   :rdfs/label "Norvasc as investigational medicinal product"})

(def NorvascMarketingAuthorizationInGermany
  {:cmns-cxtdsg/appliesTo :idmp-euctr/NorvascAsAuthorizedMedicinalProduct,
   :cmns-cxtdsg/isApplicableIn :lcc-3166-1/Germany,
   :db/ident :idmp-euctr/NorvascMarketingAuthorizationInGermany,
   :idmp-mprd/hasAuthorizedParty
   :idmp-euctr/PfizerGmbHAsMarketingAuthorizationHolder,
   :idmp-mprd/hasAuthorizingParty
   :idmp-eurga/EuropeanMedicinesAgencyAsMedicinesRegulatoryAgency,
   :rdf/type [:idmp-mprd/MarketingAuthorization :owl/NamedIndividual],
   :rdfs/label "Norvasc Market Authorization in Germany"})

(def NovartisPharmaServicesAG
  {:db/ident   :idmp-euctr/NovartisPharmaServicesAG,
   :rdf/type   [:cmns-org/LegalEntity :owl/NamedIndividual],
   :rdfs/label "Novartis Pharma Services AG"})

(def NovartisPharmaServicesAGAuthorizedParty
  {:cmns-pts/isPlayedBy :idmp-euctr/NovartisPharmaServicesAG,
   :db/ident   :idmp-euctr/NovartisPharmaServicesAGAuthorizedParty,
   :rdf/type   [:idmp-mprd/AuthorizedParty :owl/NamedIndividual],
   :rdfs/label "Novartis Pharma Services AG as authorized party"})

(def PfizerGmbH
  {:db/ident   :idmp-euctr/PfizerGmbH,
   :rdf/type   [:cmns-org/LegalEntity :owl/NamedIndividual],
   :rdfs/label "Pfizer GmbH"})

(def PfizerGmbHAsMarketingAuthorizationHolder
  {:cmns-pts/isPlayedBy :idmp-euctr/PfizerGmbH,
   :db/ident   :idmp-euctr/PfizerGmbHAsMarketingAuthorizationHolder,
   :rdf/type   [:idmp-mprd/MarketingAuthorizationHolder :owl/NamedIndividual],
   :rdfs/label "Pfizer GmbH as marketing authorization holder"})

(def SheffieldTeachingHospitalsNHSFoundation
  {:db/ident   :idmp-euctr/SheffieldTeachingHospitalsNHSFoundation,
   :rdf/type   [:cmns-org/LegalEntity :owl/NamedIndividual],
   :rdfs/label "Sheffield Teaching Hospitals NHS Foundation Trust"})

(def SheffieldTeachingHospitalsNHSFoundationTrustAuthorizedParty
  {:cmns-pts/isPlayedBy :idmp-euctr/SheffieldTeachingHospitalsNHSFoundation,
   :db/ident
   :idmp-euctr/SheffieldTeachingHospitalsNHSFoundationTrustAuthorizedParty,
   :rdf/type [:idmp-mprd/AuthorizedParty :owl/NamedIndividual],
   :rdfs/label
   "Sheffield Teaching Hospitals NHS Foundation Trust as authorized party"})