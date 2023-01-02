(ns net.wikipunk.rdf.idmp-eura
  "The registration authorities ontology provides the registration authorities, registries and related codes that are specific to Europe and needed for identification of substances and medicinal products."
  {:cmns-av/copyright ["Copyright (c) 2022 EDM Council, Inc."
                       "Copyright (c) 2022 Pistoia Alliance, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/EuropeanJurisdiction/EuropeanRegistrationAuthorities.rdf",
   :dcterms/abstract
   "The registration authorities ontology provides the registration authorities, registries and related codes that are specific to Europe and needed for identification of substances and medicinal products.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :idmp-chg/hasMaturityLevel :idmp-chg/Provisional,
   :owl/imports
   ["https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://www.omg.org/spec/Commons/PartiesAndSituations/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/"
    "https://www.omg.org/spec/Commons/RegistrationAuthorities/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/"
    "https://www.omg.org/spec/Commons/GovernmentEntities/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/ProductsAndServices/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/Organizations/"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/20221001/EuropeanJurisdiction/EuropeanRegistrationAuthorities/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-ge" "https://www.omg.org/spec/Commons/GovernmentEntities/",
    "cmns-ge-euj"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-org" "https://www.omg.org/spec/Commons/Organizations/",
    "cmns-prd" "https://www.omg.org/spec/Commons/ProductsAndServices/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-ra" "https://www.omg.org/spec/Commons/RegistrationAuthorities/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "idmp-eura"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegistrationAuthorities/",
    "idmp-eurga"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies/",
    "idmp-mprd"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/",
    "idmp-sub"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegistrationAuthorities/",
   :rdfa/prefix "idmp-eura",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegistrationAuthorities/",
   :rdfs/label "European Registration Authorities Ontology"})

(def ChemblDatabase
  "manually curated database of bioactive molecules with drug-like properties"
  {:cmns-av/abbreviation "ChEMBL",
   :cmns-av/directSource "https://www.ebi.ac.uk/chembl/",
   :cmns-ra/isManagedBy
   :idmp-eura/EuropeanMolecularBiologyLaboratoryEuropeanBioinformaticsInstituteRegistrationAuthority,
   :db/ident :idmp-eura/ChemblDatabase,
   :lcc-lr/hasTextualName "ChEMBL database",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "ChEMBL database",
   :skos/definition
   "manually curated database of bioactive molecules with drug-like properties"})

(def ChemicalEntitiesOfBiologicalInterest
  "freely available dictionary of molecular entities focused on 'small' chemical compounds"
  {:cmns-av/directSource "https://www.ebi.ac.uk/chebi/",
   :cmns-ra/isManagedBy
   :idmp-eura/EuropeanMolecularBiologyLaboratoryEuropeanBioinformaticsInstituteRegistrationAuthority,
   :db/ident :idmp-eura/ChemicalEntitiesOfBiologicalInterest,
   :lcc-lr/hasTextualName "Chemical Entities of Biological Interest (ChEBI)",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Chemical Entities of Biological Interest",
   :skos/definition
   "freely available dictionary of molecular entities focused on 'small' chemical compounds"})

(def ChemicalEntitiesOfBiologicalInterestEntry
  "entry in the Chemical Entities of Biological Interest, that includes the Chemical Entities of Biological Interest Identifier used in electronic listing and other regulatory activities"
  {:db/ident :idmp-eura/ChemicalEntitiesOfBiologicalInterestEntry,
   :rdf/type :owl/Class,
   :rdfs/label "Chemical Entities of Biological Interest registry entry",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :idmp-sub/Substance,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :cmns-col/comprises,
                      :owl/someValuesFrom
                      :idmp-eura/ChemicalEntitiesOfBiologicalInterestIdentifier,
                      :rdf/type :owl/Restriction}
                     {:owl/hasValue
                      :idmp-eura/ChemicalEntitiesOfBiologicalInterest,
                      :owl/onProperty :cmns-col/isIncludedIn,
                      :rdf/type :owl/Restriction}
                     :cmns-ra/RegistryEntry],
   :skos/definition
   "entry in the Chemical Entities of Biological Interest, that includes the Chemical Entities of Biological Interest Identifier used in electronic listing and other regulatory activities"})

