(ns net.wikipunk.rdf.idmp-ra
  "The registration authorities ontology defines international registration authorities, regulatory agencies and codes required for identification of substances and medicinal products. It is derived from the ISO 11238:2018 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of regulated information on substances standard."
  {:cmns-av/copyright ["Copyright (c) 2022 Pistoia Alliance, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/ISO11238-RegistrationAuthorities.rdf",
   :dcterms/abstract
   "The registration authorities ontology defines international registration authorities, regulatory agencies and codes required for identification of substances and medicinal products. It is derived from the ISO 11238:2018 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of regulated information on substances standard.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :idmp-chg/hasMaturityLevel :idmp-chg/Provisional,
   :owl/imports
   ["https://www.omg.org/spec/Commons/RegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://www.omg.org/spec/Commons/RegistrationAuthorities/"
    "https://www.omg.org/spec/Commons/PartiesAndSituations/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/Commons/ProductsAndServices/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/20221001/ISO11238-RegistrationAuthorities/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-prd" "https://www.omg.org/spec/Commons/ProductsAndServices/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-ra" "https://www.omg.org/spec/Commons/RegistrationAuthorities/",
    "cmns-rga" "https://www.omg.org/spec/Commons/RegulatoryAgencies/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "idmp-mprd"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/",
    "idmp-ra"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-RegistrationAuthorities/",
    "idmp-sub"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-RegistrationAuthorities/",
   :rdfa/prefix "idmp-ra",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-RegistrationAuthorities/",
   :rdfs/label "ISO 11238 Registration Authorities Ontology",
   :skos/scopeNote
   "Note that jurisdiction-specific counterparties and codes are specified in subordinate ontologies supporting those jurisdictions."})

(def AmericanChemicalSociety
  "scientific society based in the United States that supports scientific inquiry in the field of chemistry"
  {:cmns-av/abbreviation "ACS",
   :cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.1.2",
   :cmns-av/explanatoryNote
   "Founded in 1876 at New York University, the ACS has more than 155,000 members at all degree levels and in all fields of chemistry, chemical engineering, and related fields. It is one of the world's largest scientific societies by membership. The ACS is a 501(c)(3) non-profit organization and holds a congressional charter under Title 36 of the United States Code. Its headquarters are located in Washington, D.C., and it has a large concentration of staff in Columbus, Ohio.",
   :db/ident :idmp-ra/AmericanChemicalSociety,
   :rdf/type [:cmns-pts/Party :owl/NamedIndividual],
   :rdfs/label "American Chemical Society",
   :skos/definition
   "scientific society based in the United States that supports scientific inquiry in the field of chemistry"})

(def AmericanChemicalSocietyRegistrationAuthority
  "American Chemical Society (ACS) in its role as a Registration Authority (RA), which is a function of the ACS for registration of substances in the CAS Registry"
  {:cmns-av/abbreviation "ACS RA",
   :cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.1.2",
   :cmns-prd/provides :idmp-ra/ChemicalAbstractsService,
   :cmns-pts/isPlayedBy :idmp-ra/AmericanChemicalSociety,
   :cmns-ra/manages :idmp-ra/ChemicalAbstractsServiceChemicalRegistrySystem,
   :db/ident :idmp-ra/AmericanChemicalSocietyRegistrationAuthority,
   :rdf/type [:cmns-ra/RegistrationAuthority :owl/NamedIndividual],
   :rdfs/label "American Chemical Society Registration Authority",
   :skos/definition
   "American Chemical Society (ACS) in its role as a Registration Authority (RA), which is a function of the ACS for registration of substances in the CAS Registry"})

(def AnatomicalTherapeuticChemicalClassificationSystem
  "registry that was developed to assist regulators in managing substance information"
  {:cmns-av/abbreviation "WHO-ATC",
   :cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 4.2.2",
   :cmns-av/explanatoryNote
   "In the Anatomical Therapeutic Chemical (ATC) classification system, the active substances are divided into different groups according to the organ or system on which they act and their therapeutic, pharmacological and chemical properties. Drugs are classified in groups at five different levels.",
   :cmns-ra/isManagedBy :idmp-ra/WorldHealthOrganizationRegistrationAuthority,
   :db/ident :idmp-ra/AnatomicalTherapeuticChemicalClassificationSystem,
   :lcc-lr/hasTextualName
   "Anatomical Therapeutic Chemical Classification System",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Anatomical Therapeutic Chemical Classification System",
   :skos/definition
   "registry that was developed to assist regulators in managing substance information"})

(def AustralianNationalBotanicGardens
  "botanical garden that maintains a scientific collection of native plants from all parts of Australia"
  {:db/ident :idmp-ra/AustralianNationalBotanicGardens,
   :rdf/type [:cmns-pts/Party :owl/NamedIndividual],
   :rdfs/label "Australian National Botanic Gardens",
   :rdfs/seeAlso "https://www.anbg.gov.au/gardens/index.html",
   :skos/definition
   "botanical garden that maintains a scientific collection of native plants from all parts of Australia"})

(def AustralianNationalBotanicGardensRegistrationAuthority
  "Australian National Botanic Gardens in its role as a Registration Authority (RA)"
  {:cmns-pts/isPlayedBy :idmp-ra/AustralianNationalBotanicGardens,
   :cmns-ra/manages :idmp-ra/AustralianPlantNameIndex,
   :db/ident :idmp-ra/AustralianNationalBotanicGardensRegistrationAuthority,
   :rdf/type [:cmns-ra/RegistrationAuthority :owl/NamedIndividual],
   :rdfs/label "Australian National Botanic Gardens registration authority",
   :skos/definition
   "Australian National Botanic Gardens in its role as a Registration Authority (RA)"})

(def AustralianPlantNameIndex
  "tool for the botanical community that deals with plant names and their usage in the scientific literature"
  {:cmns-av/abbreviation "APNI",
   :cmns-av/directSource "https://www.anbg.gov.au/apni/index.html",
   :cmns-ra/isManagedBy
   :idmp-ra/AustralianNationalBotanicGardensRegistrationAuthority,
   :db/ident :idmp-ra/AustralianPlantNameIndex,
   :lcc-lr/hasTextualName "Australian Plant Name Index (APNI)",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Australian Plant Name Index",
   :skos/definition
   "tool for the botanical community that deals with plant names and their usage in the scientific literature"})

(def AustralianPlantNameIndexEntry
  "entry in the Australian Plant Name Index that includes the Australian Plant Name Index Identifier used in electronic listing and other regulatory activities"
  {:db/ident :idmp-ra/AustralianPlantNameIndexEntry,
   :rdf/type :owl/Class,
   :rdfs/label "Australian Plant Name Index registry entry",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :idmp-sub/Substance,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :cmns-col/comprises,
                      :owl/someValuesFrom
                      :idmp-ra/AustralianPlantNameIndexIdentifier,
                      :rdf/type :owl/Restriction}
                     {:owl/hasValue   :idmp-ra/AustralianPlantNameIndex,
                      :owl/onProperty :cmns-col/isIncludedIn,
                      :rdf/type       :owl/Restriction}
                     :cmns-ra/RegistryEntry],
   :skos/definition
   "entry in the Australian Plant Name Index that includes the Australian Plant Name Index Identifier used in electronic listing and other regulatory activities"})

(def AustralianPlantNameIndexIdentifier
  "sequence of characters that is used to uniquely identify records in the Australian Plant Name Index registry"
  {:db/ident :idmp-ra/AustralianPlantNameIndexIdentifier,
   :rdf/type :owl/Class,
   :rdfs/label "Australian Plant Name Index Identifier",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :idmp-sub/Substance,
     :rdf/type           :owl/Restriction}
    {:owl/hasValue   :idmp-ra/AustralianPlantNameIndex,
     :owl/onProperty :cmns-ra/isRegisteredIn,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue
     :idmp-ra/AustralianNationalBotanicGardensRegistrationAuthority,
     :owl/onProperty :cmns-ra/hasRegistrationAuthority,
     :rdf/type :owl/Restriction}
    :cmns-ra/RegisteredIdentifier],
   :skos/definition
   "sequence of characters that is used to uniquely identify records in the Australian Plant Name Index registry"})

