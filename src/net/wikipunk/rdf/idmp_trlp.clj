(ns net.wikipunk.rdf.idmp-trlp
  "This ontology provides an example for some of the data related to the substance, terlipressin and products that include it, to demonstrate substance and basis of strength representation with respect to jurisdiction-specific variations."
  {:cmns-av/copyright ["Copyright (c) 2022 EDM Council, Inc."
                       "Copyright (c) 2022 Pistoia Alliance, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/EXT/Examples/TerlipressinExample.rdf",
   :dcterms/abstract
   "This ontology provides an example for some of the data related to the substance, terlipressin and products that include it, to demonstrate substance and basis of strength representation with respect to jurisdiction-specific variations.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :idmp-chg/hasMaturityLevel :idmp-chg/Informative,
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/"
    "https://www.omg.org/spec/Commons/RegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/Organizations/"
    "https://www.omg.org/spec/Commons/ProductsAndServices/"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://www.omg.org/spec/Commons/PartiesAndSituations/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://www.omg.org/spec/Commons/RegistrationAuthorities/"
    "https://www.omg.org/spec/Commons/Documents/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11240-UnitsOfMeasurement/"
    "https://www.omg.org/spec/Commons/TextDatatype/"
    "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegistrationAuthorities/"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Extensions/UnifiedCodeForUnitsOfMeasure/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-RegistrationAuthorities/"
    "https://www.omg.org/spec/Commons/Designators/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/20221201/Examples/TerlipressinExample/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-ge-euj"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-org" "https://www.omg.org/spec/Commons/Organizations/",
    "cmns-prd" "https://www.omg.org/spec/Commons/ProductsAndServices/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "cmns-ra" "https://www.omg.org/spec/Commons/RegistrationAuthorities/",
    "cmns-rga" "https://www.omg.org/spec/Commons/RegulatoryAgencies/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "idmp-dtp"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/",
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
    "idmp-ucum"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Extensions/UnifiedCodeForUnitsOfMeasure/",
    "idmp-uom"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11240-UnitsOfMeasurement/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-639-1"
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/TerlipressinExample/",
   :rdfa/prefix "idmp-trlp",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/TerlipressinExample/",
   :rdfs/label "Terlipressin Example Ontology"})

(def GSKAsManufacturer
  {:cmns-prd/produces
   [:idmp-trlp/TerlipressinSUN1MgSolutionForInjection
    :idmp-trlp/TerlipressinSUN0.1MgPerMlSolutionForInjection
    :idmp-trlp/TerlipressinAcetateSUN0.12MgPerMlSolutionForInjection],
   :cmns-pts/isPlayedBy :idmp-trlp/GSKplc,
   :db/ident :idmp-trlp/GSKAsManufacturer,
   :rdf/type [:idmp-sub/Manufacturer :owl/NamedIndividual],
   :rdfs/label "GSK as manufacturer"})

(def GSKplc
  {:cmns-dsg/hasDescription
   "global biopharma company with the ambition and purpose to unite science, technology and talent to get ahead of disease together whose headquarters is located in Brentford, Middlesex, United Kingdom",
   :db/ident   :idmp-trlp/GSKplc,
   :rdf/type   [:cmns-org/LegalEntity :owl/NamedIndividual],
   :rdfs/label "GSK plc."})

(def Terlipressin
  "protein that is an analogue of vasopressin used as a vasoactive drug in the management of low blood pressure"
  {:db/ident :idmp-trlp/Terlipressin,
   :dcterms/source "https://chem.nlm.nih.gov/chemidplus/rn/14636-12-5",
   :idmp-sub/hasMolecularFormula "C52H75O15N16S2",
   :idmp-sub/hasMolecularFormulaByMoiety "C52H75O15N16S2",
   :idmp-sub/hasMolecularWeight :idmp-trlp/TerlipressinMolecularWeight,
   :idmp-sub/hasStructure :idmp-trlp/TerlipressinMolecularStructure,
   :idmp-sub/isActiveMoietyOf :idmp-trlp/TerlipressinAcetate,
   :rdf/type
   [:owl/NamedIndividual :idmp-sub/ChemicalSubstance :idmp-sub/Moiety],
   :rdfs/label "terlipressin",
   :skos/definition
   "protein that is an analogue of vasopressin used as a vasoactive drug in the management of low blood pressure",
   :skos/note
   ["It has been found to be effective when norepinephrine does not help. Indications for use include norepinephrine-resistant septic shock and hepatorenal syndrome. In addition, it is used to treat bleeding esophageal varices."
    "Terlipressin is currently not available in the United States, or Canada, but it is available in New Zealand, Australia, much of Europe, India, Pakistan and UAE."]})

(def TerlipressinAcetate
  "analogue of vasopressin used as a vasoactive for proteomics research"
  {:db/ident :idmp-trlp/TerlipressinAcetate,
   :idmp-sub/hasActiveMoiety :idmp-trlp/Terlipressin,
   :idmp-sub/hasMolecularFormula "C56H92N16O24S2",
   :idmp-sub/hasMolecularFormulaByMoiety "C52H74N16O15S2.2C2H4O2.5H2O",
   :idmp-sub/hasMolecularWeight :idmp-trlp/TerlipressinAcetateMolecularWeight,
   :idmp-sub/hasStructure :idmp-trlp/TerlipressinAcetateMolecularStructure,
   :rdf/type [:idmp-sub/Salt :owl/NamedIndividual :idmp-sub/ChemicalSubstance],
   :rdfs/label "terlipressin acetate",
   :skos/definition
   "analogue of vasopressin used as a vasoactive for proteomics research",
   :skos/note
   "Synonyms for terlipressin acetate include Gly-Gly-Gly-Cys-Tyr-Phe-Gln-Asn-Cys-Pro-Lys-Gly-Nh2 (4-9 Disulfide) Acetate, and as N-(N-(N-Glycylglycyl)Glycyl)-8-L-Lysinevasopressin Acetate."})

(def TerlipressinAcetateAsActiveIngredientInTerlipressinAcetateSUN
  "terlipressin acetate in the role of an active ingredient in terlipressin acetate SUN solution for injection"
  {:cmns-pts/isPlayedBy :idmp-trlp/TerlipressinAcetate,
   :cmns-pts/isRealizedIn :idmp-trlp/TerlipressinAcetateSUNConstituency,
   :db/ident
   :idmp-trlp/TerlipressinAcetateAsActiveIngredientInTerlipressinAcetateSUN,
   :idmp-mprd/hasBasisOfStrengthAsManufactured
   :idmp-trlp/TerlipressinAcetateStrengthAsManufacturedInTerlipressinAcetate1MgPerAmpouleSolutionForInjection,
   :idmp-mprd/hasStrength
   :idmp-trlp/TerlipressinAcetatePresentationStrengthInTerlipressinAcetateSUN1MgPerAmpouleSolutionForInjection,
   :rdf/type [:idmp-sub/ActiveIngredient :owl/NamedIndividual],
   :rdfs/label
   "terlipressin acetate as active ingredient in terlipressin acetate SUN",
   :skos/definition
   "terlipressin acetate in the role of an active ingredient in terlipressin acetate SUN solution for injection"})

(def TerlipressinAcetateCommonName
  {:cmns-cxtdsg/isApplicableIn
   [:cmns-ge-euj/EuropeanUnionJurisdiction
    :idmp-ra/RegulatoryContext-FoodAndDrugAdministrationGeneral],
   :cmns-dsg/isNameOf :idmp-trlp/TerlipressinAcetate,
   :cmns-ra/isRegisteredBy
   [:idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority
    :idmp-ra/FoodAndDrugAdministrationRegistrationAuthority],
   :cmns-ra/isRegisteredIn [:idmp-eura/SummaryOfProductCharacteristics
                            :idmp-ra/GlobalSubstanceRegistrationSystem],
   :db/ident :idmp-trlp/TerlipressinAcetateCommonName,
   :idmp-dtp/hasLanguageCode :lcc-639-1/en,
   :idmp-sub/hasSubstanceNameType :idmp-sub/SubstanceNameClassifier-CommonName,
   :idmp-sub/hasSubstanceNameValue "terlipressin diacetate pentahydrate",
   :rdf/type [:owl/NamedIndividual :idmp-ra/InternationalNonproprietaryName],
   :rdfs/label "terlipressin acetate common name"})

(def
  TerlipressinAcetateConcentrationStrengthInTerlipressinAcetate1MgPerAmpouleSolutionForInjection
  {:cmns-doc/refersTo :idmp-trlp/TerlipressinAcetate,
   :cmns-qtu/hasDenominator
   :idmp-trlp/TerlipressinAcetateDenominatorInTerlipressinAcetate1MgPerAmpouleSolutionForInjectionConcentrationStrength,
   :cmns-qtu/hasNumerator
   :idmp-trlp/TerlipressinAcetateNumeratorInTerlipressinAcetate1MgPerAmpouleSolutionForInjectionConcentrationStrength,
   :db/ident
   :idmp-trlp/TerlipressinAcetateConcentrationStrengthInTerlipressinAcetate1MgPerAmpouleSolutionForInjection,
   :rdf/type
   [:idmp-mprd/MassBasedStrength :idmp-mprd/Concentration :owl/NamedIndividual],
   :rdfs/label
   "terlipressin acetate concentration strength in terlipressin acetate 1 mg per ampoule solution for injection"})

(def TerlipressinAcetateConstituency
  {:cmns-cxtdsg/isApplicableIn :cmns-ge-euj/EuropeanUnionJurisdiction,
   :cmns-dsg/defines :idmp-trlp/TerlipressinAcetate,
   :cmns-pts/hasRole :idmp-trlp/TerlipressinAsActiveMoiety,
   :db/ident         :idmp-trlp/TerlipressinAcetateConstituency,
   :rdf/type         [:idmp-sub/SubstanceConstituency :owl/NamedIndividual],
   :rdfs/label       "terlipressin acetate constituency"})

(def
  TerlipressinAcetateDenominatorInTerlipressinAcetate1MgPerAmpouleSolutionForInjectionConcentrationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Milliliter,
   :cmns-qtu/hasNumericValue 1,
   :db/ident
   :idmp-trlp/TerlipressinAcetateDenominatorInTerlipressinAcetate1MgPerAmpouleSolutionForInjectionConcentrationStrength,
   :rdf/type [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label
   "terlipressin acetate denominator in terlipressin acetate 1 mg/1 ampoule solution for injection concentration strength"})

(def
  TerlipressinAcetateDenominatorInTerlipressinSUN1MgSolutionForInjectionPresentationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Ampoule,
   :cmns-qtu/hasNumericValue 1,
   :db/ident
   :idmp-trlp/TerlipressinAcetateDenominatorInTerlipressinSUN1MgSolutionForInjectionPresentationStrength,
   :rdf/type [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label
   "terlipressin acetate denominator in terlipressin SUN 1 mg solution for injection presentation strength"})

(def TerlipressinAcetateMolecularStructure
  {:db/ident     :idmp-trlp/TerlipressinAcetateMolecularStructure,
   :rdf/type     [:idmp-sub/MolecularStructure :owl/NamedIndividual],
   :rdfs/label   "terlipressin acetate molecular structure",
   :rdfs/seeAlso "https://go.drugbank.com/salts/DBSALT002332"})

(def TerlipressinAcetateMolecularWeight
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/GramsPerMole,
   :cmns-qtu/hasNumericValue 1437.55M,
   :db/ident   :idmp-trlp/TerlipressinAcetateMolecularWeight,
   :rdf/type   [:idmp-sub/MolecularWeight :owl/NamedIndividual],
   :rdfs/label "terlipressin acetate molecular weight"})