(def ChemicalEntitiesOfBiologicalInterestIdentifier
  "numeric string that is used to identify records in the Chemical Entities of Biological Interest registry"
  {:cmns-av/synonym "ChEBI ID",
   :db/ident :idmp-eura/ChemicalEntitiesOfBiologicalInterestIdentifier,
   :rdf/type :owl/Class,
   :rdfs/label "Chemical Entities of Biological Interest identifer",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-id/identifies,
     :owl/someValuesFrom :idmp-sub/Substance,
     :rdf/type           :owl/Restriction}
    {:owl/hasValue
     :idmp-eura/EuropeanMolecularBiologyLaboratoryEuropeanBioinformaticsInstituteRegistrationAuthority,
     :owl/onProperty :cmns-ra/hasRegistrationAuthority,
     :rdf/type :owl/Restriction}
    {:owl/hasValue   :idmp-eura/ChemicalEntitiesOfBiologicalInterest,
     :owl/onProperty :cmns-ra/isRegisteredIn,
     :rdf/type       :owl/Restriction}
    :idmp-sub/SubstanceCode],
   :skos/definition
   "numeric string that is used to identify records in the Chemical Entities of Biological Interest registry"})

(def EudraClinicalTrialsNumber
  "unique code assigned to clinical trials in the EU Clinical Trials Register"
  {:cmns-av/abbreviation "EudraCT Number",
   :db/ident :idmp-eura/EudraClinicalTrialsNumber,
   :rdf/type :owl/Class,
   :rdfs/label "Eudra clinical trials number",
   :rdfs/subClassOf
   [{:owl/hasValue   :idmp-eura/EuropeanUnionClinicalTrialsRegister,
     :owl/onProperty :cmns-ra/isRegisteredIn,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue   :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
     :owl/onProperty :cmns-ra/hasRegistrationAuthority,
     :rdf/type       :owl/Restriction}
    :idmp-mprd/ClinicalTrialIdentifier],
   :skos/definition
   "unique code assigned to clinical trials in the EU Clinical Trials Register"})

(def EudraVigilanceCode
  "unique code assigned to any substance entered in the eXtended EudraVigilance Medicinal Product Dictionary (XEVMPD)"
  {:cmns-av/abbreviation ["EVMPD Code" "EV Code" "XEVMPD Code"],
   :cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.1.7",
   :db/ident :idmp-eura/EudraVigilanceCode,
   :rdf/type :owl/Class,
   :rdfs/label "EudraVigilance code",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-id/identifies,
     :owl/someValuesFrom :idmp-sub/Substance,
     :rdf/type           :owl/Restriction}
    {:owl/hasValue   :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
     :owl/onProperty :cmns-ra/hasRegistrationAuthority,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue :idmp-eura/ExtendedEudraVigilanceMedicinalProductDictionary,
     :owl/onProperty :cmns-ra/isRegisteredIn,
     :rdf/type :owl/Restriction}
    :idmp-sub/SubstanceCode],
   :skos/definition
   "unique code assigned to any substance entered in the eXtended EudraVigilance Medicinal Product Dictionary (XEVMPD)",
   :skos/note
   ["The XEVMPD is a format to electronically submit to the European Medicines Agency (EMA) information on substances, referentials and medicinal products for human use authorized in the European Union as referred into the Article 57 (2) of the regulation 726/2004. It was developed by the EMA in collaboration with the EudraVigilance implementation fora."
    "An EV Code for a substance is generated after the substance has been inserted successfully in the XEVMPD via an eXtended EudraVigilance Product Report Message (XEVPRM)."]})

(def EuropeanChemicalsAgencyRegistrationAuthority
  "European Chemicals Agency in its role as a Registration Authority (RA)"
  {:cmns-pts/isPlayedBy :idmp-eurga/EuropeanChemicalsAgency,
   :cmns-ra/manages
   :idmp-eura/EuropeanInventoryOfExistingCommercialChemicalSubstances,
   :db/ident :idmp-eura/EuropeanChemicalsAgencyRegistrationAuthority,
   :rdf/type [:cmns-ra/RegistrationAuthority :owl/NamedIndividual],
   :rdfs/label "European Chemicals Agency registration authority",
   :skos/definition
   "European Chemicals Agency in its role as a Registration Authority (RA)"})