(def CASRegistryNumber
  "unique numerical identifier of a substance in the CAS Registry system"
  {:cmns-av/synonym ["CAS number" "CAS Registry Number"],
   :cmns-av/usageNote
   "Although CAS numbers are widely used, they cannot be freely used. CAS has guidelines on the use of CAS registry numbers and has attempted to restrict their use in publicly available databases.",
   :db/ident :idmp-ra/CASRegistryNumber,
   :dcterms/source
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clauses 3.9, A.1.2",
   :rdf/type :owl/Class,
   :rdfs/label "CAS registry number",
   :rdfs/subClassOf
   [{:owl/hasValue   :idmp-ra/ChemicalAbstractsServiceChemicalRegistrySystem,
     :owl/onProperty :cmns-ra/isRegisteredIn,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue   :idmp-ra/AmericanChemicalSocietyRegistrationAuthority,
     :owl/onProperty :cmns-ra/hasRegistrationAuthority,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :cmns-id/identifies,
     :owl/someValuesFrom :idmp-sub/Substance,
     :rdf/type           :owl/Restriction}
    :idmp-sub/SubstanceCode],
   :skos/definition
   "unique numerical identifier of a substance in the CAS Registry system",
   :skos/note
   "The numbers are sequential and are assigned as a substance enters the registry system. The numbers do not have a common length and lengths can be up to 10 digits. Each CAS number contains a single check digit. The assignment of chemical names is done according to the chemical nomenclature rules for CA index names, which is slightly different from the internationally standard IUPAC names, according to the rules of IUPAC.",
   :skos/scopeNote
   "Polymers frequently only have one CAS registry number associated with them, regardless of differences in molecular mass or other defining elements."})

(def ChemicalAbstractsService
  "service that provides a periodical index that provides numerous tools such as SciFinder as well as tagged keywords, summaries, indexes of disclosures, and structures of compounds in recently published scientific documents"
  {:cmns-av/abbreviation "CAS",
   :cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.1.2",
   :cmns-av/explanatoryNote
   "Approximately 8,000 journals, technical reports, dissertations, conference proceedings, and new books, available in at least 50 different languages, are monitored yearly, as are patent specifications from 27 countries and two international organizations. Chemical Abstracts ceased print publication on January 1, 2010.",
   :cmns-prd/isProvidedBy :idmp-ra/AmericanChemicalSocietyRegistrationAuthority,
   :db/ident :idmp-ra/ChemicalAbstractsService,
   :rdf/type [:cmns-ra/RegistrationService :owl/NamedIndividual],
   :rdfs/label "Chemical Abstracts Service",
   :skos/definition
   "service that provides a periodical index that provides numerous tools such as SciFinder as well as tagged keywords, summaries, indexes of disclosures, and structures of compounds in recently published scientific documents"})

(def ChemicalAbstractsServiceChemicalRegistrySystem
  "registry that contains information on more than 130 million organic and inorganic substances, and more than 64 million protein and nucleic acid sequences"
  {:cmns-av/abbreviation ["CAS Registry" "CAS Chemical Registry System"],
   :cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.1.2",
   :cmns-av/explanatoryNote
   "The sequence information comes from CAS and GenBank, produced by the National Institutes of Health. The chemical information is produced by CAS, and is prepared by the CAS Registry System, which identifies each compound with a specific CAS registry number, index name, and graphic representation of its chemical structure. The assignment of chemical names is done according to the chemical nomenclature rules for CA index names, which is slightly different from the internationally standard IUPAC names, according to the rules of IUPAC.",
   :cmns-ra/isManagedBy :idmp-ra/AmericanChemicalSocietyRegistrationAuthority,
   :db/ident :idmp-ra/ChemicalAbstractsServiceChemicalRegistrySystem,
   :lcc-lr/hasTextualName "Chemical Abstracts Service Registry",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Chemical Abstracts Service registry",
   :skos/definition
   "registry that contains information on more than 130 million organic and inorganic substances, and more than 64 million protein and nucleic acid sequences"})

(def ChemicalAbstractsServiceChemicalRegistrySystemEntry
  "entry in the Chemical Abstracts Service (CAS) registry, prepared by the CAS Registry System, that identifies each compound with a specific CAS registry number, index name, and graphic representation of its chemical structure"
  {:cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.1.2",
   :db/ident :idmp-ra/ChemicalAbstractsServiceChemicalRegistrySystemEntry,
   :rdf/type :owl/Class,
   :rdfs/label "Chemical Abstracts Service registry entry",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :idmp-sub/Substance,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :idmp-ra/CASRegistryNumber,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue
                      :idmp-ra/ChemicalAbstractsServiceChemicalRegistrySystem,
                      :owl/onProperty :cmns-col/isIncludedIn,
                      :rdf/type :owl/Restriction}
                     :cmns-ra/RegistryEntry],
   :skos/definition
   "entry in the Chemical Abstracts Service (CAS) registry, prepared by the CAS Registry System, that identifies each compound with a specific CAS registry number, index name, and graphic representation of its chemical structure"})

(def ClinicalTrialsGov
  "database of privately and publicly funded clinical studies conducted around the world"
  {:cmns-av/directSource "https://clinicaltrials.gov/",
   :cmns-ra/isManagedBy :idmp-ra/NationalLibraryOfMedicineRegistrationAuthority,
   :db/ident :idmp-ra/ClinicalTrialsGov,
   :lcc-lr/hasTextualName "ClinicalTrials.gov",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "ClinicalTrials.gov",
   :skos/definition
   "database of privately and publicly funded clinical studies conducted around the world"})

(def CodexGeneralStandardForFoodAdditivesOnlineDatabase
  "repository defining the conditions under which permitted food additives may be used in all foods, whether or not they have previously been standardized by Codex"
  {:cmns-av/abbreviation "GSFA",
   :cmns-av/directSource
   "https://www.fao.org/fao-who-codexalimentarius/codex-texts/dbs/gsfa/en/",
   :db/ident :idmp-ra/CodexGeneralStandardForFoodAdditivesOnlineDatabase,
   :lcc-lr/hasTextualName
   "Codex General Standard for Food Additives (GSFA) Online Database",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Codex General Standard for Food Additives Online Database",
   :skos/definition
   "repository defining the conditions under which permitted food additives may be used in all foods, whether or not they have previously been standardized by Codex"})

(def CosmeticIngredientReviewDatabase
  "repository that provides reviews and assesses the safety of ingredients in an open, unbiased, and expert manner, and publish the results in the peer-reviewed scientific literature"
  {:cmns-av/directSource "https://www.cir-safety.org/",
   :db/ident :idmp-ra/CosmeticIngredientReviewDatabase,
   :lcc-lr/hasTextualName "Cosmetic Ingredient Review Database",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Cosmetic Ingredient Review Database",
   :skos/definition
   "repository that provides reviews and assesses the safety of ingredients in an open, unbiased, and expert manner, and publish the results in the peer-reviewed scientific literature"})

(def DrugBank
  "online database containing information on drugs and drug targets"
  {:cmns-av/directSource "https://go.drugbank.com/",
   :cmns-ra/isManagedBy
   :idmp-ra/OMxPersonalHealthAnalyticsIncAsRegistrationAuthority,
   :db/ident :idmp-ra/DrugBank,
   :lcc-lr/hasTextualName "Drug Bank",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Drug Bank",
   :skos/definition
   "online database containing information on drugs and drug targets"})

(def EvaluationsOfTheJointExpertCommitteeOnFoodAdditives
  "searchable database contains the summaries of all the evaluations of flavours, food additives, contaminants, toxicants and veterinary drugs JECFA has performed"
  {:cmns-av/abbreviation "JECFA",
   :cmns-av/directSource
   "https://apps.who.int/food-additives-contaminants-jecfa-database/",
   :db/ident :idmp-ra/EvaluationsOfTheJointExpertCommitteeOnFoodAdditives,
   :lcc-lr/hasTextualName
   "Evaluations of the Joint FAO/WHO Expert Committee on Food Additives",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label
   "Evaluations of the Joint FAO/WHO Expert Committee on Food Additives",
   :skos/definition
   "searchable database contains the summaries of all the evaluations of flavours, food additives, contaminants, toxicants and veterinary drugs JECFA has performed"})

