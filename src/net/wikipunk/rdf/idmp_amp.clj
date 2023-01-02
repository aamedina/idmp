(ns net.wikipunk.rdf.idmp-amp
  "This ontology provides an example for some of the data related to the substance, amlodipine, to demonstrate substance and basis of strength representation."
  {:cmns-av/copyright ["Copyright (c) 2022 EDM Council, Inc."
                       "Copyright (c) 2022 Pistoia Alliance, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/EXT/Examples/AmlodipineExample.rdf",
   :dcterms/abstract
   "This ontology provides an example for some of the data related to the substance, amlodipine, to demonstrate substance and basis of strength representation.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :idmp-chg/hasMaturityLevel :idmp-chg/Informative,
   :owl/imports
   ["https://www.omg.org/spec/Commons/TextDatatype/"
    "https://www.omg.org/spec/Commons/Organizations/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/PartiesAndSituations/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/Commons/Designators/"
    "https://www.omg.org/spec/Commons/Documents/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-RegistrationAuthorities/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11240-UnitsOfMeasurement/"
    "https://www.omg.org/spec/Commons/RegistrationAuthorities/"
    "https://www.omg.org/spec/Commons/ProductsAndServices/"
    "https://www.omg.org/spec/Commons/RegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegistrationAuthorities/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Extensions/UnifiedCodeForUnitsOfMeasure/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/"
    "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/20221201/Examples/AmlodipineExample/",
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
    "idmp-amp"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/AmlodipineExample/",
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
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/AmlodipineExample/",
   :rdfa/prefix "idmp-amp",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/AmlodipineExample/",
   :rdfs/label "Amlodipine Example Ontology"})

(def Amlodipine
  "fully substituted dialkyl 1,4-dihydropyridine-3,5-dicarboxylate derivative, which is used for the treatment of hypertension, chronic stable angina and confirmed or suspected vasospastic angina"
  {:cmns-cls/isClassifiedBy :idmp-sub/OpticalActivity-EitherDirection,
   :db/ident :idmp-amp/Amlodipine,
   :dcterms/source
   ["https://www.ebi.ac.uk/chebi/chebiOntology.do?chebiId=CHEBI:2668"
    "https://chem.nlm.nih.gov/chemidplus/rn/88150-42-9"],
   :idmp-sub/hasMolecularFormula "C20H25ClN2O5",
   :idmp-sub/hasMolecularFormulaByMoiety "C20H25ClN2O5",
   :idmp-sub/hasMolecularWeight :idmp-amp/AmlodipineMolecularWeight,
   :idmp-sub/hasNumberOfMoieties 1,
   :idmp-sub/hasStereochemistry :idmp-sub/Stereochemistry-Racemic,
   :idmp-sub/hasStructure :idmp-amp/AmlodipineMolecularStructure,
   :idmp-sub/isActiveMoietyOf [:idmp-amp/AmlodipineBesylate
                               :idmp-amp/AmlodipineMesylateMonohydrate],
   :rdf/type
   [:idmp-sub/ChemicalSubstance :owl/NamedIndividual :idmp-sub/Moiety],
   :rdfs/label "amlodipine",
   :skos/definition
   "fully substituted dialkyl 1,4-dihydropyridine-3,5-dicarboxylate derivative, which is used for the treatment of hypertension, chronic stable angina and confirmed or suspected vasospastic angina",
   :skos/note
   "It is a long-acting dihydropyridine calcium channel blocker effective in the treatment of angina pectoris and hypertension."})

(def AmlodipineAsActiveMoiety
  "amlodipine in the role of an active moiety"
  {:cmns-cxtdsg/isApplicableIn
   [:cmns-ge-euj/EuropeanUnionJurisdiction
    :idmp-ra/RegulatoryContext-FoodAndDrugAdministrationGeneral],
   :cmns-pts/isPlayedBy :idmp-amp/Amlodipine,
   :db/ident            :idmp-amp/AmlodipineAsActiveMoiety,
   :rdf/type            [:idmp-sub/ActiveMoietyRole :owl/NamedIndividual],
   :rdfs/label          "amlodipine as active moiety",
   :skos/definition     "amlodipine in the role of an active moiety"})

(def AmlodipineAsReferenceSubstanceInAmlodipineEMCStrength
  {:cmns-doc/refersTo :idmp-amp/Amlodipine,
   :cmns-qtu/hasDenominator
   :idmp-amp/AmlodipineDenominatorInAmlodipineEMCPresentationStrength,
   :cmns-qtu/hasNumerator
   :idmp-amp/AmlodipineNumeratorInAmlodipineEMCPresentationStrength,
   :db/ident :idmp-amp/AmlodipineAsReferenceSubstanceInAmlodipineEMCStrength,
   :rdf/type [:idmp-mprd/MassBasedStrength :owl/NamedIndividual],
   :rdfs/label "amlodipine as reference substance in Amlodipine EMC strength"})

(def AmlodipineAsReferenceSubstanceInNorvascPresentationStrength
  {:cmns-doc/refersTo :idmp-amp/Amlodipine,
   :cmns-qtu/hasDenominator
   :idmp-amp/AmlodipineDenominatorInNorvascPresentationStrength,
   :cmns-qtu/hasNumerator
   :idmp-amp/AmlodipineNumeratorInNorvascPresentationStrength,
   :db/ident
   :idmp-amp/AmlodipineAsReferenceSubstanceInNorvascPresentationStrength,
   :rdf/type [:idmp-mprd/MassBasedStrength :owl/NamedIndividual],
   :rdfs/label
   "amlodipine as reference substance in Norvasc presentation strength"})

(def AmlodipineBesylate
  "besylate salt of amlodipine, a long-acting calcium channel blocker"
  {:cmns-cls/isClassifiedBy :idmp-sub/OpticalActivity-EitherDirection,
   :db/ident :idmp-amp/AmlodipineBesylate,
   :dcterms/source
   "https://dailymed.nlm.nih.gov/dailymed/fda/fdaDrugXsl.cfm?setid=fc7d39d7-e006-4ed6-a31c-827452603002",
   :idmp-sub/hasActiveMoiety :idmp-amp/Amlodipine,
   :idmp-sub/hasMolecularFormula "C20H25CIN2O5.C6H6O3S",
   :idmp-sub/hasMolecularFormulaByMoiety "C20H25CIN2O5.C6H6O3S",
   :idmp-sub/hasMolecularWeight :idmp-amp/AmlodipineBesylateMolecularWeight,
   :idmp-sub/hasNumberOfMoieties 2,
   :idmp-sub/hasStereochemistry :idmp-sub/Stereochemistry-Racemic,
   :idmp-sub/hasStructure :idmp-amp/AmlodipineBesylateMolecularStructure,
   :rdf/type [:owl/NamedIndividual :idmp-sub/ChemicalSubstance :idmp-sub/Salt],
   :rdfs/label "amlodipine besylate",
   :skos/definition
   "besylate salt of amlodipine, a long-acting calcium channel blocker",
   :skos/note
   "Amlodipine besylate is chemically described as 3-Ethyl-5-methyl (±)-2-[(2-aminoethoxy)methyl]-4-(2-chlorophenyl)-1,4-dihydro-6-methyl-3,5-pyridinedicarboxylate, monobenzenesulphonate. Amlodipine besylate is a white crystalline powder with a molecular weight of 567.1. It is slightly soluble in water and sparingly soluble in ethanol."})

(def AmlodipineBesylateAsActiveIngredientInNorvasc
  "amlodipine besylate in the role of an active ingredient in the pharmaceutical product, Norvasc, where another substance acts as the reference basis of strength, namely, amlodipine"
  {:cmns-pts/isPlayedBy :idmp-amp/AmlodipineBesylate,
   :cmns-pts/isRealizedIn :idmp-amp/NorvascConstituency,
   :db/ident :idmp-amp/AmlodipineBesylateAsActiveIngredientInNorvasc,
   :idmp-mprd/hasReferenceStrength
   :idmp-amp/AmlodipineAsReferenceSubstanceInNorvascPresentationStrength,
   :idmp-mprd/hasReferenceSubstance :idmp-amp/Amlodipine,
   :idmp-mprd/hasStrength
   :idmp-amp/AmlodipineBesylatePresentationStrengthInNorvasc,
   :rdf/type [:idmp-mprd/ActiveIngredientReferenceSubstanceBasisOfStrength
              :owl/NamedIndividual],
   :rdfs/label "amlodipine besylate as active ingredient in Norvasc",
   :skos/definition
   "amlodipine besylate in the role of an active ingredient in the pharmaceutical product, Norvasc, where another substance acts as the reference basis of strength, namely, amlodipine"})

(def AmlodipineBesylateConstituency
  {:cmns-cxtdsg/isApplicableIn
   [:cmns-ge-euj/EuropeanUnionJurisdiction
    :idmp-ra/RegulatoryContext-FoodAndDrugAdministrationGeneral],
   :cmns-dsg/defines :idmp-amp/AmlodipineBesylate,
   :cmns-pts/hasRole :idmp-amp/AmlodipineAsActiveMoiety,
   :db/ident         :idmp-amp/AmlodipineBesylateConstituency,
   :rdf/type         [:idmp-sub/SubstanceConstituency :owl/NamedIndividual],
   :rdfs/label       "amlodipine besylate constituency"})

(def AmlodipineBesylateDenominatorInNorvascPresentationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Tablet,
   :cmns-qtu/hasNumericValue 1,
   :db/ident
   :idmp-amp/AmlodipineBesylateDenominatorInNorvascPresentationStrength,
   :rdf/type [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label
   "amlodipine besylate denominator in Norvasc presentation strength"})

(def AmlodipineBesylateMolecularStructure
  {:db/ident   :idmp-amp/AmlodipineBesylateMolecularStructure,
   :idmp-sub/hasSimplifiedMolecularInputLineEntrySpecification
   "OS(=O)(=O)C1=CC=CC=C1.CCOC(=O)C2=C(COCCN)NC(C)=C(C2C3=C(Cl)C=CC=C3)C(=O)OC",
   :rdf/type   [:idmp-sub/MolecularStructure :owl/NamedIndividual],
   :rdfs/label "amlodipine besylate molecular structure"})

(def AmlodipineBesylateMolecularWeight
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Dalton,
   :cmns-qtu/hasNumericValue 567.05M,
   :db/ident   :idmp-amp/AmlodipineBesylateMolecularWeight,
   :rdf/type   [:idmp-sub/MolecularWeight :owl/NamedIndividual],
   :rdfs/label "amlodipine besylate molecular weight"})

(def AmlodipineBesylateNumeratorInNorvascPresentationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Milligram,
   :cmns-qtu/hasNumericValue 6.94M,
   :db/ident :idmp-amp/AmlodipineBesylateNumeratorInNorvascPresentationStrength,
   :rdf/type [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label
   "amlodipine besylate numerator in Norvasc presentation strength"})

(def AmlodipineBesylateOfficialName
  {:cmns-cls/isClassifiedBy :idmp-sub/OfficialNameStatus-Current,
   :cmns-cxtdsg/isApplicableIn
   [:idmp-ra/RegulatoryContext-FoodAndDrugAdministrationGeneral
    :cmns-ge-euj/EuropeanUnionJurisdiction],
   :cmns-dsg/isNameOf :idmp-amp/AmlodipineBesylate,
   :cmns-ra/isRegisteredBy
   [:idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority
    :idmp-ra/FoodAndDrugAdministrationRegistrationAuthority
    :idmp-ra/WorldHealthOrganizationRegistrationAuthority],
   :cmns-rga/isApplicableInJurisdiction :lcc-3166-1/US,
   :db/ident :idmp-amp/AmlodipineBesylateOfficialName,
   :idmp-dtp/hasLanguageCode :lcc-639-1/en,
   :idmp-sub/hasSubstanceNameType
   :idmp-sub/SubstanceNameClassifier-OfficialName,
   :idmp-sub/hasSubstanceNameValue "amlodipine besylate",
   :rdf/type [:owl/NamedIndividual
              :idmp-sub/OfficialName
              :idmp-ra/InternationalNonproprietaryName],
   :rdfs/label "amlodipine besylate official name"})

(def AmlodipineBesylatePresentationStrengthInNorvasc
  {:cmns-doc/refersTo :idmp-amp/AmlodipineBesylate,
   :cmns-qtu/hasDenominator
   :idmp-amp/AmlodipineBesylateDenominatorInNorvascPresentationStrength,
   :cmns-qtu/hasNumerator
   :idmp-amp/AmlodipineBesylateNumeratorInNorvascPresentationStrength,
   :db/ident          :idmp-amp/AmlodipineBesylatePresentationStrengthInNorvasc,
   :rdf/type          [:idmp-mprd/MassBasedStrength :owl/NamedIndividual],
   :rdfs/label        "amlodipine besylate presentation strength in Norvasc"})

(def AmlodipineCommonName
  {:cmns-cls/isClassifiedBy :idmp-sub/OfficialNameStatus-Alternate,
   :cmns-cxtdsg/isApplicableIn
   [:cmns-ge-euj/EuropeanUnionJurisdiction
    :idmp-ra/RegulatoryContext-FoodAndDrugAdministrationGeneral],
   :cmns-dsg/isNameOf :idmp-amp/Amlodipine,
   :cmns-ra/isRegisteredBy
   [:idmp-ra/FoodAndDrugAdministrationRegistrationAuthority
    :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority
    :idmp-ra/WorldHealthOrganizationRegistrationAuthority],
   :cmns-ra/isRegisteredIn :idmp-ra/GlobalSubstanceRegistrationSystem,
   :cmns-rga/isApplicableInJurisdiction :lcc-3166-1/US,
   :db/ident :idmp-amp/AmlodipineCommonName,
   :idmp-dtp/hasLanguageCode :lcc-639-1/en,
   :idmp-sub/hasSubstanceNameType :idmp-sub/SubstanceNameClassifier-CommonName,
   :idmp-sub/hasSubstanceNameValue "Amlodipine [INN:BAN]",
   :rdf/type [:idmp-ra/InternationalNonproprietaryName :owl/NamedIndividual],
   :rdfs/label "amlodipine common name"})

(def AmlodipineDenominatorInAmlodipineEMCPresentationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Tablet,
   :cmns-qtu/hasNumericValue 1,
   :db/ident :idmp-amp/AmlodipineDenominatorInAmlodipineEMCPresentationStrength,
   :rdf/type [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label
   "amlodipine denominator in Amlodipine EMC presentation strength"})

(def AmlodipineDenominatorInNorvascPresentationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Tablet,
   :cmns-qtu/hasNumericValue 1,
   :db/ident   :idmp-amp/AmlodipineDenominatorInNorvascPresentationStrength,
   :rdf/type   [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label "amlodipine denominator in Norvasc presentation strength"})

(def AmlodipineEMC
  "long-acting long-acting calcium channel blocker (CCB), used to treat high blood pressure (hypertension) and a type of chest pain called angina"
  {:cmns-dsg/isDefinedIn :idmp-amp/AmlodipineEMCConstituency,
   :db/ident :idmp-amp/AmlodipineEMC,
   :rdf/type [:idmp-mprd/PharmaceuticalProduct :owl/NamedIndividual],
   :rdfs/label "Amlodipine EMC",
   :skos/definition
   "long-acting long-acting calcium channel blocker (CCB), used to treat high blood pressure (hypertension) and a type of chest pain called angina"})

(def AmlodipineEMCConstituency
  {:cmns-dsg/defines :idmp-amp/AmlodipineEMC,
   :db/ident         :idmp-amp/AmlodipineEMCConstituency,
   :idmp-mprd/hasActiveIngredient
   :idmp-amp/AmlodipineMesylateMonohydrateAsActiveIngredientInAmlodipineEMC,
   :rdf/type         [:idmp-mprd/ProductConstituency :owl/NamedIndividual],
   :rdfs/label       "Amlodipine EMC constituency"})

(def AmlodipineEMCMedicinalProduct
  "long-acting long-acting calcium channel blocker (CCB), used to treat high blood pressure (hypertension) and a type of chest pain called angina"
  {:cmns-col/comprises :idmp-amp/AmlodipineEMC,
   :cmns-prd/isProducedBy :idmp-amp/KentPharmaAsManufacturer,
   :db/ident :idmp-amp/AmlodipineEMCMedicinalProduct,
   :rdf/type [:idmp-mprd/MedicinalProduct :owl/NamedIndividual],
   :rdfs/label "Amlodipine EMC medicinal product",
   :skos/definition
   "long-acting long-acting calcium channel blocker (CCB), used to treat high blood pressure (hypertension) and a type of chest pain called angina"})

(def AmlodipineMesylateMonohydrate
  "mesylate salt of amlodipine, a long-acting calcium channel blocker"
  {:cmns-av/synonym "amlodipine mesilate monohydrate",
   :cmns-cls/isClassifiedBy :idmp-sub/OpticalActivity-EitherDirection,
   :db/ident :idmp-amp/AmlodipineMesylateMonohydrate,
   :dcterms/source
   ["https://go.drugbank.com/salts/DBSALT002978"
    "https://pubchem.ncbi.nlm.nih.gov/compound/Amlodipine-mesylate-monohydrate"],
   :idmp-sub/hasActiveMoiety :idmp-amp/Amlodipine,
   :idmp-sub/hasMolecularFormula "C21H31ClN2O9S",
   :idmp-sub/hasMolecularFormulaByMoiety "C20H25ClN2O5.CH4O3S.H2O",
   :idmp-sub/hasMolecularWeight
   :idmp-amp/AmlodipineMesylateMonohydrateMolecularWeight,
   :idmp-sub/hasNumberOfMoieties 3,
   :idmp-sub/hasStereochemistry :idmp-sub/Stereochemistry-Racemic,
   :idmp-sub/hasStructure
   :idmp-amp/AmlodipineMesylateMonohydrateMolecularStructure,
   :rdf/type [:idmp-sub/Salt :idmp-sub/ChemicalSubstance :owl/NamedIndividual],
   :rdfs/label "amlodipine mesylate monohydrate",
   :skos/definition
   "mesylate salt of amlodipine, a long-acting calcium channel blocker",
   :skos/note
   "Amlodipine mesylate monohydrate is chemically described as 3,5-Pyridinedicarboxylic acid, 2-((2-aminoethoxy)methyl)-4-(2-chlorophenyl)-1,4-dihydro-6-methyl-, 3-ethyl 5-methyl ester, monomethanesulfonate, monohydrate."})

(def AmlodipineMesylateMonohydrateAsActiveIngredientInAmlodipineEMC
  "amlodipine mesylate monohydrate in the role of an active ingredient, where amlodipine acts as the reference basis of strength"
  {:cmns-pts/isPlayedBy :idmp-amp/AmlodipineMesylateMonohydrate,
   :cmns-pts/isRealizedIn :idmp-amp/AmlodipineEMCConstituency,
   :db/ident
   :idmp-amp/AmlodipineMesylateMonohydrateAsActiveIngredientInAmlodipineEMC,
   :idmp-mprd/hasReferenceStrength
   :idmp-amp/AmlodipineAsReferenceSubstanceInAmlodipineEMCStrength,
   :idmp-mprd/hasReferenceSubstance :idmp-amp/Amlodipine,
   :idmp-mprd/hasStrength
   :idmp-amp/AmlodipineMesylateMonohydrateAsActiveIngredientInAmlodipineEMCPresentationStrength,
   :rdf/type [:idmp-mprd/ActiveIngredientReferenceSubstanceBasisOfStrength
              :owl/NamedIndividual],
   :rdfs/label
   "amlodipine mesylate monohydrate as active ingredient in Amlodipine EMC",
   :skos/definition
   "amlodipine mesylate monohydrate in the role of an active ingredient, where amlodipine acts as the reference basis of strength"})

(def
  AmlodipineMesylateMonohydrateAsActiveIngredientInAmlodipineEMCPresentationStrength
  {:cmns-doc/refersTo :idmp-amp/AmlodipineMesylateMonohydrate,
   :cmns-qtu/hasDenominator
   :idmp-amp/AmlodipineMesylateMonohydrateDenominatorInAmlodipineEMCPresentationStrength,
   :cmns-qtu/hasNumerator
   :idmp-amp/AmlodipineMesylateMonohydrateNumeratorInAmlodipineEMCPresentationStrength,
   :db/ident
   :idmp-amp/AmlodipineMesylateMonohydrateAsActiveIngredientInAmlodipineEMCPresentationStrength,
   :rdf/type [:idmp-mprd/MassBasedStrength :owl/NamedIndividual],
   :rdfs/label
   "amlodipine mesylate monohydrate as active ingredient in Amlodipine EMC presentation strength"})

(def AmlodipineMesylateMonohydrateConstituency
  {:cmns-cxtdsg/isApplicableIn
   :idmp-ra/RegulatoryContext-FoodAndDrugAdministrationGeneral,
   :cmns-dsg/defines :idmp-amp/AmlodipineMesylateMonohydrate,
   :cmns-pts/hasRole :idmp-amp/AmlodipineAsActiveMoiety,
   :db/ident         :idmp-amp/AmlodipineMesylateMonohydrateConstituency,
   :rdf/type         [:idmp-sub/SubstanceConstituency :owl/NamedIndividual],
   :rdfs/label       "amlodipine mesylate monohydrate constituency"})

(def AmlodipineMesylateMonohydrateDenominatorInAmlodipineEMCPresentationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Tablet,
   :cmns-qtu/hasNumericValue 1,
   :db/ident
   :idmp-amp/AmlodipineMesylateMonohydrateDenominatorInAmlodipineEMCPresentationStrength,
   :rdf/type [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label
   "amlodipine mesylate monohydrate denominator in Amlodipine EMC presentation strength"})

(def AmlodipineMesylateMonohydrateMolecularStructure
  {:db/ident   :idmp-amp/AmlodipineMesylateMonohydrateMolecularStructure,
   :idmp-sub/hasSimplifiedMolecularInputLineEntrySpecification
   "O.CS(O)(=O)=O.CCOC(=O)C1=C(COCCN)NC(C)=C(C1C1=C(Cl)C=CC=C1)C(=O)OC",
   :rdf/type   [:idmp-sub/MolecularStructure :owl/NamedIndividual],
   :rdfs/label "amlodipine mesylate monohydrate molecular structure"})

(def AmlodipineMesylateMonohydrateMolecularWeight
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Dalton,
   :cmns-qtu/hasNumericValue 522.9999M,
   :db/ident   :idmp-amp/AmlodipineMesylateMonohydrateMolecularWeight,
   :rdf/type   [:idmp-sub/MolecularWeight :owl/NamedIndividual],
   :rdfs/label "amlodipine mesylate monohydrate molecular weight"})