(def
  TerlipressinAcetateNumeratorInTerlipressinAcetate1MgPerAmpouleSolutionForInjectionConcentrationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Milligram,
   :cmns-qtu/hasNumericValue 0.12M,
   :db/ident
   :idmp-trlp/TerlipressinAcetateNumeratorInTerlipressinAcetate1MgPerAmpouleSolutionForInjectionConcentrationStrength,
   :rdf/type [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label
   "terlipressin acetate numerator in terlipressin acetate 1 mg/1 ampoule solution for injection concentration strength"})

(def
  TerlipressinAcetateNumeratorInTerlipressinSUN1MgSolutionForInjectionPresentationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Milligram,
   :cmns-qtu/hasNumericValue 1,
   :db/ident
   :idmp-trlp/TerlipressinAcetateNumeratorInTerlipressinSUN1MgSolutionForInjectionPresentationStrength,
   :rdf/type [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label
   "terlipressin acetate numerator in terlipressin SUN 1 mg solution for injection presentation strength"})

(def TerlipressinAcetatePreferredName
  {:cmns-cxtdsg/isApplicableIn
   [:idmp-ra/RegulatoryContext-FoodAndDrugAdministrationGeneral
    :cmns-ge-euj/EuropeanUnionJurisdiction],
   :cmns-dsg/isNameOf :idmp-trlp/TerlipressinAcetate,
   :cmns-ra/isRegisteredBy
   [:idmp-ra/FoodAndDrugAdministrationRegistrationAuthority
    :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority],
   :cmns-ra/isRegisteredIn [:idmp-eura/SummaryOfProductCharacteristics
                            :idmp-ra/GlobalSubstanceRegistrationSystem],
   :db/ident :idmp-trlp/TerlipressinAcetatePreferredName,
   :idmp-dtp/hasLanguageCode :lcc-639-1/en,
   :idmp-sub/hasSubstanceNameType
   :idmp-sub/SubstanceNameClassifier-PreferredName,
   :idmp-sub/hasSubstanceNameValue "terlipressin acetate",
   :rdf/type [:owl/NamedIndividual :idmp-ra/InternationalNonproprietaryName],
   :rdfs/label "terlipressin acetate preferred name"})