(def FoodAndDrugAdministrationRegistrationAuthority
  "Food and Drug Administration (FDA) in its role as a Registration Authority (RA), which is a function of the G-SRS for registration of substances in the FDA/USP Global Substance Registry System"
  {:cmns-av/abbreviation "FDA G-SRS RA",
   :cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.1.5",
   :cmns-pts/isPlayedBy :idmp-ra/UnitedStatesFoodAndDrugAdministration,
   :cmns-ra/manages :idmp-ra/GlobalSubstanceRegistrationSystem,
   :db/ident :idmp-ra/FoodAndDrugAdministrationRegistrationAuthority,
   :rdf/type [:cmns-ra/RegistrationAuthority :owl/NamedIndividual],
   :rdfs/label "Food and Drug Administration Registration Authority",
   :skos/definition
   "Food and Drug Administration (FDA) in its role as a Registration Authority (RA), which is a function of the G-SRS for registration of substances in the FDA/USP Global Substance Registry System"})

(def GermplasmResourcesInformationNetwork
  "repository that documents animal, microbial, and plant collections through informational pages, searchable databases, and links to USDA-ARS projects that curate the collections"
  {:cmns-av/abbreviation "GRIN",
   :cmns-av/directSource "https://www.ars-grin.gov/",
   :db/ident :idmp-ra/GermplasmResourcesInformationNetwork,
   :lcc-lr/hasTextualName "Germplasm Resources Information Network",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Germplasm Resources Information Network",
   :skos/definition
   "repository that documents animal, microbial, and plant collections through informational pages, searchable databases, and links to USDA-ARS projects that curate the collections"})

(def GlobalSubstanceRegistrationSystem
  "registry that was developed to assist regulators in managing substance information"
  {:cmns-av/abbreviation ["G-SRS" "GSRS"],
   :cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.1.5",
   :cmns-av/explanatoryNote
   "GSRS was designed to facilitate global monitoring of human and animal medicinal, food, tobacco, and cosmetic products. GSRS provides unique substance identifiers consistent with the ISO 11238 standard. FDA's GSRS specifically generates the Unique Ingredient Identifiers (UNIIs) used in electronic listing and other regulatory activities.",
   :cmns-ra/isManagedBy :idmp-ra/FoodAndDrugAdministrationRegistrationAuthority,
   :db/ident :idmp-ra/GlobalSubstanceRegistrationSystem,
   :lcc-lr/hasTextualName "Global Substance Registration System - GSRS",
   :rdf/type [:owl/NamedIndividual :cmns-ra/Registry],
   :rdfs/label "Global Substance Registration System",
   :skos/definition
   "registry that was developed to assist regulators in managing substance information"})

(def GlobalSubstanceRegistrationSystemEntry
  "entry in the Global Substance Registry System (GSRS) registry, that includes the Unique Ingredient Identifiers (UNIIs) used in electronic listing and other regulatory activities"
  {:cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.1.5",
   :db/ident :idmp-ra/GlobalSubstanceRegistrationSystemEntry,
   :rdf/type :owl/Class,
   :rdfs/label "Global Substance Registry System registry entry",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :idmp-sub/Substance,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :idmp-ra/UniqueIngredientNumber,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue :idmp-ra/GlobalSubstanceRegistrationSystem,
                      :owl/onProperty :cmns-col/isIncludedIn,
                      :rdf/type :owl/Restriction}
                     :cmns-ra/RegistryEntry],
   :skos/definition
   "entry in the Global Substance Registry System (GSRS) registry, that includes the Unique Ingredient Identifiers (UNIIs) used in electronic listing and other regulatory activities"})

(def GlobalSubstanceRegistryService
  "service with detailed business rules for data entry and generation of UNIIs for both simple and complex substances"
  {:cmns-av/abbreviation "G-SRS service",
   :cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.1.5",
   :cmns-prd/isProvidedBy
   :idmp-ra/FoodAndDrugAdministrationRegistrationAuthority,
   :db/ident :idmp-ra/GlobalSubstanceRegistryService,
   :rdf/type [:cmns-ra/RegistrationService :owl/NamedIndividual],
   :rdfs/label "global substance registration service",
   :skos/definition
   "service with detailed business rules for data entry and generation of UNIIs for both simple and complex substances"})

(def IntegratedTaxonomicInformationSystem
  "registry that provides standardized information about the vascular plants, mosses, liverworts, hornworts, and lichens of the U.S. and its territories"
  {:cmns-av/abbreviation "ITIS",
   :cmns-av/explanatoryNote
   "The ITIS includes names, plant symbols, checklists, distributional data, species abstracts, characteristics, images, crop information, automated tools, onward Web links, and references. This information primarily promotes land conservation in the United States and its territories, but academic, educational, and general use is encouraged.",
   :cmns-ra/isManagedBy
   :idmp-ra/IntegratedTaxonomicInformationSystemRegistrationAuthority,
   :db/ident :idmp-ra/IntegratedTaxonomicInformationSystem,
   :lcc-lr/hasTextualName "Integrated Taxonomic Information System",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/altLabel "Interagency Taxonomic Information System",
   :rdfs/label "Integrated Taxonomic Information System",
   :skos/definition
   "registry that provides standardized information about the vascular plants, mosses, liverworts, hornworts, and lichens of the U.S. and its territories"})

(def IntegratedTaxonomicInformationSystemEntry
  "entry in the Integrated Taxonomic Information System registry comprised of a Taxonomix Serial Number used in electronic listing and other regulatory activities"
  {:cmns-av/abbreviation "ITIS entry",
   :db/ident :idmp-ra/IntegratedTaxonomicInformationSystemEntry,
   :rdf/type :owl/Class,
   :rdfs/label "Integrated Taxonomic Information System registry entry",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :idmp-sub/Substance,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty :cmns-col/comprises,
     :owl/someValuesFrom
     :idmp-ra/IntegratedTaxonomicInformationSystemTaxonomicSerialNumber,
     :rdf/type :owl/Restriction}
    {:owl/hasValue   :idmp-ra/IntegratedTaxonomicInformationSystem,
     :owl/onProperty :cmns-col/isIncludedIn,
     :rdf/type       :owl/Restriction}
    :cmns-ra/RegistryEntry],
   :skos/definition
   "entry in the Integrated Taxonomic Information System registry comprised of a Taxonomix Serial Number used in electronic listing and other regulatory activities"})

(def IntegratedTaxonomicInformationSystemOrganization
  "group of agencies consisting of a steering committee and technical working committees for database design and quality management for the content provided in the Integrated Taxonomic Information System"
  {:cmns-av/explanatoryNote
   "These agencies signed a Memorandum of Understanding and have formed a Steering Committee that directs two technical work groups - the Database Work Group (DWG) and the Taxonomy Work Group (TWG). The DWG is responsible for the database design and overseeing development of the system to meet the requirements of the ITIS partners. The TWG is responsible for the quality and integrity of the database information. In addition to the database, the working groups have created \"Taxonomic Workbench\" software designed for easy entry and manipulation of taxonomic data.",
   :db/ident :idmp-ra/IntegratedTaxonomicInformationSystemOrganization,
   :rdf/type [:cmns-pts/Party :owl/NamedIndividual],
   :rdfs/label "ITIS Organization",
   :rdfs/seeAlso "https://www.itis.gov/organ.html",
   :skos/definition
   "group of agencies consisting of a steering committee and technical working committees for database design and quality management for the content provided in the Integrated Taxonomic Information System"})

(def IntegratedTaxonomicInformationSystemRegistrationAuthority
  "Integrated Taxonomic Information System (ITIS) in its role as a Registration Authority (RA), which is multi-agency organization that involves specialists from around the world to assemble scientific names and their taxonomic relationships, and distribute that data through publicly available software"
  {:cmns-av/abbreviation "ITIS",
   :cmns-pts/isPlayedBy
   :idmp-ra/IntegratedTaxonomicInformationSystemOrganization,
   :cmns-ra/manages :idmp-ra/IntegratedTaxonomicInformationSystem,
   :db/ident :idmp-ra/IntegratedTaxonomicInformationSystemRegistrationAuthority,
   :rdf/type [:cmns-ra/RegistrationAuthority :owl/NamedIndividual],
   :rdfs/label "Integrated Taxonomic Information System Registration Authority",
   :skos/definition
   "Integrated Taxonomic Information System (ITIS) in its role as a Registration Authority (RA), which is multi-agency organization that involves specialists from around the world to assemble scientific names and their taxonomic relationships, and distribute that data through publicly available software"})