(def AmlodipineMesylateMonohydrateNumeratorInAmlodipineEMCPresentationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Milligram,
   :cmns-qtu/hasNumericValue 6.41M,
   :db/ident
   :idmp-amp/AmlodipineMesylateMonohydrateNumeratorInAmlodipineEMCPresentationStrength,
   :rdf/type [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label
   "amlodipine mesylate monohydrate numerator in Amlodipine EMC presentation strength"})

(def AmlodipineMesylateMonohydrateOfficialName
  {:cmns-cls/isClassifiedBy :idmp-sub/OfficialNameStatus-Current,
   :cmns-cxtdsg/isApplicableIn
   [:idmp-ra/RegulatoryContext-FoodAndDrugAdministrationGeneral
    :cmns-ge-euj/EuropeanUnionJurisdiction],
   :cmns-dsg/isNameOf :idmp-amp/AmlodipineMesylateMonohydrate,
   :cmns-ra/isRegisteredBy
   [:idmp-ra/FoodAndDrugAdministrationRegistrationAuthority
    :idmp-ra/WorldHealthOrganizationRegistrationAuthority
    :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority],
   :cmns-ra/isRegisteredIn :idmp-ra/GlobalSubstanceRegistrationSystem,
   :cmns-rga/isApplicableInJurisdiction :lcc-3166-1/US,
   :db/ident :idmp-amp/AmlodipineMesylateMonohydrateOfficialName,
   :idmp-dtp/hasLanguageCode :lcc-639-1/en,
   :idmp-sub/hasSubstanceNameType
   :idmp-sub/SubstanceNameClassifier-OfficialName,
   :idmp-sub/hasSubstanceNameValue "amlodipine mesylate monohydrate",
   :rdf/type [:idmp-sub/OfficialName
              :idmp-ra/InternationalNonproprietaryName
              :owl/NamedIndividual],
   :rdfs/label "amlodipine mesylate monohydrate official name"})