(def
  TerlipressinAcetatePresentationStrengthInTerlipressinAcetateSUN1MgPerAmpouleSolutionForInjection
  {:cmns-doc/refersTo :idmp-trlp/TerlipressinAcetate,
   :cmns-qtu/hasDenominator
   :idmp-trlp/TerlipressinAcetateDenominatorInTerlipressinSUN1MgSolutionForInjectionPresentationStrength,
   :cmns-qtu/hasNumerator
   :idmp-trlp/TerlipressinAcetateNumeratorInTerlipressinSUN1MgSolutionForInjectionPresentationStrength,
   :db/ident
   :idmp-trlp/TerlipressinAcetatePresentationStrengthInTerlipressinAcetateSUN1MgPerAmpouleSolutionForInjection,
   :rdf/type [:idmp-mprd/MassBasedStrength :owl/NamedIndividual],
   :rdfs/label
   "terlipressin acetate presentation strength in terlipressin SUN 1 mg per ampoule solution for injection"})

(def TerlipressinAcetateSUN
  "pharmaceutical product that is terlipressin acetate solution for injection"
  {:cmns-dsg/isDefinedIn :idmp-trlp/TerlipressinAcetateSUNConstituency,
   :db/ident :idmp-trlp/TerlipressinAcetateSUN,
   :rdf/type [:idmp-mprd/PharmaceuticalProduct :owl/NamedIndividual],
   :rdfs/label "terlipressin acetate SUN",
   :skos/definition
   "pharmaceutical product that is terlipressin acetate solution for injection"})