(def IntegratedTaxonomicInformationSystemTaxonomicSerialNumber
  "unique identifier for an entry in the Integrated Taxonomic Information System registry used in electronic listing and other regulatory activities"
  {:cmns-av/synonym "TSN",
   :db/ident :idmp-ra/IntegratedTaxonomicInformationSystemTaxonomicSerialNumber,
   :rdf/type :owl/Class,
   :rdfs/label
   "Integrated Taxonomic Information System Taxonomic Serial Number",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :idmp-sub/Substance,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue
                      :idmp-ra/IntegratedTaxonomicInformationSystem,
                      :owl/onProperty :cmns-dsg/isDefinedIn,
                      :rdf/type :owl/Restriction}
                     :cmns-ra/RegisteredIdentifier],
   :skos/definition
   "unique identifier for an entry in the Integrated Taxonomic Information System registry used in electronic listing and other regulatory activities"})

(def InternationalNonproprietaryName
  "unique generic name allocated to an active pharmaceutical substance used in medicine worldwide"
  {:cmns-av/abbreviation "INN",
   :cmns-av/synonym "generic name",
   :db/ident :idmp-ra/InternationalNonproprietaryName,
   :dcterms/source
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clauses 4.9",
   :rdf/type :owl/Class,
   :rdfs/label "international nonproprietary name",
   :rdfs/seeAlso
   "https://www.who.int/teams/health-product-and-policy-standards/inn/",
   :rdfs/subClassOf [:idmp-sub/SubstanceName
                     {:owl/hasValue
                      :idmp-ra/WorldHealthOrganizationRegistrationAuthority,
                      :owl/onProperty :cmns-ra/isRegisteredBy,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "unique generic name allocated to an active pharmaceutical substance used in medicine worldwide",
   :skos/note
   ["The World Health Organization collaborates closely with INN experts and national nomenclature committees to select a single name of worldwide acceptability for each active substance that is to be marketed as a pharmaceutical. To avoid confusion, which could jeopardize the safety of patients, trade-marks should neither be derived from INNs nor contain common stems used in INNs. The selection and publication of INNs falls under the responsibility of the EMP/RHT/TSN team of the INN Programme."
    "INNs usually contain a common syllable (known as a stem) to indicate the pharmacological or chemical family to which the substance belongs. The ending –mycin, for example – denotes a type of antibiotic. Syllables, letters or separate words are then added to differentiate between substances in the same family – such as kanamycin, erythromycin. Twice a year, the INN Expert Group gathers at WHO to painstakingly consider and create names for new substances used in medicines. The aim is come up with a single name – an INN – that can be recognized and used globally by doctors, pharmacists, scientists, medicines regulators and patients."
    "International Nonproprietary Names (INN) facilitate the identification of pharmaceutical substances or active pharmaceutical ingredients. Each INN is a unique name that is globally recognized and is public property. A nonproprietary name is also known as a generic name."
    "Nonproprietary names are intended for use in pharmacopoeias, labelling, product information, advertising and other promotional material, drug regulation and scientific literature, and as a basis for product names, e.g. for generics. Their use is normally required by national or, as in the case of the European Community, by international legislation. As a result of ongoing collaboration, national names such as British Approved Names (BAN), Dénominations Communes Françaises (DCF), Japanese Adopted Names (JAN) and United States Adopted Names (USAN) are nowadays, with rare exceptions, identical to the INN."]})

(def InventoryOfEffectiveFoodContactSubstanceNotifications
  "repository that lists effective pre-market notifications for food contact substances that have been demonstrated to be safe for their intended use"
  {:cmns-av/directSource
   "https://www.fda.gov/food/packaging-food-contact-substances-fcs/inventory-effective-food-contact-substance-fcs-notifications",
   :db/ident :idmp-ra/InventoryOfEffectiveFoodContactSubstanceNotifications,
   :lcc-lr/hasTextualName
   "Inventory of Effective Food Contact Substance (FCS) Notifications",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Inventory of Effective Food Contact Substance Notifications",
   :skos/definition
   "repository that lists effective pre-market notifications for food contact substances that have been demonstrated to be safe for their intended use"})

(def KyotoEncyclopediaOfGenesAndGenomes
  "database resource for understanding high-level functions and utilities of the biological system, such as the cell, the organism and the ecosystem, from molecular-level information, especially large-scale molecular datasets generated by genome sequencing and other high-throughput experimental technologies"
  {:cmns-av/abbreviation "KEGG",
   :cmns-av/directSource "https://www.genome.jp/kegg/",
   :db/ident :idmp-ra/KyotoEncyclopediaOfGenesAndGenomes,
   :lcc-lr/hasTextualName "Kyoto Encyclopedia of Genes and Genomes",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Kyoto Encyclopedia of Genes and Genomes",
   :skos/definition
   "database resource for understanding high-level functions and utilities of the biological system, such as the cell, the organism and the ecosystem, from molecular-level information, especially large-scale molecular datasets generated by genome sequencing and other high-throughput experimental technologies"})

(def LiverTox
  "repository published by the U.S. National Library of Medicine (NLM) that provides up-to-date, unbiased and easily accessed information on the diagnosis, cause, frequency, clinical patterns and management of liver injury attributable to prescription and nonprescription medications and selected herbal and dietary supplements"
  {:cmns-av/directSource "https://www.ncbi.nlm.nih.gov/books/NBK547852/",
   :cmns-av/explanatoryNote
   "LiverTox is also known as the Clinical and Research Information on Drug-Induced Liver Injury library.",
   :cmns-ra/isManagedBy :idmp-ra/NationalLibraryOfMedicineRegistrationAuthority,
   :db/ident :idmp-ra/LiverTox,
   :lcc-lr/hasTextualName "LiverTox",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "LiverTox",
   :skos/definition
   "repository published by the U.S. National Library of Medicine (NLM) that provides up-to-date, unbiased and easily accessed information on the diagnosis, cause, frequency, clinical patterns and management of liver injury attributable to prescription and nonprescription medications and selected herbal and dietary supplements"})

(def MedNetINN
  {:cmns-av/directSource "https://extranet.who.int/soinn/",
   :cmns-ra/isManagedBy :idmp-ra/WorldHealthOrganizationRegistrationAuthority,
   :db/ident :idmp-ra/MedNetINN,
   :lcc-lr/hasTextualName "MedNet INN",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "MedNet INN"})

(def MedicalSubjectHeadings
  "National Library of Medicine (NLM) controlled vocabulary and thesaurus used for indexing articles for PubMed"
  {:cmns-av/abbreviation "MeSH",
   :cmns-av/directSource "https://www.ncbi.nlm.nih.gov/mesh/",
   :cmns-ra/isManagedBy :idmp-ra/NationalLibraryOfMedicineRegistrationAuthority,
   :db/ident :idmp-ra/MedicalSubjectHeadings,
   :lcc-lr/hasTextualName "Medical Subject Headings",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Medical Subject Headings",
   :skos/definition
   "National Library of Medicine (NLM) controlled vocabulary and thesaurus used for indexing articles for PubMed"})

(def MedicalSubjectHeadingsEntry
  "entry in the Medical Subject Headings (MeSH) registry that includes the Medical Subject Headings Unique Identifier (MeSH Unique ID) used in electronic listing and other regulatory activities"
  {:db/ident :idmp-ra/MedicalSubjectHeadingsEntry,
   :rdf/type :owl/Class,
   :rdfs/label "Medical Subject Headings registry entry",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :idmp-sub/Substance,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :cmns-col/comprises,
                      :owl/someValuesFrom
                      :idmp-ra/MedicalSubjectHeadingsUniqueIdentifier,
                      :rdf/type :owl/Restriction}
                     {:owl/hasValue   :idmp-ra/MedicalSubjectHeadings,
                      :owl/onProperty :cmns-col/isIncludedIn,
                      :rdf/type       :owl/Restriction}
                     :cmns-ra/RegistryEntry],
   :skos/definition
   "entry in the Medical Subject Headings (MeSH) registry that includes the Medical Subject Headings Unique Identifier (MeSH Unique ID) used in electronic listing and other regulatory activities"})