(def EuropeanCommissionFoodAdditivesDatabase
  "database that informs about the food additives approved for use in food in the EU and their conditions of use"
  {:cmns-av/directSource
   "https://ec.europa.eu/food/safety/food-improvement-agents/additives/database_en",
   :cmns-av/explanatoryNote "It is based on the Union list of food additives.",
   :cmns-ra/isManagedBy
   :idmp-eura/EuropeanDirectorateForTheQualityOfMedicinesAndHealthcareRegistrationAuthority,
   :db/ident :idmp-eura/EuropeanCommissionFoodAdditivesDatabase,
   :lcc-lr/hasTextualName "European Commission Food Additives Database",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "European Commission Food Additives Database",
   :skos/definition
   "database that informs about the food additives approved for use in food in the EU and their conditions of use"})

(def EuropeanCommissionScientificCommitteeOnConsumerSafetyOpinions
  "registry that provides opinions on health and safety risks (chemical, biological, mechanical and other physical risks) of non-food consumer products (e.g. cosmetic products and their ingredients, toys, textiles, clothing, personal care and household products) and services (e.g. tattooing, artificial sun tanning)"
  {:cmns-av/directSource
   "https://ec.europa.eu/health/scientific-committees/scientific-committee-consumer-safety-sccs_en",
   :cmns-ra/isManagedBy
   :idmp-eura/EuropeanCommissionScientificCommitteeOnConsumerSafetyRegistrationAuthority,
   :db/ident
   :idmp-eura/EuropeanCommissionScientificCommitteeOnConsumerSafetyOpinions,
   :lcc-lr/hasTextualName
   "European Commission Scientific Committee on Consumer Safety Opinions",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label
   "European Commission Scientific Committee on Consumer Safety Opinions",
   :skos/definition
   "registry that provides opinions on health and safety risks (chemical, biological, mechanical and other physical risks) of non-food consumer products (e.g. cosmetic products and their ingredients, toys, textiles, clothing, personal care and household products) and services (e.g. tattooing, artificial sun tanning)"})

(def EuropeanCommissionScientificCommitteeOnConsumerSafetyRegistrationAuthority
  "European Commission Scientific Committee on Consumer Safety in its role as a Registration Authority (RA)"
  {:cmns-pts/isPlayedBy
   :idmp-eurga/EuropeanCommissionScientificCommitteeOnConsumerSafety,
   :cmns-ra/manages
   :idmp-eura/EuropeanCommissionScientificCommitteeOnConsumerSafetyOpinions,
   :db/ident
   :idmp-eura/EuropeanCommissionScientificCommitteeOnConsumerSafetyRegistrationAuthority,
   :rdf/type [:cmns-ra/RegistrationAuthority :owl/NamedIndividual],
   :rdfs/label
   "European Commission Scientific Committee on Consumer Safety registration authority",
   :skos/definition
   "European Commission Scientific Committee on Consumer Safety in its role as a Registration Authority (RA)"})

(def EuropeanCommunityNumber
  "unique seven digit identifer assigned to substances for regulatory purposes by the European Chemicals Agency"
  {:cmns-av/synonym "EC number",
   :db/ident :idmp-eura/EuropeanCommunityNumber,
   :rdf/type :owl/Class,
   :rdfs/label "European community number",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-id/identifies,
     :owl/someValuesFrom :idmp-sub/Substance,
     :rdf/type           :owl/Restriction}
    {:owl/hasValue
     :idmp-eura/EuropeanInventoryOfExistingCommercialChemicalSubstances,
     :owl/onProperty :cmns-ra/isRegisteredIn,
     :rdf/type :owl/Restriction}
    {:owl/hasValue   :idmp-eura/EuropeanChemicalsAgencyRegistrationAuthority,
     :owl/onProperty :cmns-ra/hasRegistrationAuthority,
     :rdf/type       :owl/Restriction}
    :idmp-sub/SubstanceCode],
   :skos/definition
   "unique seven digit identifer assigned to substances for regulatory purposes by the European Chemicals Agency"})

(def EuropeanDirectorateForTheQualityOfMedicinesAndHealthcareKnowledgeDatabase
  "repository managed by the European Directorate for the Quality of Medicines and Healthcare that provides information on a given substance or general method of analysis"
  {:cmns-av/directSource "https://www.edqm.eu/en/knowledge-database",
   :cmns-ra/isManagedBy
   :idmp-eura/EuropeanDirectorateForTheQualityOfMedicinesAndHealthcareRegistrationAuthority,
   :db/ident
   :idmp-eura/EuropeanDirectorateForTheQualityOfMedicinesAndHealthcareKnowledgeDatabase,
   :lcc-lr/hasTextualName
   "European Directorate for the Quality of Medicines and Healthcare Knowledge Database",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label
   "European Directorate for the Quality of Medicines and Healthcare Knowledge Database",
   :skos/definition
   "repository managed by the European Directorate for the Quality of Medicines and Healthcare that provides information on a given substance or general method of analysis"})