(def TerlipressinAcetateSUN0.12MgPerMlSolutionForInjection
  "terlipressin acetate as marketed in the United Kingdom"
  {:cmns-col/comprises :idmp-trlp/TerlipressinAcetateSUN,
   :cmns-dsg/isDefinedIn
   :idmp-trlp/TerlipressinAcetateSUN0.12MgPerMlSolutionForInjectionConstituency,
   :db/ident :idmp-trlp/TerlipressinAcetateSUN0.12MgPerMlSolutionForInjection,
   :rdf/type [:idmp-mprd/MedicinalProduct :owl/NamedIndividual],
   :rdfs/label "terlipressin acetate SUN 0.12 mg/ml solution for injection",
   :skos/definition "terlipressin acetate as marketed in the United Kingdom"})

(def TerlipressinAcetateSUN0.12MgPerMlSolutionForInjectionConstituency
  {:cmns-dsg/defines
   :idmp-trlp/TerlipressinAcetateSUN0.12MgPerMlSolutionForInjection,
   :cmns-rga/isApplicableInJurisdiction
   :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :db/ident
   :idmp-trlp/TerlipressinAcetateSUN0.12MgPerMlSolutionForInjectionConstituency,
   :idmp-mprd/hasIngredient
   :idmp-trlp/TerlipressinAsReferenceStrengthInTerlipressinAcetate1MgPerAmpouleSolutionForInjection,
   :rdf/type [:idmp-mprd/ProductConstituency :owl/NamedIndividual],
   :rdfs/label
   "terlipressin acetate SUN 0.12 mg/ml solution for injection constituency"})