(def MedicalSubjectHeadingsUniqueIdentifier
  "alpha-numeric string that is used to identify records in the Medical Subject Headings registry"
  {:cmns-av/synonym "MeSH Unique ID",
   :db/ident :idmp-ra/MedicalSubjectHeadingsUniqueIdentifier,
   :rdf/type :owl/Class,
   :rdfs/label "medical subject headings unique identifer",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-id/identifies,
                      :owl/someValuesFrom :idmp-sub/Substance,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue
                      :idmp-ra/NationalLibraryOfMedicineRegistrationAuthority,
                      :owl/onProperty :cmns-ra/hasRegistrationAuthority,
                      :rdf/type :owl/Restriction}
                     {:owl/hasValue   :idmp-ra/MedicalSubjectHeadings,
                      :owl/onProperty :cmns-ra/isRegisteredIn,
                      :rdf/type       :owl/Restriction}
                     :idmp-sub/SubstanceCode],
   :skos/definition
   "alpha-numeric string that is used to identify records in the Medical Subject Headings registry",
   :skos/note
   "MeSH Unique ID finds Descriptor, Qualifier, and Supplemental Concept Records by their Record Unique Identifier."})

(def MerckIndexOnline
  "online encylopedia of information on chemicals, drugs and biologicals"
  {:cmns-av/directSource "https://www.rsc.org/Merck-Index/",
   :cmns-av/synonym "Merck Index",
   :db/ident :idmp-ra/MerckIndexOnline,
   :lcc-lr/hasTextualName "Merck Index Online",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Merck Index Online",
   :skos/definition
   "online encylopedia of information on chemicals, drugs and biologicals"})

(def ModelListOfEssentialMedicines
  {:cmns-av/directSource "https://list.essentialmeds.org/",
   :cmns-ra/isManagedBy :idmp-ra/WorldHealthOrganizationRegistrationAuthority,
   :db/ident :idmp-ra/ModelListOfEssentialMedicines,
   :lcc-lr/hasTextualName "Model List of Essential Medicines",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "model list of essential medicines"})

(def NationalCancerInstitute
  "institute that is part of the U.S. National Institutes of Health (NIH) that is the federal government's principal agency for cancer research and training"
  {:cmns-av/abbreviation "NCI",
   :db/ident :idmp-ra/NationalCancerInstitute,
   :rdf/type [:cmns-pts/Party :owl/NamedIndividual],
   :rdfs/label "National Cancer Institute",
   :rdfs/seeAlso "https://www.cancer.gov/about-nci/overview",
   :skos/definition
   "institute that is part of the U.S. National Institutes of Health (NIH) that is the federal government's principal agency for cancer research and training"})

(def NationalCancerInstituteRegistrationAuthority
  "National Cancer Institute in its role as a Registration Authority (RA)"
  {:cmns-pts/isPlayedBy :idmp-ra/NationalCancerInstitute,
   :cmns-ra/manages :idmp-ra/NationalCancerInstituteThesaurus,
   :db/ident :idmp-ra/NationalCancerInstituteRegistrationAuthority,
   :rdf/type [:cmns-ra/RegistrationAuthority :owl/NamedIndividual],
   :rdfs/label "National Cancer Institute registration authority",
   :skos/definition
   "National Cancer Institute in its role as a Registration Authority (RA)"})

(def NationalCancerInstituteThesaurus
  "registry that provides reference terminology for many NCI and other systems that is widely used across the healthcare industry as the basis for vocabulary and terminology work"
  {:cmns-av/abbreviation "NCIt",
   :cmns-av/directSource "https://ncithesaurus.nci.nih.gov/ncitbrowser/",
   :cmns-ra/isManagedBy :idmp-ra/NationalCancerInstituteRegistrationAuthority,
   :db/ident :idmp-ra/NationalCancerInstituteThesaurus,
   :lcc-lr/hasTextualName "NCI Thesaurus",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "National Cancer Institute Thesaurus",
   :skos/definition
   "registry that provides reference terminology for many NCI and other systems that is widely used across the healthcare industry as the basis for vocabulary and terminology work",
   :skos/note
   "It covers vocabulary for clinical care, translational and basic research, and public information and administrative activities."})

(def NationalCancerInstituteThesaurusCode
  "alpha-numeric string that is used to identify records in the National Center for Biotechnology Information Taxonomy registry"
  {:cmns-av/synonym "NCI Thesaurus Code",
   :db/ident :idmp-ra/NationalCancerInstituteThesaurusCode,
   :rdf/type :owl/Class,
   :rdfs/label "National Cancer Institute Thesaurus Code",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :idmp-sub/Substance,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue   :idmp-ra/NationalCancerInstituteThesaurus,
                      :owl/onProperty :cmns-ra/isRegisteredIn,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue
                      :idmp-ra/NationalCancerInstituteRegistrationAuthority,
                      :owl/onProperty :cmns-ra/hasRegistrationAuthority,
                      :rdf/type :owl/Restriction}
                     :cmns-ra/RegisteredIdentifier],
   :skos/definition
   "alpha-numeric string that is used to identify records in the National Center for Biotechnology Information Taxonomy registry"})

(def NationalCancerInstituteThesaurusEntry
  "entry in the National Cancer Institute Thesaurus that includes the National Cancer Institute Thesaurus Code used in electronic listing and other regulatory activities"
  {:db/ident :idmp-ra/NationalCancerInstituteThesaurusEntry,
   :rdf/type :owl/Class,
   :rdfs/label "National Cancer Institute Thesaurus registry entry",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :idmp-sub/Substance,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty :cmns-col/comprises,
     :owl/someValuesFrom
     :idmp-ra/NationalCenterForBiotechnologyInformationTaxonomyIdentifier,
     :rdf/type :owl/Restriction}
    {:owl/hasValue   :idmp-ra/NationalCancerInstituteThesaurus,
     :owl/onProperty :cmns-col/isIncludedIn,
     :rdf/type       :owl/Restriction}
    :cmns-ra/RegistryEntry],
   :skos/definition
   "entry in the National Cancer Institute Thesaurus that includes the National Cancer Institute Thesaurus Code used in electronic listing and other regulatory activities"})

(def NationalCenterForBiotechnologyInformation
  "organization that is part of the U.S. National Library of Medicine, National Institutes of Health (NIH) that advances science and health by providing access to biomedical and genomic information"
  {:cmns-av/abbreviation "NCBI",
   :db/ident :idmp-ra/NationalCenterForBiotechnologyInformation,
   :rdf/type [:cmns-pts/Party :owl/NamedIndividual],
   :rdfs/label "National Center For Biotechnology Information",
   :rdfs/seeAlso "https://www.ncbi.nlm.nih.gov/",
   :skos/definition
   "organization that is part of the U.S. National Library of Medicine, National Institutes of Health (NIH) that advances science and health by providing access to biomedical and genomic information"})

(def NationalCenterForBiotechnologyInformationGeneDatabase
  "registry published by the National Center For Biotechnology Information that integrates information from a wide range of species"
  {:cmns-av/abbreviation "Gene",
   :cmns-av/directSource "https://www.ncbi.nlm.nih.gov/gene",
   :db/ident :idmp-ra/NationalCenterForBiotechnologyInformationGeneDatabase,
   :lcc-lr/hasTextualName
   "National Center for Biotechnology Information Gene Database",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "National Center for Biotechnology Information Gene Database",
   :skos/definition
   "registry published by the National Center For Biotechnology Information that integrates information from a wide range of species"})

(def NationalCenterForBiotechnologyInformationRegistrationAuthority
  "National Center For Biotechnology Information in its role as a Registration Authority (RA)"
  {:cmns-pts/isPlayedBy :idmp-ra/NationalCenterForBiotechnologyInformation,
   :cmns-ra/manages
   :idmp-ra/NationalCenterForBiotechnologyInformationTaxonomyDatabase,
   :db/ident
   :idmp-ra/NationalCenterForBiotechnologyInformationRegistrationAuthority,
   :rdf/type [:cmns-ra/RegistrationAuthority :owl/NamedIndividual],
   :rdfs/label
   "National Center For Biotechnology Information registration authority",
   :skos/definition
   "National Center For Biotechnology Information in its role as a Registration Authority (RA)"})