(def AmlodipineMolecularStructure
  {:db/ident   :idmp-amp/AmlodipineMolecularStructure,
   :rdf/type   [:idmp-sub/MolecularStructure :owl/NamedIndividual],
   :rdfs/label "amlodipine molecular structure"})

(def AmlodipineMolecularWeight
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Dalton,
   :cmns-qtu/hasNumericValue 408.88M,
   :db/ident   :idmp-amp/AmlodipineMolecularWeight,
   :rdf/type   [:idmp-sub/MolecularWeight :owl/NamedIndividual],
   :rdfs/label "amlodipine molecular weight"})

(def AmlodipineNumeratorInAmlodipineEMCPresentationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Milligram,
   :cmns-qtu/hasNumericValue 5,
   :db/ident   :idmp-amp/AmlodipineNumeratorInAmlodipineEMCPresentationStrength,
   :rdf/type   [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label "amlodipine numerator in Amlodipine EMC presentation strength"})

(def AmlodipineNumeratorInNorvascPresentationStrength
  {:cmns-qtu/hasMeasurementUnit :idmp-ucum/Milligram,
   :cmns-qtu/hasNumericValue 5,
   :db/ident   :idmp-amp/AmlodipineNumeratorInNorvascPresentationStrength,
   :rdf/type   [:cmns-qtu/QuantityValue :owl/NamedIndividual],
   :rdfs/label "amlodipine numerator in Norvasc presentation strength"})