(def TerlipressinAcetateSUNConstituency
  {:cmns-dsg/defines :idmp-trlp/TerlipressinAcetateSUN,
   :db/ident         :idmp-trlp/TerlipressinAcetateSUNConstituency,
   :idmp-mprd/hasActiveIngredient
   :idmp-trlp/TerlipressinAcetateAsActiveIngredientInTerlipressinAcetateSUN,
   :rdf/type         [:idmp-mprd/ProductConstituency :owl/NamedIndividual],
   :rdfs/label       "terlipressin acetate SUN constituency"})

(def
  TerlipressinAcetateStrengthAsManufacturedInTerlipressinAcetate1MgPerAmpouleSolutionForInjection
  "terlipressin acetate in the role of an active ingredient that provides the basis of strength in terlipressin acetate 1 mg per ampoule solution for injection as manufactured, where the entire substance acts as the basis of strength"
  {:cmns-pts/isPlayedBy :idmp-trlp/TerlipressinAcetate,
   :cmns-pts/isRealizedIn :idmp-trlp/TerlipressinAcetateSUNConstituency,
   :db/ident
   :idmp-trlp/TerlipressinAcetateStrengthAsManufacturedInTerlipressinAcetate1MgPerAmpouleSolutionForInjection,
   :idmp-mprd/hasStrength
   [:idmp-trlp/TerlipressinAcetatePresentationStrengthInTerlipressinAcetateSUN1MgPerAmpouleSolutionForInjection
    :idmp-trlp/TerlipressinAcetateConcentrationStrengthInTerlipressinAcetate1MgPerAmpouleSolutionForInjection],
   :rdf/type [:idmp-mprd/ActiveIngredientEntireSubstanceBasisOfStrength
              :owl/NamedIndividual],
   :rdfs/label
   "terlipressin acetate strength as manufactured in terlipressin acetate 1 mg per ampoule solution for injection",
   :skos/definition
   "terlipressin acetate in the role of an active ingredient that provides the basis of strength in terlipressin acetate 1 mg per ampoule solution for injection as manufactured, where the entire substance acts as the basis of strength"})

(def TerlipressinAsActiveMoiety
  "terlipressin in the role of an active moiety"
  {:cmns-cxtdsg/isApplicableIn
   [:cmns-ge-euj/EuropeanUnionJurisdiction
    :idmp-ra/RegulatoryContext-FoodAndDrugAdministrationGeneral],
   :cmns-pts/isPlayedBy :idmp-trlp/Terlipressin,
   :db/ident            :idmp-trlp/TerlipressinAsActiveMoiety,
   :rdf/type            [:idmp-sub/ActiveMoietyRole :owl/NamedIndividual],
   :rdfs/label          "terlipressin as active moiety",
   :skos/definition     "terlipressin in the role of an active moiety"})

(def
  TerlipressinAsReferenceConcentrationStrengthInTerlipressinAcetate1MgPerMlSolutionForInjection
  {:cmns-doc/refersTo :idmp-trlp/Terlipressin,
   :cmns-qtu/hasDenominator
   :idmp-trlp/TerlipressinDenominatorInTerlipressinAcetate1MgPerMlSolutionForInjectionConcentrationStrength,
   :cmns-qtu/hasNumerator
   :idmp-trlp/TerlipressinNumeratorInTerlipressinAcetate1MgPerMlSolutionForInjectionConcentrationStrength,
   :db/ident
   :idmp-trlp/TerlipressinAsReferenceConcentrationStrengthInTerlipressinAcetate1MgPerMlSolutionForInjection,
   :rdf/type
   [:idmp-mprd/MassBasedStrength :idmp-mprd/Concentration :owl/NamedIndividual],
   :rdfs/label
   "terlipressin as reference (concentration) strength in terlipressin acetate 1 mg/ml solution for injection"})