(def NationalCenterForBiotechnologyInformationTaxonomyDatabase
  "registry that is a curated classification and nomenclature for all of the organisms in the public sequence databases, representing roughly 10 percent of the described species of life on the planet"
  {:cmns-av/directSource "https://www.ncbi.nlm.nih.gov/taxonomy",
   :cmns-ra/isManagedBy :idmp-ra/NationalLibraryOfMedicineRegistrationAuthority,
   :db/ident :idmp-ra/NationalCenterForBiotechnologyInformationTaxonomyDatabase,
   :lcc-lr/hasTextualName "NCBI Taxonomy",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label
   "National Center for Biotechnology Information Taxonomy Database",
   :skos/definition
   "registry that is a curated classification and nomenclature for all of the organisms in the public sequence databases, representing roughly 10 percent of the described species of life on the planet"})

(def NationalCenterForBiotechnologyInformationTaxonomyDatabaseEntry
  "entry in the National Center for Biotechnology Information Taxonomy Database, that includes the National Center for Biotechnology Information Taxonomy Database Unique Identifier used in electronic listing and other regulatory activities"
  {:db/ident
   :idmp-ra/NationalCenterForBiotechnologyInformationTaxonomyDatabaseEntry,
   :rdf/type :owl/Class,
   :rdfs/label
   "National Center for Biotechnology Information Taxonomy Database registry entry",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :idmp-sub/Substance,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty :cmns-col/comprises,
     :owl/someValuesFrom
     :idmp-ra/NationalCenterForBiotechnologyInformationTaxonomyIdentifier,
     :rdf/type :owl/Restriction}
    {:owl/hasValue
     :idmp-ra/NationalCenterForBiotechnologyInformationTaxonomyDatabase,
     :owl/onProperty :cmns-col/isIncludedIn,
     :rdf/type :owl/Restriction}
    :cmns-ra/RegistryEntry],
   :skos/definition
   "entry in the National Center for Biotechnology Information Taxonomy Database, that includes the National Center for Biotechnology Information Taxonomy Database Unique Identifier used in electronic listing and other regulatory activities"})

(def NationalCenterForBiotechnologyInformationTaxonomyIdentifier
  "alpha-numeric string that is used to identify records in the National Center for Biotechnology Information Taxonomy registry"
  {:cmns-av/synonym "NCBI Taxonomy ID",
   :db/ident
   :idmp-ra/NationalCenterForBiotechnologyInformationTaxonomyIdentifier,
   :rdf/type :owl/Class,
   :rdfs/label
   "National Center for Biotechnology Information Taxonomy identifer",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :idmp-sub/Substance,
     :rdf/type           :owl/Restriction}
    {:owl/hasValue
     :idmp-ra/NationalCenterForBiotechnologyInformationTaxonomyDatabase,
     :owl/onProperty :cmns-ra/isRegisteredIn,
     :rdf/type :owl/Restriction}
    {:owl/hasValue
     :idmp-ra/NationalCenterForBiotechnologyInformationRegistrationAuthority,
     :owl/onProperty :cmns-ra/hasRegistrationAuthority,
     :rdf/type :owl/Restriction}
    :cmns-ra/RegisteredIdentifier],
   :skos/definition
   "alpha-numeric string that is used to identify records in the National Center for Biotechnology Information Taxonomy registry"})

(def NationalDrugFileReferenceTerminology
  "legacy registry that was published by the U.S. Department of Veterans Affairs, Veterans Health Administration, providing standard names for (1) mechanism of action, (2) Physiologic Effect and (3) Structural Class for drugs NDF-RT is part of the Federal Medication Terminologies."
  {:cmns-av/abbreviation "NDF-RT",
   :cmns-av/directSource "https://evs.nci.nih.gov/ftp1/NDF-RT/",
   :cmns-ra/isManagedBy :idmp-ra/NationalLibraryOfMedicineRegistrationAuthority,
   :db/ident :idmp-ra/NationalDrugFileReferenceTerminology,
   :lcc-lr/hasTextualName "National Drug File - Reference Terminology (NDF-RT)",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "National Drug File - Reference Terminology",
   :skos/definition
   "legacy registry that was published by the U.S. Department of Veterans Affairs, Veterans Health Administration, providing standard names for (1) mechanism of action, (2) Physiologic Effect and (3) Structural Class for drugs NDF-RT is part of the Federal Medication Terminologies.",
   :skos/scopeNote
   "NDF-RT is part of the Federal Medication Terminologies. Publication of NDF-RT has ended. The Medication Reference Terminology (MED-RT) is the evolutionary successor to the Veterans Health Administration National Drug File."})

(def NationalLibraryOfMedicine
  "U.S. government institute that is part of the National Institutes of Health, responsible for collecting, curating and providing access to medicinal and related scientific publications"
  {:cmns-av/abbreviation "NLM",
   :db/ident :idmp-ra/NationalLibraryOfMedicine,
   :rdf/type [:cmns-pts/Party :owl/NamedIndividual],
   :rdfs/label "National Library of Medicine",
   :rdfs/seeAlso "https://www.nlm.nih.gov/",
   :skos/definition
   "U.S. government institute that is part of the National Institutes of Health, responsible for collecting, curating and providing access to medicinal and related scientific publications"})

(def NationalLibraryOfMedicineRegistrationAuthority
  "National Library of Medicine (NLM) in its role as a Registration Authority (RA)"
  {:cmns-pts/isPlayedBy :idmp-ra/NationalLibraryOfMedicine,
   :cmns-ra/manages :idmp-ra/MedicalSubjectHeadings,
   :db/ident :idmp-ra/NationalLibraryOfMedicineRegistrationAuthority,
   :rdf/type [:cmns-ra/RegistrationAuthority :owl/NamedIndividual],
   :rdfs/label "National Library of Medicine Registration Authority",
   :skos/definition
   "National Library of Medicine (NLM) in its role as a Registration Authority (RA)"})

(def NationalPlantDataTeam
  "organization within the U.S. Department of Agriculture that focuses on plant data collection, content, quality control, integration, dissemination, and interpretation for National Resources Conservation Service (NRCS) use in conservation practices"
  {:cmns-av/adaptedFrom "https://plants.usda.gov/home/team",
   :db/ident :idmp-ra/NationalPlantDataTeam,
   :rdf/type [:cmns-pts/Party :owl/NamedIndividual],
   :rdfs/label "National Plant Data Team",
   :rdfs/seeAlso "https://plants.usda.gov/home/team",
   :skos/definition
   "organization within the U.S. Department of Agriculture that focuses on plant data collection, content, quality control, integration, dissemination, and interpretation for National Resources Conservation Service (NRCS) use in conservation practices"})

(def OMxPersonalHealthAnalyticsInc
  "party that was a spin-off from work conducted by the University of Alberta to manage products related to the DrugBank repository"
  {:db/ident :idmp-ra/OMxPersonalHealthAnalyticsInc,
   :rdf/type [:cmns-pts/Party :owl/NamedIndividual],
   :rdfs/label "OMx Personal Health Analytics, Inc.",
   :rdfs/seeAlso "https://www.drugbank.com/about",
   :skos/definition
   "party that was a spin-off from work conducted by the University of Alberta to manage products related to the DrugBank repository"})

(def OMxPersonalHealthAnalyticsIncAsRegistrationAuthority
  "OMx Personal Health Analytics in its role as the registration authority for the DrugBank Online repository"
  {:cmns-pts/isPlayedBy :idmp-ra/OMxPersonalHealthAnalyticsInc,
   :cmns-ra/manages :idmp-ra/DrugBank,
   :db/ident :idmp-ra/OMxPersonalHealthAnalyticsIncAsRegistrationAuthority,
   :rdf/type [:cmns-ra/RegistrationAuthority :owl/NamedIndividual],
   :rdfs/label "OMx Personal Health Analytics, Inc. as registration authority",
   :rdfs/seeAlso "https://www.drugbank.com/",
   :skos/definition
   "OMx Personal Health Analytics in its role as the registration authority for the DrugBank Online repository"})