(def AmlodipineOfficialName
  {:cmns-cls/isClassifiedBy :idmp-sub/OfficialNameStatus-Current,
   :cmns-dsg/isNameOf :idmp-amp/Amlodipine,
   :cmns-ra/isRegisteredBy
   :idmp-ra/FoodAndDrugAdministrationRegistrationAuthority,
   :cmns-rga/isApplicableInJurisdiction :lcc-3166-1/US,
   :db/ident :idmp-amp/AmlodipineOfficialName,
   :idmp-dtp/hasLanguageCode :lcc-639-1/en,
   :idmp-sub/hasSubstanceNameType
   :idmp-sub/SubstanceNameClassifier-OfficialName,
   :idmp-sub/hasSubstanceNameValue "amlodipine",
   :rdf/type [:idmp-sub/OfficialName
              :owl/NamedIndividual
              :idmp-ra/InternationalNonproprietaryName],
   :rdfs/label "amlodipine official name"})

(def EVMPD-SUB05467MIG
  {:cmns-id/identifies :idmp-amp/Amlodipine,
   :cmns-ra/isRegisteredBy
   :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
   :cmns-ra/isRegisteredIn
   :idmp-eura/ExtendedEudraVigilanceMedicinalProductDictionary,
   :cmns-txt/hasTextValue "SUB05467MIG",
   :db/ident           :idmp-amp/EVMPD-SUB05467MIG,
   :rdf/type           [:idmp-eura/EudraVigilanceCode :owl/NamedIndividual],
   :rdfs/label         "SUB05467MIG"})