(def
  TerlipressinAsReferencePresentationStrengthInTerlipressinAcetate1MgPerMlSolutionForInjection
  {:cmns-doc/refersTo :idmp-trlp/Terlipressin,
   :cmns-qtu/hasDenominator
   :idmp-trlp/TerlipressinDenominatorInTerlipressinAcetate1MgPerMlSolutionForInjectionPresentationStrength,
   :cmns-qtu/hasNumerator
   :idmp-trlp/TerlipressinNumeratorInTerlipressinAcetate1MgPerMlSolutionForInjectionPresentationStrength,
   :db/ident
   :idmp-trlp/TerlipressinAsReferencePresentationStrengthInTerlipressinAcetate1MgPerMlSolutionForInjection,
   :rdf/type [:idmp-mprd/MassBasedStrength :owl/NamedIndividual],
   :rdfs/label
   "terlipressin as reference (presentation) strength in terlipressin acetate 1 mg/ml solution for injection"})

(def
  TerlipressinAsReferenceStrengthInTerlipressinAcetate1MgPerAmpouleSolutionForInjection
  "terlipressin in the role of an active moiety that provides the reference strength in terlipressin acetate 1 mg per ampoule solution for injection"
  {:cmns-pts/isPlayedBy :idmp-trlp/Terlipressin,
   :cmns-pts/isRealizedIn
   [:idmp-trlp/TerlipressinAcetateSUN0.12MgPerMlSolutionForInjectionConstituency
    :idmp-trlp/TerlipressinSUN1MgSolutionForInjectionConstituency
    :idmp-trlp/TerlipressinSUN0.1MgPerMlSolutionForInjectionConstituency],
   :db/ident
   :idmp-trlp/TerlipressinAsReferenceStrengthInTerlipressinAcetate1MgPerAmpouleSolutionForInjection,
   :idmp-mprd/hasReferenceStrength
   [:idmp-trlp/TerlipressinAsReferencePresentationStrengthInTerlipressinAcetate1MgPerMlSolutionForInjection
    :idmp-trlp/TerlipressinAsReferenceConcentrationStrengthInTerlipressinAcetate1MgPerMlSolutionForInjection],
   :rdf/type [:owl/NamedIndividual
              :idmp-mprd/ActiveIngredientActiveMoietyBasisOfStrength],
   :rdfs/label
   "terlipressin as reference strength in terlipressin acetate 1 mg per ampoule solution for injection",
   :skos/definition
   "terlipressin in the role of an active moiety that provides the reference strength in terlipressin acetate 1 mg per ampoule solution for injection"})

(def TerlipressinCommonName
  {:cmns-cxtdsg/isApplicableIn
   [:idmp-ra/RegulatoryContext-FoodAndDrugAdministrationGeneral
    :cmns-ge-euj/EuropeanUnionJurisdiction],
   :cmns-dsg/isNameOf :idmp-trlp/Terlipressin,
   :cmns-ra/isRegisteredBy
   [:idmp-ra/FoodAndDrugAdministrationRegistrationAuthority
    :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority],
   :cmns-ra/isRegisteredIn [:idmp-ra/GlobalSubstanceRegistrationSystem
                            :idmp-eura/SummaryOfProductCharacteristics],
   :db/ident :idmp-trlp/TerlipressinCommonName,
   :idmp-dtp/hasLanguageCode :lcc-639-1/en,
   :idmp-sub/hasSubstanceNameType :idmp-sub/SubstanceNameClassifier-CommonName,
   :idmp-sub/hasSubstanceNameValue "Terlipressin [INN]",
   :rdf/type [:owl/NamedIndividual :idmp-ra/InternationalNonproprietaryName],
   :rdfs/label "terlipressin common name"})

(def
  TerlipressinDenominatorInTerlipressinAcetate1MgPerMlSolutionForInjectionConcentrationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Milliliter,
   :cmns-qtu/hasNumericValue 1,
   :db/ident
   :idmp-trlp/TerlipressinDenominatorInTerlipressinAcetate1MgPerMlSolutionForInjectionConcentrationStrength,
   :rdf/type [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label
   "terlipressin denominator in terlipressin acetate 1 mg/ml solution for injection concentration strength"})