(def
  EuropeanDirectorateForTheQualityOfMedicinesAndHealthcareRegistrationAuthority
  "European Directorate for the Quality of Medicines and Healthcare in its role as a Registration Authority (RA)"
  {:cmns-pts/isPlayedBy
   :idmp-eurga/EuropeanDirectorateForTheQualityOfMedicinesAndHealthcare,
   :cmns-ra/manages
   [:idmp-eura/EuropeanDirectorateForTheQualityOfMedicinesAndHealthcareKnowledgeDatabase
    :idmp-eura/EuropeanCommissionFoodAdditivesDatabase],
   :db/ident
   :idmp-eura/EuropeanDirectorateForTheQualityOfMedicinesAndHealthcareRegistrationAuthority,
   :rdf/type [:cmns-ra/RegistrationAuthority :owl/NamedIndividual],
   :rdfs/label
   "European Directorate for the Quality of Medicines and Healthcare registration authority",
   :skos/definition
   "European Directorate for the Quality of Medicines and Healthcare in its role as a Registration Authority (RA)"})

(def EuropeanInventoryOfExistingCommercialChemicalSubstances
  "legacy repository consisting of an inventory of substances that were deemed to be available on the European Community market between 1 January 1971 and 18 September 1981"
  {:cmns-av/abbreviation "EINECS",
   :cmns-av/directSource
   "https://echa.europa.eu/information-on-chemicals/ec-inventory",
   :cmns-ra/isManagedBy :idmp-eura/EuropeanChemicalsAgencyRegistrationAuthority,
   :db/ident :idmp-eura/EuropeanInventoryOfExistingCommercialChemicalSubstances,
   :lcc-lr/hasTextualName
   "EINECS (European inventory of existing commercial chemical substances)",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "European inventory of existing commercial chemical substances",
   :skos/definition
   "legacy repository consisting of an inventory of substances that were deemed to be available on the European Community market between 1 January 1971 and 18 September 1981"})

(def EuropeanInventoryOfExistingCommercialChemicalSubstancesEntry
  "entry in the European Inventory of Existing Commercial chemical Substances, that includes the European Community Number used in electronic listing and other regulatory activities"
  {:cmns-av/abbreviation "EINECS entry",
   :db/ident
   :idmp-eura/EuropeanInventoryOfExistingCommercialChemicalSubstancesEntry,
   :rdf/type :owl/Class,
   :rdfs/label
   "European inventory of existing commercial chemical substances entry",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :idmp-sub/Substance,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-col/comprises,
     :owl/someValuesFrom :idmp-eura/EuropeanCommunityNumber,
     :rdf/type           :owl/Restriction}
    {:owl/hasValue
     :idmp-eura/EuropeanInventoryOfExistingCommercialChemicalSubstances,
     :owl/onProperty :cmns-col/isIncludedIn,
     :rdf/type :owl/Restriction}
    :cmns-ra/RegistryEntry],
   :skos/definition
   "entry in the European Inventory of Existing Commercial chemical Substances, that includes the European Community Number used in electronic listing and other regulatory activities"})

(def EuropeanMedicinesAgencyRegistrationAuthority
  "European Medicines Agency (EMA) in its role as a Registration Authority (RA), which is a function of the eXtended EudraVigilance Medicinal Product Dictionary (XEVMPD) for registration of substances"
  {:cmns-av/abbreviation "EMA XEVMPD RA",
   :cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.1.7",
   :cmns-pts/isPlayedBy :idmp-eurga/EuropeanMedicinesAgency,
   :cmns-ra/manages [:idmp-eura/EuropeanPublicAssessmentReports
                     :idmp-eura/ExtendedEudraVigilanceMedicinalProductDictionary
                     :idmp-eura/SummaryOfProductCharacteristics
                     :idmp-eura/EuropeanUnionClinicalTrialsRegister],
   :db/ident :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
   :rdf/type [:cmns-ra/RegistrationAuthority :owl/NamedIndividual],
   :rdfs/label "European Medicines Agency Registration Authority",
   :skos/definition
   "European Medicines Agency (EMA) in its role as a Registration Authority (RA), which is a function of the eXtended EudraVigilance Medicinal Product Dictionary (XEVMPD) for registration of substances"})