(def KentPharmaAsManufacturer
  {:cmns-prd/produces :idmp-amp/AmlodipineEMCMedicinalProduct,
   :cmns-pts/isPlayedBy :idmp-amp/KentPharmaUKLtd,
   :db/ident          :idmp-amp/KentPharmaAsManufacturer,
   :rdf/type          [:idmp-sub/Manufacturer :owl/NamedIndividual],
   :rdfs/label        "Kent Pharma UK Ltd. as manufacturer"})

(def KentPharmaUKLtd
  {:cmns-dsg/hasDescription
   "pharmaceutical company headquartered at The Bower, 4 Roundwood Avenue, Stockley Park, Heathrow, UB11 1AF",
   :db/ident   :idmp-amp/KentPharmaUKLtd,
   :rdf/type   [:cmns-org/LegalEntity :owl/NamedIndividual],
   :rdfs/label "Kent Pharma UK Ltd."})

(def Norvasc
  "pharmaceutical product that is a besylate salt of amlodipine, a long-acting long-acting calcium channel blocker (CCB), used to treat high blood pressure (hypertension) and a type of chest pain called angina"
  {:cmns-dsg/isDefinedIn :idmp-amp/NorvascConstituency,
   :db/ident :idmp-amp/Norvasc,
   :rdf/type [:idmp-mprd/PharmaceuticalProduct :owl/NamedIndividual],
   :rdfs/label "Norvasc",
   :skos/definition
   "pharmaceutical product that is a besylate salt of amlodipine, a long-acting long-acting calcium channel blocker (CCB), used to treat high blood pressure (hypertension) and a type of chest pain called angina"})