(def
  TerlipressinDenominatorInTerlipressinAcetate1MgPerMlSolutionForInjectionPresentationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Ampoule,
   :cmns-qtu/hasNumericValue 1,
   :db/ident
   :idmp-trlp/TerlipressinDenominatorInTerlipressinAcetate1MgPerMlSolutionForInjectionPresentationStrength,
   :rdf/type [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label
   "terlipressin denominator in terlipressin acetate 1 mg/ml solution for injection presentation strength"})

(def TerlipressinMolecularStructure
  {:db/ident   :idmp-trlp/TerlipressinMolecularStructure,
   :idmp-sub/hasSimplifiedMolecularInputLineEntrySpecification
   "O=C(N)CNC(=O)[C@@H](NC(=O)[C@H]4N(C(=O)[C@H]1NC(=O)[C@@H](NC(=O)[C@@H](NC(=O)[C@@H](NC(=O)[C@@H](NC(=O)[C@@H](NC(=O)CNC(=O)CNC(=O)CN)CSSC1)Cc2ccc(O)cc2)Cc3ccccc3)CCC(=O)N)CC(=O)N)CCC4)CCCCN",
   :rdf/type   [:idmp-sub/MolecularStructure :owl/NamedIndividual],
   :rdfs/label "terlipressin molecular structure"})

(def TerlipressinMolecularWeight
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/GramsPerMole,
   :cmns-qtu/hasNumericValue 1227.39M,
   :db/ident   :idmp-trlp/TerlipressinMolecularWeight,
   :rdf/type   [:idmp-sub/MolecularWeight :owl/NamedIndividual],
   :rdfs/label "terlipressin molecular weight"})

(def
  TerlipressinNumeratorInTerlipressinAcetate1MgPerMlSolutionForInjectionConcentrationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Milligram,
   :cmns-qtu/hasNumericValue 0.1M,
   :db/ident
   :idmp-trlp/TerlipressinNumeratorInTerlipressinAcetate1MgPerMlSolutionForInjectionConcentrationStrength,
   :rdf/type [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label
   "terlipressin numerator in terlipressin acetate 1 mg/ml solution for injection concentration strength"})

(def
  TerlipressinNumeratorInTerlipressinAcetate1MgPerMlSolutionForInjectionPresentationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Milligram,
   :cmns-qtu/hasNumericValue 0.85M,
   :db/ident
   :idmp-trlp/TerlipressinNumeratorInTerlipressinAcetate1MgPerMlSolutionForInjectionPresentationStrength,
   :rdf/type [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label
   "terlipressin numerator in terlipressin acetate 1 mg/ml solution for injection presentation strength"})

(def TerlipressinOfficialName
  {:cmns-cls/isClassifiedBy :idmp-sub/OfficialNameStatus-Current,
   :cmns-cxtdsg/isApplicableIn
   [:cmns-ge-euj/EuropeanUnionJurisdiction
    :idmp-ra/RegulatoryContext-FoodAndDrugAdministrationGeneral],
   :cmns-dsg/isNameOf :idmp-trlp/Terlipressin,
   :cmns-ra/isRegisteredBy
   [:idmp-ra/FoodAndDrugAdministrationRegistrationAuthority
    :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority],
   :cmns-ra/isRegisteredIn [:idmp-ra/GlobalSubstanceRegistrationSystem
                            :idmp-eura/SummaryOfProductCharacteristics],
   :db/ident :idmp-trlp/TerlipressinOfficialName,
   :idmp-dtp/hasLanguageCode :lcc-639-1/en,
   :idmp-sub/hasSubstanceNameType
   :idmp-sub/SubstanceNameClassifier-OfficialName,
   :idmp-sub/hasSubstanceNameValue "terlipressin",
   :rdf/type [:idmp-ra/InternationalNonproprietaryName
              :idmp-sub/OfficialName
              :owl/NamedIndividual],
   :rdfs/label "terlipressin official name"})

(def TerlipressinSUN0.1MgPerMlSolutionForInjection
  "terlipressin as marketed in the Netherlands"
  {:cmns-col/comprises :idmp-trlp/TerlipressinAcetateSUN,
   :cmns-dsg/isDefinedIn
   :idmp-trlp/TerlipressinSUN0.1MgPerMlSolutionForInjectionConstituency,
   :db/ident           :idmp-trlp/TerlipressinSUN0.1MgPerMlSolutionForInjection,
   :rdf/type           [:idmp-mprd/MedicinalProduct :owl/NamedIndividual],
   :rdfs/label         "terlipressin SUN 0.1 mg/ml solution for injection",
   :skos/definition    "terlipressin as marketed in the Netherlands"})