(def OrphanDrugProductDesignationDatabase
  {:cmns-av/directSource
   "https://www.accessdata.fda.gov/scripts/opdlisting/oopd/index.cfm",
   :cmns-ra/isManagedBy :idmp-ra/FoodAndDrugAdministrationRegistrationAuthority,
   :db/ident :idmp-ra/OrphanDrugProductDesignationDatabase,
   :lcc-lr/hasTextualName "Orphan Drug Product designation database",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "orphan drug product designation database"})

(def PesticideProductInformationSystem
  "registry published by the U.S. Environmental Protection Agency that contains information concerning all pesticide products registered in the United States"
  {:cmns-av/abbreviation "PPIS",
   :cmns-av/directSource
   "https://www.epa.gov/ingredients-used-pesticide-products/pesticide-product-information-system-ppis",
   :db/ident :idmp-ra/PesticideProductInformationSystem,
   :lcc-lr/hasTextualName "Pesticide Product Information System",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Pesticide Product Information System",
   :skos/definition
   "registry published by the U.S. Environmental Protection Agency that contains information concerning all pesticide products registered in the United States"})

(def PlantListOfAcceptedNomenclatureTaxonomyAndSymbols
  "registry published by the U.S. Department of Agriculture that provides standardized information about the vascular plants, mosses, liverworts, hornworts, and lichens of the U.S. and its territories"
  {:cmns-av/abbreviation ["USDA PLANTS" "PLANTS Database"],
   :cmns-av/directSource "https://plants.usda.gov/home",
   :db/ident :idmp-ra/PlantListOfAcceptedNomenclatureTaxonomyAndSymbols,
   :lcc-lr/hasTextualName
   "Plant List of Accepted Nomenclature, Taxonomy, and Symbols",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Plant List of Accepted Nomenclature, Taxonomy, and Symbols",
   :skos/definition
   "registry published by the U.S. Department of Agriculture that provides standardized information about the vascular plants, mosses, liverworts, hornworts, and lichens of the U.S. and its territories",
   :skos/note
   "The registry includes names, plant symbols, checklists, distributional data, species abstracts, characteristics, images, crop information, automated tools, onward Web links, and references. This information primarily promotes land conservation in the United States and its territories, but academic, educational, and general use is encouraged."})

(def PlantListOfAcceptedNomenclatureTaxonomyAndSymbolsEntry
  "entry in the Plant List of Accepted Nomenclature, Taxonomy, and Symbols registry used in electronic listing and other regulatory activities"
  {:db/ident :idmp-ra/PlantListOfAcceptedNomenclatureTaxonomyAndSymbolsEntry,
   :rdf/type :owl/Class,
   :rdfs/label
   "Plant List of Accepted Nomenclature, Taxonomy, and Symbols entry",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :idmp-sub/Substance,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue
                      :idmp-ra/IntegratedTaxonomicInformationSystem,
                      :owl/onProperty :cmns-dsg/isDefinedIn,
                      :rdf/type :owl/Restriction}
                     :cmns-ra/RegistryEntry],
   :skos/definition
   "entry in the Plant List of Accepted Nomenclature, Taxonomy, and Symbols registry used in electronic listing and other regulatory activities"})

(def PlantListOfAcceptedNomenclatureTaxonomySymbolsSymbol
  "unique identifier for an entry in the Plant List of Accepted Nomenclature, Taxonomy, and Symbols registry used in electronic listing and other regulatory activities"
  {:db/ident :idmp-ra/PlantListOfAcceptedNomenclatureTaxonomySymbolsSymbol,
   :rdf/type :owl/Class,
   :rdfs/label
   "Plant List of Accepted Nomenclature, Taxonomy, and Symbols symbol",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :idmp-sub/Substance,
     :rdf/type           :owl/Restriction}
    {:owl/hasValue   :idmp-ra/PlantListOfAcceptedNomenclatureTaxonomyAndSymbols,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type       :owl/Restriction}
    :cmns-ra/RegisteredIdentifier],
   :skos/definition
   "unique identifier for an entry in the Plant List of Accepted Nomenclature, Taxonomy, and Symbols registry used in electronic listing and other regulatory activities"})

(def PubChem
  "registry that is an open chemistry database at the National Institutes of Health (NIH)"
  {:cmns-av/directSource "https://pubchemdocs.ncbi.nlm.nih.gov/",
   :db/ident :idmp-ra/PubChem,
   :lcc-lr/hasTextualName "PubChem",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "PubChem",
   :skos/definition
   "registry that is an open chemistry database at the National Institutes of Health (NIH)"})

(def RegulatoryContext-FoodAndDrugAdministrationGeneral
  "regulatory reporting context covering the U.S. jurisdiction for which the FDA is the primary regulator"
  {:cmns-av/abbreviation "FDA general regulatory context",
   :cmns-ra/isRelatedTo :idmp-ra/UnitedStatesFoodAndDrugAdministration,
   :cmns-rga/hasReach :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :idmp-ra/RegulatoryContext-FoodAndDrugAdministrationGeneral,
   :rdf/type
   [:cmns-rga/Jurisdiction :idmp-sub/RegulatoryContext :owl/NamedIndividual],
   :rdfs/label "regulatory context - Food and Drug Administration (general)",
   :skos/definition
   "regulatory reporting context covering the U.S. jurisdiction for which the FDA is the primary regulator"})

(def RegulatoryContext-FoodAndDrugAdministrationPatentExclusive
  "regulatory reporting context covering the U.S. jurisdiction for which the FDA is the primary regulator and which reflects certain legal patent restrictions or indicates a new medical or chemical entity exclusivity in cases where a patent may not yet be in place"
  {:cmns-av/abbreviation "FDA patent exclusive regulatory context",
   :cmns-ra/isRelatedTo :idmp-ra/UnitedStatesFoodAndDrugAdministration,
   :cmns-rga/hasReach :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident
   :idmp-ra/RegulatoryContext-FoodAndDrugAdministrationPatentExclusive,
   :rdf/type [:cmns-rga/Jurisdiction
              :idmp-sub/RegulatoryContext
              :idmp-sub/MarketContext
              :owl/NamedIndividual],
   :rdfs/label
   "regulatory context - Food and Drug Administration (patent exclusive)",
   :skos/definition
   "regulatory reporting context covering the U.S. jurisdiction for which the FDA is the primary regulator and which reflects certain legal patent restrictions or indicates a new medical or chemical entity exclusivity in cases where a patent may not yet be in place"})

(def RxNorm
  "registry published by the U.S. National Library of Medicine that provides normalized names for clinical drugs and links its names to many of the drug vocabularies commonly used in pharmacy management and drug interaction software, including those of First Databank, Micromedex, and Gold Standard Drug Database"
  {:cmns-av/directSource "https://www.nlm.nih.gov/research/umls/rxnorm",
   :db/ident :idmp-ra/RxNorm,
   :lcc-lr/hasTextualName "RxNorm",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "RxNorm",
   :skos/definition
   "registry published by the U.S. National Library of Medicine that provides normalized names for clinical drugs and links its names to many of the drug vocabularies commonly used in pharmacy management and drug interaction software, including those of First Databank, Micromedex, and Gold Standard Drug Database",
   :skos/note
   "By providing links between these vocabularies, RxNorm can mediate messages between systems not using the same software and vocabulary."})

(def USPharmacopeiaMedicinesCompendium
  "all-online compendium that provides monographs and reference materials for chemical and biological medicines and excipients legally marketed in any country"
  {:cmns-av/abbreviation "USP-MC",
   :cmns-av/directSource
   "https://www.uspnf.com/notices/archived-call-candidates-usp-medicines-compendium-biologics-expert-committee#:~:text=The%20USP%20MC%20was%20launched,legally%20marketed%20in%20any%20country",
   :db/ident :idmp-ra/USPharmacopeiaMedicinesCompendium,
   :lcc-lr/hasTextualName "U.S. Pharmacopeia Medicines Compendium",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "U.S. Pharmacopeia Medicines Compendium",
   :skos/definition
   "all-online compendium that provides monographs and reference materials for chemical and biological medicines and excipients legally marketed in any country"})