(def NorvascConstituency
  "constituency of the pharmaceutical product that is a besylate salt of amlodipine"
  {:cmns-dsg/defines :idmp-amp/Norvasc,
   :db/ident :idmp-amp/NorvascConstituency,
   :idmp-mprd/hasActiveIngredient
   :idmp-amp/AmlodipineBesylateAsActiveIngredientInNorvasc,
   :rdf/type [:idmp-mprd/ProductConstituency :owl/NamedIndividual],
   :rdfs/label "Norvasc constituency",
   :skos/definition
   "constituency of the pharmaceutical product that is a besylate salt of amlodipine",
   :skos/note
   "NORVASC (amlodipine besylate) Tablets are formulated as white tablets equivalent to 2.5, 5, and 10 mg of amlodipine for oral administration. In addition to the active ingredient, amlodipine besylate, each tablet contains the following inactive ingredients: microcrystalline cellulose, dibasic calcium phosphate anhydrous, sodium starch glycolate, and magnesium stearate."})

(def NorvascMedicinalProduct
  "pharmaceutical and medicinal product that is a besylate salt of amlodipine, a long-acting long-acting calcium channel blocker (CCB), used to treat high blood pressure (hypertension) and a type of chest pain called angina"
  {:cmns-col/comprises :idmp-amp/Norvasc,
   :cmns-prd/isProducedBy :idmp-amp/PfizerLaboratoriesAsManufacturer,
   :db/ident :idmp-amp/NorvascMedicinalProduct,
   :dcterms/source
   ["https://www.dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=abd6a2ca-40c2-485c-bc53-db1c652505ed"
    "https://labeling.pfizer.com/showlabeling.aspx?id=562"],
   :rdf/type [:idmp-mprd/MedicinalProduct :owl/NamedIndividual],
   :rdfs/label "Norvasc medicinal product",
   :skos/definition
   "pharmaceutical and medicinal product that is a besylate salt of amlodipine, a long-acting long-acting calcium channel blocker (CCB), used to treat high blood pressure (hypertension) and a type of chest pain called angina",
   :skos/note
   "NORVASC (amlodipine besylate) Tablets are formulated as white tablets equivalent to 2.5, 5, and 10 mg of amlodipine for oral administration. In addition to the active ingredient, amlodipine besylate, each tablet contains the following inactive ingredients: microcrystalline cellulose, dibasic calcium phosphate anhydrous, sodium starch glycolate, and magnesium stearate."})