(def EuropeanMolecularBiologyLaboratory
  "supranational entity and not-for-profit organization that is Europe's leading life sciences laboratory, operating six sites across Europe each with its own research units, services and facilities"
  {:cmns-av/abbreviation "EMBL",
   :db/ident :idmp-eura/EuropeanMolecularBiologyLaboratory,
   :rdf/type [:cmns-ge/SupranationalEntity :owl/NamedIndividual],
   :rdfs/label "European Molecular Biology Laboratory",
   :rdfs/seeAlso "https://www.embl.org/about/",
   :skos/definition
   "supranational entity and not-for-profit organization that is Europe's leading life sciences laboratory, operating six sites across Europe each with its own research units, services and facilities"})

(def EuropeanMolecularBiologyLaboratoryEuropeanBioinformaticsInstitute
  "institute that is part of the European Molecular Biology Laboratory that helps scientists realise the potential of big data in biology, exploiting complex information to make discoveries that benefit humankind"
  {:cmns-av/abbreviation "EMBL-EBI",
   :cmns-col/isPartOf :idmp-eura/EuropeanMolecularBiologyLaboratory,
   :db/ident
   :idmp-eura/EuropeanMolecularBiologyLaboratoryEuropeanBioinformaticsInstitute,
   :rdf/type [:cmns-org/OrganizationalSubUnit :owl/NamedIndividual],
   :rdfs/label
   "European Molecular Biology Laboratory, European Bioinformatics Institute",
   :rdfs/seeAlso "https://www.ebi.ac.uk/",
   :skos/definition
   "institute that is part of the European Molecular Biology Laboratory that helps scientists realise the potential of big data in biology, exploiting complex information to make discoveries that benefit humankind"})

(def
  EuropeanMolecularBiologyLaboratoryEuropeanBioinformaticsInstituteRegistrationAuthority
  "European Molecular Biology Laboratory European Bioinformatics Institute in its role as a Registration Authority (RA)"
  {:cmns-av/abbreviation "EMBL-EBI RA",
   :cmns-pts/isPlayedBy
   :idmp-eura/EuropeanMolecularBiologyLaboratoryEuropeanBioinformaticsInstitute,
   :cmns-ra/manages
   :idmp-eura/EuropeanInventoryOfExistingCommercialChemicalSubstances,
   :db/ident
   :idmp-eura/EuropeanMolecularBiologyLaboratoryEuropeanBioinformaticsInstituteRegistrationAuthority,
   :rdf/type [:cmns-ra/RegistrationAuthority :owl/NamedIndividual],
   :rdfs/label
   "European Molecular Biology Laboratory European Bioinformatics Institute registration authority",
   :skos/definition
   "European Molecular Biology Laboratory European Bioinformatics Institute in its role as a Registration Authority (RA)"})

(def EuropeanPublicAssessmentReports
  {:cmns-av/directSource
   "https://www.ema.europa.eu/en/glossary/european-public-assessment-report",
   :cmns-ra/isManagedBy :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
   :db/ident :idmp-eura/EuropeanPublicAssessmentReports,
   :lcc-lr/hasTextualName "European public assessment reports",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "european public assessment reports"})

(def EuropeanUnionClinicalTrialsRegister
  "register that contains information on interventional clinical trials on medicines conducted in the European Union (EU), or the European Economic Area (EEA) which started after 1 May 2004"
  {:cmns-av/directSource "https://www.clinicaltrialsregister.eu/about.html",
   :cmns-ra/isManagedBy :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
   :db/ident :idmp-eura/EuropeanUnionClinicalTrialsRegister,
   :lcc-lr/hasTextualName "European Union Clinical Trials Register",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "European Union Clinical Trials Register",
   :skos/definition
   "register that contains information on interventional clinical trials on medicines conducted in the European Union (EU), or the European Economic Area (EEA) which started after 1 May 2004"})