(def UniqueIngredientNumber
  "10-character, randomly generated alpha-numeric string that is used to identify substances in medicinal products in the FDA Global Substance Registration System (G-SRS)"
  {:cmns-av/abbreviation "UNII",
   :cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.1.5",
   :db/ident :idmp-ra/UniqueIngredientNumber,
   :rdf/type :owl/Class,
   :rdfs/label "unique ingredient number",
   :rdfs/subClassOf [:idmp-sub/SubstanceCode
                     {:owl/hasValue :idmp-ra/GlobalSubstanceRegistrationSystem,
                      :owl/onProperty :cmns-ra/isRegisteredIn,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :cmns-id/identifies,
                      :owl/someValuesFrom :idmp-sub/Substance,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue
                      :idmp-ra/FoodAndDrugAdministrationRegistrationAuthority,
                      :owl/onProperty :cmns-ra/hasRegistrationAuthority,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "10-character, randomly generated alpha-numeric string that is used to identify substances in medicinal products in the FDA Global Substance Registration System (G-SRS)",
   :skos/note
   "The first nine characters are randomly generated followed by a check character. The integrity check on the UNII is stronger than both the EC# and the CAS Registry Number because of the random generation from a large number of potential UNIIs and the fact that there are 36 possible check characters compared to 10 with both the EC# and CAS Registry Number.",
   :skos/scopeNote
   "The UNII is freely available for use and there is a mechanism whereby a manufacturer can petition for the generation of a UNII through the FDA. The system has the capability for both public and restricted access to information, and can be adapted to produce specified substance identifiers."})

(def UnitedNationsSustainableDevelopmentGoals
  {:cmns-av/directSource
   "https://www.who.int/data/gho/data/themes/sustainable-development-goals",
   :cmns-ra/isManagedBy :idmp-ra/WorldHealthOrganizationRegistrationAuthority,
   :db/ident :idmp-ra/UnitedNationsSustainableDevelopmentGoals,
   :lcc-lr/hasTextualName "The United Nations Sustainable Development Goals",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "United Nations sustainable development goals"})

(def UnitedStatesFoodAndDrugAdministration
  "U.S. government agency responsible for protecting the public health by ensuring the safety, efficacy, and security of human and veterinary drugs, biological products, and medical devices; and by ensuring the safety of our nation's food supply, cosmetics, and products that emit radiation."
  {:cmns-av/abbreviation "FDA",
   :cmns-av/explanatoryNote
   "FDA is responsible for advancing the public health by helping to speed innovations that make medical products more effective, safer, and more affordable and by helping the public get the accurate, science-based information they need to use medical products and foods to maintain and improve their health.",
   :db/ident :idmp-ra/UnitedStatesFoodAndDrugAdministration,
   :rdf/type [:cmns-pts/Party :owl/NamedIndividual],
   :rdfs/label "United States Food and Drug Administration",
   :rdfs/seeAlso "https://www.fda.gov/",
   :skos/definition
   "U.S. government agency responsible for protecting the public health by ensuring the safety, efficacy, and security of human and veterinary drugs, biological products, and medical devices; and by ensuring the safety of our nation's food supply, cosmetics, and products that emit radiation."})

(def UnitedStatesJurisdiction
  "individual representing the overall jurisdiction for the United States, namely, that of the Supreme Court of the United States, federal courts and regulatory agencies"
  {:cmns-av/adaptedFrom "http://www.uscourts.gov/about-federal-courts",
   :cmns-rga/hasReach :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :idmp-ra/UnitedStatesJurisdiction,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "United States jurisdiction",
   :skos/definition
   "individual representing the overall jurisdiction for the United States, namely, that of the Supreme Court of the United States, federal courts and regulatory agencies"})

(def UniversityOfCaliforniaSanFrancisoFederalDrugAdministrationTransport
  "standardized and publicly accessible website for archiving and disseminating information on mammalian transporter interactions with xenobiotics, including pharmaceuticals and environmental chemicals"
  {:cmns-av/directSource "https://transportal.compbio.ucsf.edu/",
   :db/ident
   :idmp-ra/UniversityOfCaliforniaSanFrancisoFederalDrugAdministrationTransport,
   :lcc-lr/hasTextualName
   "University of California, San Franciso Federal Drug Administration TransPortal",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/altLabel "UCSF-FDA TransPortal",
   :rdfs/label
   "University of California, San Franciso Federal Drug Administration TransPortal",
   :skos/definition
   "standardized and publicly accessible website for archiving and disseminating information on mammalian transporter interactions with xenobiotics, including pharmaceuticals and environmental chemicals"})

(def VeteransHealthAdministration
  "U.S. government healthcare organization that provides primary care, specialized care, and related medical and social support services to American veterans"
  {:cmns-av/abbreviation "VHA",
   :cmns-av/directSource
   "https://www.usa.gov/federal-agencies/veterans-health-administration",
   :db/ident :idmp-ra/VeteransHealthAdministration,
   :rdf/type [:cmns-pts/Party :owl/NamedIndividual],
   :rdfs/label "Veterans Health Administration",
   :rdfs/seeAlso "https://www.va.gov/health/aboutvha.asp",
   :skos/definition
   "U.S. government healthcare organization that provides primary care, specialized care, and related medical and social support services to American veterans"})

(def VeteransHealthAdministrationRegistrationAuthority
  "Veterans Health Administration in its role as a Registration Authority (RA)"
  {:cmns-pts/isPlayedBy :idmp-ra/VeteransHealthAdministration,
   :cmns-ra/manages :idmp-ra/NationalDrugFileReferenceTerminology,
   :db/ident :idmp-ra/VeteransHealthAdministrationRegistrationAuthority,
   :rdf/type [:cmns-ra/RegistrationAuthority :owl/NamedIndividual],
   :rdfs/label "Veterans Health Administration Registration Authority",
   :skos/definition
   "Veterans Health Administration in its role as a Registration Authority (RA)"})

(def WorldHealthOrganization
  "United Nations agency that connects nations, partners and people to promote health, keep the world safe and serve the vulnerable – so everyone, everywhere can attain the highest level of health"
  {:cmns-av/abbreviation "WHO",
   :cmns-av/explanatoryNote
   "WHO leads global efforts to expand universal health coverage. We direct and coordinate the world’s response to health emergencies. And we promote healthier lives – from pregnancy care through old age. Our Triple Billion targets outline an ambitious plan for the world to achieve good health for all using science-based policies and programmes.",
   :db/ident :idmp-ra/WorldHealthOrganization,
   :rdf/type [:cmns-pts/Party :owl/NamedIndividual],
   :rdfs/label "World Health Organization",
   :rdfs/seeAlso "https://www.who.int/",
   :skos/definition
   "United Nations agency that connects nations, partners and people to promote health, keep the world safe and serve the vulnerable – so everyone, everywhere can attain the highest level of health"})

(def WorldHealthOrganizationInternationalPharmacopoeia
  "online collection of recommended procedures for analysis and specifications for the determination of pharmaceutical substances and dosage forms that is intended to serve as source material for reference or adaptation by any WHO Member State wishing to establish pharmaceutical requirements"
  {:cmns-av/directSource "https://www.guidetopharmacology.org/",
   :db/ident :idmp-ra/WorldHealthOrganizationInternationalPharmacopoeia,
   :lcc-lr/hasTextualName
   "World Health Organization International Pharmacopoeia",
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "World Health Organization International Pharmacopoeia",
   :skos/definition
   "online collection of recommended procedures for analysis and specifications for the determination of pharmaceutical substances and dosage forms that is intended to serve as source material for reference or adaptation by any WHO Member State wishing to establish pharmaceutical requirements"})

(def WorldHealthOrganizationRegistrationAuthority
  "World Health Organization (WHO) in its role as a Registration Authority (RA)"
  {:cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 4.2.2",
   :cmns-pts/isPlayedBy :idmp-ra/WorldHealthOrganization,
   :cmns-ra/manages :idmp-ra/AnatomicalTherapeuticChemicalClassificationSystem,
   :db/ident :idmp-ra/WorldHealthOrganizationRegistrationAuthority,
   :rdf/type [:cmns-ra/RegistrationAuthority :owl/NamedIndividual],
   :rdfs/label "World Health Organization Registration Authority",
   :skos/definition
   "World Health Organization (WHO) in its role as a Registration Authority (RA)"})