(def PfizerInc
  {:cmns-dsg/hasDescription
   "American multinational pharmaceutical and biotechnology corporation headquartered on 42nd Street in Manhattan, New York City.",
   :db/ident   :idmp-amp/PfizerInc,
   :rdf/type   [:cmns-org/LegalEntity :owl/NamedIndividual],
   :rdfs/label "Pfizer Inc."})

(def PfizerLaboratoriesAsManufacturer
  {:cmns-prd/produces :idmp-amp/Norvasc,
   :cmns-pts/isPlayedBy :idmp-amp/PfizerInc,
   :db/ident          :idmp-amp/PfizerLaboratoriesAsManufacturer,
   :rdf/type          [:idmp-sub/Manufacturer :owl/NamedIndividual],
   :rdfs/label        "Pfizer Laboratories as manufacturer"})

(def UNII-1J444QC288
  {:cmns-id/identifies
   [:idmp-amp/Amlodipine
    "https://gsrs.ncats.nih.gov/api/v1/substances/1J444QC288"],
   :cmns-ra/isRegisteredBy
   :idmp-ra/FoodAndDrugAdministrationRegistrationAuthority,
   :cmns-ra/isRegisteredIn :idmp-ra/GlobalSubstanceRegistrationSystem,
   :cmns-txt/hasTextValue "1J444QC288",
   :db/ident :idmp-amp/UNII-1J444QC288,
   :dcterms/source "https://precision.fda.gov/uniisearch/srs/unii/1J444QC288",
   :rdf/type [:idmp-ra/UniqueIngredientNumber :owl/NamedIndividual],
   :rdfs/label "1J444QC288"})