(def TerlipressinSUN0.1MgPerMlSolutionForInjectionConstituency
  {:cmns-dsg/defines :idmp-trlp/TerlipressinSUN0.1MgPerMlSolutionForInjection,
   :cmns-rga/isApplicableInJurisdiction :lcc-3166-1/Netherlands,
   :db/ident
   :idmp-trlp/TerlipressinSUN0.1MgPerMlSolutionForInjectionConstituency,
   :idmp-mprd/hasIngredient
   :idmp-trlp/TerlipressinAsReferenceStrengthInTerlipressinAcetate1MgPerAmpouleSolutionForInjection,
   :idmp-mprd/hasReferenceSubstance :idmp-trlp/Terlipressin,
   :rdf/type [:idmp-mprd/ProductConstituency :owl/NamedIndividual],
   :rdfs/label
   "terlipressin SUN 0.1 mg/ml solution for injection constituency"})

(def TerlipressinSUN1MgSolutionForInjection
  "terlipressin as marketed in Sweden"
  {:cmns-col/comprises :idmp-trlp/TerlipressinAcetateSUN,
   :cmns-dsg/isDefinedIn
   :idmp-trlp/TerlipressinSUN1MgSolutionForInjectionConstituency,
   :db/ident           :idmp-trlp/TerlipressinSUN1MgSolutionForInjection,
   :rdf/type           [:idmp-mprd/MedicinalProduct :owl/NamedIndividual],
   :rdfs/label         "terlipressin SUN 1 mg solution for injection",
   :skos/definition    "terlipressin as marketed in Sweden"})

(def TerlipressinSUN1MgSolutionForInjectionConstituency
  {:cmns-dsg/defines :idmp-trlp/TerlipressinSUN1MgSolutionForInjection,
   :cmns-rga/isApplicableInJurisdiction :lcc-3166-1/Sweden,
   :db/ident :idmp-trlp/TerlipressinSUN1MgSolutionForInjectionConstituency,
   :idmp-mprd/hasIngredient
   :idmp-trlp/TerlipressinAsReferenceStrengthInTerlipressinAcetate1MgPerAmpouleSolutionForInjection,
   :rdf/type [:idmp-mprd/ProductConstituency :owl/NamedIndividual],
   :rdfs/label "terlipressin SUN 1 mg solution for injection constituency"})

(def UNII-4U092XZF0K
  {:cmns-id/identifies
   [:idmp-trlp/TerlipressinAcetate
    "https://gsrs.ncats.nih.gov/api/v1/substances/4U092XZF0K"],
   :cmns-ra/isRegisteredBy
   :idmp-ra/FoodAndDrugAdministrationRegistrationAuthority,
   :cmns-ra/isRegisteredIn :idmp-ra/GlobalSubstanceRegistrationSystem,
   :cmns-txt/hasTextValue "4U092XZF0K",
   :db/ident :idmp-trlp/UNII-4U092XZF0K,
   :dcterms/source "https://precision.fda.gov/uniisearch/srs/unii/4U092XZF0K",
   :rdf/type [:idmp-ra/UniqueIngredientNumber :owl/NamedIndividual],
   :rdfs/label "4U092XZF0K"})

(def UNII-7Z5X49W53P
  {:cmns-id/identifies
   [:idmp-trlp/Terlipressin
    "https://gsrs.ncats.nih.gov/api/v1/substances/7Z5X49W53P"],
   :cmns-ra/isRegisteredBy
   :idmp-ra/FoodAndDrugAdministrationRegistrationAuthority,
   :cmns-ra/isRegisteredIn :idmp-ra/GlobalSubstanceRegistrationSystem,
   :cmns-txt/hasTextValue "7Z5X49W53P",
   :db/ident :idmp-trlp/UNII-7Z5X49W53P,
   :dcterms/source "https://precision.fda.gov/uniisearch/srs/unii/7Z5X49W53P",
   :rdf/type [:idmp-ra/UniqueIngredientNumber :owl/NamedIndividual],
   :rdfs/label "7Z5X49W53P"})