(def ExtendedEudraVigilanceMedicinalProductDictionary
  "registry that was designed to support the collection, reporting, coding and evaluation of authorized and investigational medicinal product and substance information in a standardized and structured way"
  {:cmns-av/abbreviation "XEVMPD",
   :cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.1.7",
   :cmns-ra/isManagedBy :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
   :db/ident :idmp-eura/ExtendedEudraVigilanceMedicinalProductDictionary,
   :lcc-lr/hasTextualName
   "eXtended EudraVigilance Medicinal Product Dictionary",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "eXtended EudraVigilance Medicinal Product Dictionary",
   :skos/definition
   "registry that was designed to support the collection, reporting, coding and evaluation of authorized and investigational medicinal product and substance information in a standardized and structured way"})

(def ExtendedEudraVigilanceMedicinalProductDictionaryEntry
  "entry in the eXtended EudraVigilance Medicinal Product Dictionary (XEVMPD) registry, that includes the EudraVigilance codes (EV codes) used in the electronic product dictionary and for other regulatory activities"
  {:cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.1.7",
   :db/ident :idmp-eura/ExtendedEudraVigilanceMedicinalProductDictionaryEntry,
   :rdf/type :owl/Class,
   :rdfs/label
   "eXtended EudraVigilance Medicinal Product Dictionary registry entry",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :idmp-sub/Substance,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-col/comprises,
     :owl/someValuesFrom :idmp-eura/EudraVigilanceCode,
     :rdf/type           :owl/Restriction}
    {:owl/hasValue :idmp-eura/ExtendedEudraVigilanceMedicinalProductDictionary,
     :owl/onProperty :cmns-col/isIncludedIn,
     :rdf/type :owl/Restriction}
    :cmns-ra/RegistryEntry],
   :skos/definition
   "entry in the eXtended EudraVigilance Medicinal Product Dictionary (XEVMPD) registry, that includes the EudraVigilance codes (EV codes) used in the electronic product dictionary and for other regulatory activities"})

(def ExtendedEudraVigilanceMedicinalProductDictionaryService
  "service for the collection, reporting, coding and evaluation of authorized and investigational medicinal product and substance information in a standardized and structured way"
  {:cmns-av/abbreviation "XEVMPD service",
   :cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.1.7",
   :cmns-prd/isProvidedBy
   :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
   :db/ident :idmp-eura/ExtendedEudraVigilanceMedicinalProductDictionaryService,
   :rdf/type [:cmns-ra/RegistrationService :owl/NamedIndividual],
   :rdfs/label "eXtended EudraVigilance Medicinal Product Dictionary service",
   :skos/definition
   "service for the collection, reporting, coding and evaluation of authorized and investigational medicinal product and substance information in a standardized and structured way"})

(def InternationalUnionOfBasicAndClinicalPharmacologyGuide
  "expert-curated resource of ligand-activity-target relationships, the majority of which come from high-quality pharmacological and medicinal chemistry literature"
  {:cmns-av/directSource "https://www.guidetopharmacology.org/",
   :db/ident :idmp-eura/InternationalUnionOfBasicAndClinicalPharmacologyGuide,
   :lcc-lr/hasTextualName
   "International Union of Basic and Clinical Pharmacology Guide",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "International Union of Basic and Clinical Pharmacology Guide",
   :skos/definition
   "expert-curated resource of ligand-activity-target relationships, the majority of which come from high-quality pharmacological and medicinal chemistry literature"})

(def SummaryOfProductCharacteristics
  "registry that contains documents describing the properties and the officially approved conditions of use of a medicine"
  {:cmns-av/abbreviation "SmPC",
   :cmns-av/directSource
   "https://www.ema.europa.eu/en/glossary/summary-product-characteristics",
   :cmns-ra/isManagedBy :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
   :db/ident :idmp-eura/SummaryOfProductCharacteristics,
   :lcc-lr/hasTextualName "Summary of Product Characteristics",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Summary of Product Characteristics",
   :skos/definition
   "registry that contains documents describing the properties and the officially approved conditions of use of a medicine",
   :skos/note
   "Summaries of product characteristics form the basis of information for healthcare professionals on how to use the medicine safely and effectively."})

(def UniProt
  "registry that provides the scientific community with a comprehensive, high-quality and freely accessible resource of protein sequence and functional information"
  {:cmns-av/directSource "https://www.uniprot.org/",
   :db/ident :idmp-eura/UniProt,
   :lcc-lr/hasTextualName "UniProt",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "UniProt",
   :skos/definition
   "registry that provides the scientific community with a comprehensive, high-quality and freely accessible resource of protein sequence and functional information"})