(def UNII-864V2Q084H
  {:cmns-id/identifies
   [:idmp-amp/AmlodipineBesylate
    "https://gsrs.ncats.nih.gov/api/v1/substances/864V2Q084H"],
   :cmns-ra/isRegisteredBy
   :idmp-ra/FoodAndDrugAdministrationRegistrationAuthority,
   :cmns-ra/isRegisteredIn :idmp-ra/GlobalSubstanceRegistrationSystem,
   :cmns-txt/hasTextValue "864V2Q084H",
   :db/ident :idmp-amp/UNII-864V2Q084H,
   :dcterms/source "https://precision.fda.gov/uniisearch/srs/unii/864V2Q084H",
   :rdf/type [:idmp-ra/UniqueIngredientNumber :owl/NamedIndividual],
   :rdfs/label "864V2Q084H"})

(def UNII-FAS0DJC51V
  {:cmns-id/identifies
   [:idmp-amp/AmlodipineMesylateMonohydrate
    "https://gsrs.ncats.nih.gov/api/v1/substances/FAS0DJC51V"],
   :cmns-ra/isRegisteredBy
   :idmp-ra/FoodAndDrugAdministrationRegistrationAuthority,
   :cmns-ra/isRegisteredIn :idmp-ra/GlobalSubstanceRegistrationSystem,
   :cmns-txt/hasTextValue "FAS0DJC51V",
   :db/ident :idmp-amp/UNII-FAS0DJC51V,
   :dcterms/source "https://precision.fda.gov/uniisearch/srs/unii/FAS0DJC51V",
   :rdf/type [:idmp-ra/UniqueIngredientNumber :owl/NamedIndividual],
   :rdfs/label "FAS0DJC51V"})