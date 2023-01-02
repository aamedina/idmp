(ns net.wikipunk.rdf.idmp-mprd
  "The regulated medicinal product information ontology provides a semantic model representing the definitions for exchanging basic concepts for the unique identification and exchange of regulated medicinal product information. It is derived from the ISO 11615:2017 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of regulated medicinal product information."
  {:cmns-av/copyright ["Copyright (c) 2022 EDM Council, Inc."
                       "Copyright (c) 2022 Pistoia Alliance, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/ISO11615-MedicinalProducts.rdf",
   :dcterms/abstract
   "The regulated medicinal product information ontology provides a semantic model representing the definitions for exchanging basic concepts for the unique identification and exchange of regulated medicinal product information. It is derived from the ISO 11615:2017 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of regulated medicinal product information.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :idmp-chg/hasMaturityLevel :idmp-chg/Provisional,
   :owl/imports
   ["https://www.omg.org/spec/Commons/Identifiers/"
    "https://www.omg.org/spec/Commons/Organizations/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/Commons/CodesAndCodeSets/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/RegistrationAuthorities/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://www.omg.org/spec/Commons/ContextualIdentifiers/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ISOConformanceAnnotations/"
    "https://www.omg.org/spec/Commons/Documents/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11240-UnitsOfMeasurement/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://www.omg.org/spec/Commons/PartiesAndSituations/"
    "https://www.omg.org/spec/Commons/Designators/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/"
    "https://www.omg.org/spec/Commons/RegulatoryAgencies/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/"
    "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://www.omg.org/spec/Commons/ProductsAndServices/"
    "https://www.omg.org/spec/Commons/TextDatatype/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/20221201/ISO11615-MedicinalProducts/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-cxtid" "https://www.omg.org/spec/Commons/ContextualIdentifiers/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
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
    "idmp-cmpl"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ISOConformanceAnnotations/",
    "idmp-dtp"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/",
    "idmp-mprd"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/",
    "idmp-sub"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/",
    "idmp-uom"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11240-UnitsOfMeasurement/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/",
   :rdfa/prefix "idmp-mprd",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/",
   :rdfs/label "ISO 11615 Regulated Medicinal Product Information Ontology",
   :skos/changeNote
   "The https://spec.pistoiaalliance.org/idmp/ontology/ISO/20221001/ISO11615-MedicinalProducts.rdf version of this ontology was modified to rename 'ingredient role's to ingredients for clarification and refine the restrictions relating ingredients to pharmaceutical products and manufactured items per discussion at the Pistoia Alliance Conference Workshop on 3 November 2022 (IDMP-298). It was also extended to include concepts such as process, manufacturing process, process identifier, batch, batch identifier, lot, lot number, and others required in support of the regulatory to manufacturing bridge use case."})

(def ActiveIngredientActiveMoietyBasisOfStrength
  "role of a substance present in a currently or previously marketed drug product indicating that it is or becomes pharmacologically active once delivered to patients, where the active moiety is basis of strength"
  {:cmns-av/explanatoryNote
   "Note that in the example case both substances can be use as a basis of strength (BOSS) because there is a stoichiometric relationship between them. In all cases where there is no stoichiometric relationship between the reference substance and salt forms, the base or the acid must be taken as the reference substance (BOSS).",
   :db/ident :idmp-mprd/ActiveIngredientActiveMoietyBasisOfStrength,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type :owl/Class,
   :rdfs/label "active ingredient active moiety basis of strength",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-mprd/hasStrength,
                      :owl/someValuesFrom :idmp-mprd/Strength,
                      :rdf/type           :owl/Restriction}
                     :idmp-sub/ActiveMoietyRole
                     {:owl/hasValue   :idmp-mprd/IngredientRole-ACTIM,
                      :owl/onProperty :cmns-dsg/isSignifiedBy,
                      :rdf/type       :owl/Restriction}
                     :idmp-sub/ActiveIngredient],
   :skos/definition
   "role of a substance present in a currently or previously marketed drug product indicating that it is or becomes pharmacologically active once delivered to patients, where the active moiety is basis of strength",
   :skos/example
   "For example, 287 mg amoxicillin trihydrate equivalent to 250 mg anhydrous amoxicillin."})

(def ActiveIngredientEntireSubstanceBasisOfStrength
  "role of a substance present in a currently or previously marketed drug product indicating that it is or becomes pharmacologically active once delivered to patients, where the entire substance is the basis of strength"
  {:db/ident :idmp-mprd/ActiveIngredientEntireSubstanceBasisOfStrength,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type :owl/Class,
   :rdfs/label "active ingredient entire substance basis of strength",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-mprd/hasStrength,
                      :owl/someValuesFrom :idmp-mprd/Strength,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue   :idmp-mprd/IngredientRole-ACTIB,
                      :owl/onProperty :cmns-dsg/isSignifiedBy,
                      :rdf/type       :owl/Restriction}
                     :idmp-sub/ActiveIngredient],
   :skos/definition
   "role of a substance present in a currently or previously marketed drug product indicating that it is or becomes pharmacologically active once delivered to patients, where the entire substance is the basis of strength",
   :skos/example
   "For example, propranolol hydrochloride quantified as the propranolol hydrochloride salt."})

(def ActiveIngredientReferenceSubstanceBasisOfStrength
  "role of a substance present in a currently or previously marketed drug product indicating that it is or becomes pharmacologically active once delivered to patients, where another reference substance is the basis of strength"
  {:db/ident :idmp-mprd/ActiveIngredientReferenceSubstanceBasisOfStrength,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type :owl/Class,
   :rdfs/label "active ingredient reference substance basis of strength",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-mprd/hasReferenceSubstance,
                      :owl/someValuesFrom :idmp-sub/Substance,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :idmp-mprd/hasReferenceStrength,
                      :owl/someValuesFrom :idmp-mprd/ReferenceStrength,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue   :idmp-mprd/IngredientRole-ACTIR,
                      :owl/onProperty :cmns-dsg/isSignifiedBy,
                      :rdf/type       :owl/Restriction}
                     :idmp-sub/ActiveIngredient],
   :skos/definition
   "role of a substance present in a currently or previously marketed drug product indicating that it is or becomes pharmacologically active once delivered to patients, where another reference substance is the basis of strength",
   :skos/example
   "For example, metoprolol succinate quantified by amount of metoprolol tartrate with the equal amount of metoprolol active moiety."})

(def ActiveIngredientWithoutBasisOfStrength
  "role of a substance present in a currently or previously marketed drug product indicating that it is or becomes pharmacologically active once delivered to patients whose basis of strength cannot be specified"
  {:db/ident :idmp-mprd/ActiveIngredientWithoutBasisOfStrength,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type :owl/Class,
   :rdfs/label "active ingredient without basis of strength",
   :rdfs/subClassOf [{:owl/hasValue   :idmp-mprd/IngredientRole-ACTI,
                      :owl/onProperty :cmns-dsg/isSignifiedBy,
                      :rdf/type       :owl/Restriction}
                     :idmp-sub/ActiveIngredient],
   :skos/definition
   "role of a substance present in a currently or previously marketed drug product indicating that it is or becomes pharmacologically active once delivered to patients whose basis of strength cannot be specified"})

(def ActivityBasedStrength
  "quantity or range of quantities of the substance/specified substance present per unitary volume (or mass) ..."
  {:db/ident :idmp-mprd/ActivityBasedStrength,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated medicinal product information, clause 9.7.2.5.3",
   :rdf/type :owl/Class,
   :rdfs/label "activity-based strength",
   :rdfs/subClassOf :idmp-mprd/Strength,
   :skos/definition
   "quantity or range of quantities of the substance/specified substance present per unitary volume (or mass) ..."})

(def Authorization
  "situation in which a party authorizes someone to act on their behalf or to have other responsibilities or capabilities under certain conditions for some period of time"
  {:db/ident :idmp-mprd/Authorization,
   :rdf/type :owl/Class,
   :rdfs/label "authorization",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-mprd/hasAuthorizingParty,
                      :owl/someValuesFrom :idmp-mprd/AuthorizingParty,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :idmp-mprd/hasAuthorizedParty,
                      :owl/someValuesFrom :idmp-mprd/AuthorizedParty,
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/Situation],
   :skos/definition
   "situation in which a party authorizes someone to act on their behalf or to have other responsibilities or capabilities under certain conditions for some period of time"})

(def AuthorizedMedicinalProduct
  "role of a medicinal product that has been authorized for some purpose in some jurisdiction"
  {:db/ident :idmp-mprd/AuthorizedMedicinalProduct,
   :rdf/type :owl/Class,
   :rdfs/label "authorized medicinal product",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-mprd/hasAuthorization,
                      :owl/someValuesFrom :idmp-mprd/Authorization,
                      :rdf/type           :owl/Restriction}
                     :idmp-mprd/ProductRole],
   :skos/definition
   "role of a medicinal product that has been authorized for some purpose in some jurisdiction"})

(def AuthorizedParty
  "party that has been given the responsibility to act on behalf of another party or to have other responsibilities or capabilities under some set of guidelines"
  {:db/ident :idmp-mprd/AuthorizedParty,
   :rdf/type :owl/Class,
   :rdfs/label "authorized party",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-mprd/isAuthorizedThrough,
                      :owl/someValuesFrom :idmp-mprd/Authorization,
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/PartyRole],
   :skos/definition
   "party that has been given the responsibility to act on behalf of another party or to have other responsibilities or capabilities under some set of guidelines"})

(def AuthorizingParty
  "party that delegates some role, authority, capability, or control to another party"
  {:db/ident :idmp-mprd/AuthorizingParty,
   :rdf/type :owl/Class,
   :rdfs/label "authorizing party",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-mprd/authorizesThrough,
                      :owl/someValuesFrom :idmp-mprd/Authorization,
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/Actor],
   :skos/definition
   "party that delegates some role, authority, capability, or control to another party"})

(def Batch
  "material that is being produced or that has been produced by a single execution of a process that leads to the production of finite quantities of material by subjecting quantities of input materials to an ordered set of processing activities over a finite period of time"
  {:db/ident :idmp-mprd/Batch,
   :dcterms/source
   "ANSI/ISA S88: https://www.isa.org/products/ansi-isa-88-00-01-2010-batch-control-part-1-models (paragraph 3.1.6)",
   :idmp-cmpl/hasConformanceToISOLevel
   [:idmp-cmpl/ConformanceToISOLevel-Extension
    :idmp-cmpl/ConformanceToISOLevel-NamingConformant],
   :rdf/type :owl/Class,
   :rdfs/label "batch",
   :rdfs/subClassOf [:cmns-prd/Product
                     {:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :idmp-sub/Matter,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :idmp-mprd/isOutputOf,
                      :owl/someValuesFrom :idmp-mprd/BatchManufacturingProcess,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-col/isConstituentOf,
                      :owl/someValuesFrom :cmns-prd/Product,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "material that is being produced or that has been produced by a single execution of a process that leads to the production of finite quantities of material by subjecting quantities of input materials to an ordered set of processing activities over a finite period of time",
   :skos/editorialNote
   "The restriction with respect to matter should be revised or augmented to define a specific amount (or amounts) of matter used to produce the batch. Also note that in order to shorten the definition to use the term 'batch process' in place of most of the definition of a batch process requires loosening the constraint on circular definitions, or creating an exception for a compound term where that term appears in a different label in the ontology."})

(def BatchManufacturingProcess
  "process that leads to the production of finite quantities of material by subjecting quantities of input materials to an ordered set of processing activities over a finite period of time using one or more pieces of equipment"
  {:cmns-av/synonym "batch process",
   :db/ident :idmp-mprd/BatchManufacturingProcess,
   :dcterms/source
   "ANSI/ISA S88: https://www.isa.org/products/ansi-isa-88-00-01-2010-batch-control-part-1-models (paragraph 3.1.8)",
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type :owl/Class,
   :rdfs/label "batch manufacturing process",
   :rdfs/subClassOf :idmp-mprd/ManufacturingProcess,
   :skos/definition
   "process that leads to the production of finite quantities of material by subjecting quantities of input materials to an ordered set of processing activities over a finite period of time using one or more pieces of equipment",
   :skos/editorialNote
   "This is a starting point that requires extension to include further axioms including relationships with input and output materials, derived from ANSI/ISA S88 and the ISO Process Specification Language (PSL).",
   :skos/note
   "Batch processes are discontinuous processes, which are neither discrete nor continuous but have characteristics of both."})

(def BatchNumber
  "identifier assigned to a specific batch of material that is being produced or that has been produced by a single execution of a batch process"
  {:cmns-av/adaptedFrom
   "ANSI/ISA S88: https://www.isa.org/products/ansi-isa-88-00-01-2010-batch-control-part-1-models (paragraph 3.1.6)",
   :cmns-av/synonym "batch identifier",
   :db/ident :idmp-mprd/BatchNumber,
   :idmp-cmpl/hasConformanceToISOLevel
   [:idmp-cmpl/ConformanceToISOLevel-NamingConformant
    :idmp-cmpl/ConformanceToISOLevel-Extension],
   :rdf/type :owl/Class,
   :rdfs/label "batch number",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-id/denotes,
                      :owl/someValuesFrom :idmp-mprd/Batch,
                      :rdf/type           :owl/Restriction}
                     :cmns-cxtdsg/ContextualDesignation],
   :skos/definition
   "identifier assigned to a specific batch of material that is being produced or that has been produced by a single execution of a batch process"})

(def ClinicalTrial
  "investigation in human subjects intended to discover or verify the clinical, pharmacological and/or other pharmacodynamic effects of an investigational product(s), and/or to identify any adverse reactions to an investigational medicinal product(s), and/or to study absorption, distribution, metabolism and excretion of investigational medicinal product(s) with the object of ascertaining its safety and/or efficacy"
  {:db/ident :idmp-mprd/ClinicalTrial,
   :dcterms/source
   ["ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.11"
    "National Cancer Institute Thesaurus, see http://ncicb.nci.nih.gov/xml/owl/EVS/Thesaurus.owl#C71104"],
   :rdf/type :owl/Class,
   :rdfs/label "clinical trial",
   :rdfs/subClassOf
   [{:owl/onProperty     :idmp-mprd/managesAdministrationOf,
     :owl/someValuesFrom :idmp-mprd/InvestigationalMedicinalProduct,
     :rdf/type           :owl/Restriction}
    :cmns-pts/Situation
    {:owl/onProperty     :idmp-mprd/evaluates,
     :owl/someValuesFrom :idmp-mprd/InvestigationalMedicinalProduct,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :idmp-mprd/hasSponsor,
     :owl/someValuesFrom :idmp-mprd/Sponsor,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "investigation in human subjects intended to discover or verify the clinical, pharmacological and/or other pharmacodynamic effects of an investigational product(s), and/or to identify any adverse reactions to an investigational medicinal product(s), and/or to study absorption, distribution, metabolism and excretion of investigational medicinal product(s) with the object of ascertaining its safety and/or efficacy",
   :skos/note
   "A clinical trial is a research study that prospectively assigns human participants or groups of humans to one or more health-related interventions to evaluate the effects on health outcomes."})

(def ClinicalTrialAuthorization
  "approval given by a medicines regulatory agency to conduct a clinical trial in a region"
  {:db/ident :idmp-mprd/ClinicalTrialAuthorization,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.12",
   :rdf/type :owl/Class,
   :rdfs/label "clinical trial authorization",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/isApplicableIn,
                      :owl/someValuesFrom :lcc-cr/GeographicRegion,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :idmp-mprd/ClinicalTrial,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :idmp-mprd/hasAuthorizingParty,
                      :owl/someValuesFrom :idmp-mprd/MedicinesRegulatoryAgency,
                      :rdf/type           :owl/Restriction}
                     :idmp-mprd/Authorization],
   :skos/definition
   "approval given by a medicines regulatory agency to conduct a clinical trial in a region"})

(def ClinicalTrialIdentifier
  "sequence of characters uniquely identifying a clinical trial"
  {:db/ident :idmp-mprd/ClinicalTrialIdentifier,
   :rdf/type :owl/Class,
   :rdfs/label "clinical trial identifier",
   :rdfs/seeAlso "https://clinicaltrials.gov/",
   :rdfs/subClassOf [{:owl/onClass    :idmp-mprd/ClinicalTrial,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-ra/RegisteredIdentifier
                     :cmns-cds/CodeElement],
   :skos/definition
   "sequence of characters uniquely identifying a clinical trial"})

(def Concentration
  "quantity or range of quantities of the substance/specified substance present per unitary volume (or mass) ..."
  {:cmns-av/synonym "strength (concentration)",
   :db/ident :idmp-mprd/Concentration,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated medicinal product information, clause 9.7.2.5.3",
   :rdf/type :owl/Class,
   :rdfs/label "concentration",
   :rdfs/subClassOf :idmp-mprd/Strength,
   :skos/definition
   "quantity or range of quantities of the substance/specified substance present per unitary volume (or mass) ..."})

(def Container
  "object that can be used to hold things"
  {:cmns-av/adaptedFrom
   ["https://ncithesaurus.nci.nih.gov/ncitbrowser/pages/home.jsf"
    "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.16"],
   :cmns-av/usageNote
   "The ISO 11615 definition for 'container' is too specific to be a generalization of some of its subordinate concepts, such as intermediate container and other packaging related concepts.",
   :db/ident :idmp-mprd/Container,
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-NamingConformant,
   :rdf/type :owl/Class,
   :rdfs/label "container",
   :skos/definition "object that can be used to hold things"})

(def ContinuousManufacturingProcess
  "process in which materials are passed in a continuous flow through processing equipment"
  {:cmns-av/synonym "continuous process",
   :db/ident :idmp-mprd/ContinuousManufacturingProcess,
   :dcterms/source
   "ANSI/ISA S88: https://www.isa.org/products/ansi-isa-88-00-01-2010-batch-control-part-1-models (paragraph 4.2.2)",
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type :owl/Class,
   :rdfs/label "continuous manufacturing process",
   :rdfs/subClassOf :idmp-mprd/ManufacturingProcess,
   :skos/definition
   "process in which materials are passed in a continuous flow through processing equipment",
   :skos/editorialNote
   "This is a starting point that requires extension to include further axioms including relationships with input and output materials, derived from ANSI/ISA S88 and the ISO Process Specification Language (PSL).",
   :skos/note
   "Once established in a steady operating state, the nature of the process is not dependent on the length of time of operation. Start-ups, transitions, and shutdowns are usually treated as separate activities and do not necessarily contribute to achieving the desired processing."})

(def DiscreteManufacturingProcess
  "process in which a specified quantity of parts moves as a unit (group of parts) between workstations and each part maintains its unique identity"
  {:cmns-av/synonym "discrete process",
   :db/ident :idmp-mprd/DiscreteManufacturingProcess,
   :dcterms/source
   "ANSI/ISA S88: https://www.isa.org/products/ansi-isa-88-00-01-2010-batch-control-part-1-models (paragraph 4.2.3)",
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type :owl/Class,
   :rdfs/label "discrete manufacturing process",
   :rdfs/subClassOf :idmp-mprd/ManufacturingProcess,
   :skos/definition
   "process in which a specified quantity of parts moves as a unit (group of parts) between workstations and each part maintains its unique identity",
   :skos/editorialNote
   "This is a starting point that requires extension to include further axioms including relationships with input and output materials, specific quantities thereof, production lots, and so forth, derived from ANSI/ISA S88 and the ISO Process Specification Language (PSL).",
   :skos/note
   "Products are classified into production lots that are based on common raw materials, production requirements, and production histories."})

(def ISO20443-CodeSet
  "set of controlled vocabularies and codes for reporting of medicinal product-related information specified in the ISO/TS 20443 guidelines"
  {:db/ident :idmp-mprd/ISO20443-CodeSet,
   :rdf/type [:cmns-cds/CodeSet :owl/NamedIndividual],
   :rdfs/label "ISO 20443 code set",
   :rdfs/seeAlso "https://www.iso.org/standard/68041.html",
   :skos/definition
   "set of controlled vocabularies and codes for reporting of medicinal product-related information specified in the ISO/TS 20443 guidelines"})

(def ImmediateContainer
  "packaging in which a manufactured item or pharmaceutical product is contained and with which it is in direct contact"
  {:db/ident :idmp-mprd/ImmediateContainer,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.27",
   :rdf/type :owl/Class,
   :rdfs/label "immediate container",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-mprd/immediatelyContains,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:idmp-sub/ManufacturedItem
                                            :idmp-mprd/PharmaceuticalProduct],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :idmp-mprd/MedicinalProductContainer],
   :skos/definition
   "packaging in which a manufactured item or pharmaceutical product is contained and with which it is in direct contact",
   :skos/note
   "An immediate container can be fitted with or have integrated into it an administration device and/or closure. A pharmaceutical dose form can fulfil the role of an immediate container, e.g. a capsule containing a powder for inhalation; the capsule in this case is not a container. An alternative, compatible definition of immediate container ('immediate packaging) is given in Directive 92/27/EEC."})

(def IngredientRole-ACTI
  "code for an active ingredient whose basis of strength cannot be specified"
  {:cmns-col/isMemberOf :idmp-mprd/ISO20443-CodeSet,
   :cmns-txt/hasTextValue "ACTI",
   :db/ident :idmp-mprd/IngredientRole-ACTI,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type [:idmp-mprd/IngredientRoleCode :owl/NamedIndividual],
   :rdfs/label "ingredient role - ACTI",
   :skos/definition
   "code for an active ingredient whose basis of strength cannot be specified"})

(def IngredientRole-ACTIB
  "code for an active ingredient where the entire substance is the basis of strength"
  {:cmns-col/isMemberOf :idmp-mprd/ISO20443-CodeSet,
   :cmns-txt/hasTextValue "ACTIB",
   :db/ident :idmp-mprd/IngredientRole-ACTIB,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type [:idmp-mprd/IngredientRoleCode :owl/NamedIndividual],
   :rdfs/label "ingredient role - ACTIB",
   :skos/definition
   "code for an active ingredient where the entire substance is the basis of strength"})

(def IngredientRole-ACTIM
  "code for an active ingredient where the active moiety is basis of strength"
  {:cmns-col/isMemberOf :idmp-mprd/ISO20443-CodeSet,
   :cmns-txt/hasTextValue "ACTIM",
   :db/ident :idmp-mprd/IngredientRole-ACTIM,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type [:idmp-mprd/IngredientRoleCode :owl/NamedIndividual],
   :rdfs/label "ingredient role - ACTIM",
   :skos/definition
   "code for an active ingredient where the active moiety is basis of strength"})

(def IngredientRole-ACTIR
  "code for an active ingredient where another reference substance is the basis of strength"
  {:cmns-col/isMemberOf :idmp-mprd/ISO20443-CodeSet,
   :cmns-txt/hasTextValue "ACTIR",
   :db/ident :idmp-mprd/IngredientRole-ACTIR,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type [:idmp-mprd/IngredientRoleCode :owl/NamedIndividual],
   :rdfs/label "ingredient role - ACTIR",
   :skos/definition
   "code for an active ingredient where another reference substance is the basis of strength"})

(def IngredientRole-ADJV
  "code for an adjuvant, an ingredient(s) which augments or promotes the pharmacological effect of the active ingredient(s) without itself being considered active (typically used with vaccines)"
  {:cmns-col/isMemberOf :idmp-mprd/ISO20443-CodeSet,
   :cmns-txt/hasTextValue "ADJV",
   :db/ident :idmp-mprd/IngredientRole-ADJV,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type [:idmp-mprd/IngredientRoleCode :owl/NamedIndividual],
   :rdfs/label "ingredient role - ADJV",
   :skos/definition
   "code for an adjuvant, an ingredient(s) which augments or promotes the pharmacological effect of the active ingredient(s) without itself being considered active (typically used with vaccines)"})

(def IngredientRole-ADTV
  "code for an ingredient that is any additive added"
  {:cmns-col/isMemberOf :idmp-mprd/ISO20443-CodeSet,
   :cmns-txt/hasTextValue "ADTV",
   :db/ident :idmp-mprd/IngredientRole-ADTV,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type [:idmp-mprd/IngredientRoleCode :owl/NamedIndividual],
   :rdfs/label "ingredient role - ADTV",
   :skos/definition "code for an ingredient that is any additive added",
   :skos/note
   "Use only when there is no described pharmacological action and classification as merely 'inactive' ingredient is not appropriate"})

(def IngredientRole-BASE
  "code for an ingredient that is the base of a preparation"
  {:cmns-col/isMemberOf :idmp-mprd/ISO20443-CodeSet,
   :cmns-txt/hasTextValue "BASE",
   :db/ident :idmp-mprd/IngredientRole-BASE,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type [:idmp-mprd/IngredientRoleCode :owl/NamedIndividual],
   :rdfs/label "ingredient role - BASE",
   :skos/definition "code for an ingredient that is the base of a preparation",
   :skos/example "water, vaseline, ethanol"})

(def IngredientRole-CNTM
  "code for a contaminant, an ingredient whose presence is not intended but may not be reasonably avoided given the circumstances of the mixture's nature or origin"
  {:cmns-col/isMemberOf :idmp-mprd/ISO20443-CodeSet,
   :cmns-txt/hasTextValue "CNTM",
   :db/ident :idmp-mprd/IngredientRole-CNTM,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type [:idmp-mprd/IngredientRoleCode :owl/NamedIndividual],
   :rdfs/label "ingredient role - CNTM",
   :skos/definition
   "code for a contaminant, an ingredient whose presence is not intended but may not be reasonably avoided given the circumstances of the mixture's nature or origin"})

(def IngredientRole-COLR
  "code for an ingredient added to alter the color appearance"
  {:cmns-col/isMemberOf :idmp-mprd/ISO20443-CodeSet,
   :cmns-txt/hasTextValue "COLR",
   :db/ident :idmp-mprd/IngredientRole-COLR,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type [:idmp-mprd/IngredientRoleCode :owl/NamedIndividual],
   :rdfs/label "ingredient role - COLR",
   :skos/definition
   "code for an ingredient added to alter the color appearance"})

(def IngredientRole-FLVR
  "code for an ingredient added to alter the taste of the product"
  {:cmns-col/isMemberOf :idmp-mprd/ISO20443-CodeSet,
   :cmns-txt/hasTextValue "FLVR",
   :db/ident :idmp-mprd/IngredientRole-FLVR,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type [:idmp-mprd/IngredientRoleCode :owl/NamedIndividual],
   :rdfs/label "ingredient role - FLVR",
   :skos/definition
   "code for an ingredient added to alter the taste of the product"})

(def IngredientRole-IACT
  "code for an inactive ingredient, i.e. ingredients added for a purpose other than the intended pharmacological action"
  {:cmns-col/isMemberOf :idmp-mprd/ISO20443-CodeSet,
   :cmns-txt/hasTextValue "IACT",
   :db/ident :idmp-mprd/IngredientRole-IACT,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type [:idmp-mprd/IngredientRoleCode :owl/NamedIndividual],
   :rdfs/label "ingredient role - IACT",
   :skos/definition
   "code for an inactive ingredient, i.e. ingredients added for a purpose other than the intended pharmacological action"})

(def IngredientRole-INGR
  "code for an ingredient not otherwise specified, used in cases of devices or foods where further classification is not common"
  {:cmns-col/isMemberOf :idmp-mprd/ISO20443-CodeSet,
   :cmns-txt/hasTextValue "INGR",
   :db/ident :idmp-mprd/IngredientRole-INGR,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type [:idmp-mprd/IngredientRoleCode :owl/NamedIndividual],
   :rdfs/label "ingredient role - INGR",
   :skos/definition
   "code for an ingredient not otherwise specified, used in cases of devices or foods where further classification is not common"})

(def IngredientRole-MECH
  "code for a mechanical ingredient, an ingredient which, as a whole, lends a spatial structure to the product, which structure is meaningful to the delivery of the pharmacologically active ingredients near the target site"
  {:cmns-col/isMemberOf :idmp-mprd/ISO20443-CodeSet,
   :cmns-txt/hasTextValue "MECH",
   :db/ident :idmp-mprd/IngredientRole-MECH,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type [:idmp-mprd/IngredientRoleCode :owl/NamedIndividual],
   :rdfs/label "ingredient role - MECH",
   :skos/definition
   "code for a mechanical ingredient, an ingredient which, as a whole, lends a spatial structure to the product, which structure is meaningful to the delivery of the pharmacologically active ingredients near the target site",
   :skos/example
   "For example, a collagen matrix used as a base for transplanting skin cells.",
   :skos/note
   "Such ingredient has a function other than merely delivering the pharmacologically active substances into a systemic compartment (such as, for example, an ordinary capsule would have.)"})

(def IngredientRole-PRSV
  "code for a preservative, an ingredient added to delay the risk of the product's spoiling"
  {:cmns-col/isMemberOf :idmp-mprd/ISO20443-CodeSet,
   :cmns-txt/hasTextValue "PRSV",
   :db/ident :idmp-mprd/IngredientRole-PRSV,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type [:idmp-mprd/IngredientRoleCode :owl/NamedIndividual],
   :rdfs/label "ingredient role - PRSV",
   :skos/definition
   "code for a preservative, an ingredient added to delay the risk of the product's spoiling"})

(def IngredientRole-STBL
  "code for a stabilizer, an ingredient added to keep the mixture homogenic (e.g. prevent the phases of an emulsion to separate)"
  {:cmns-col/isMemberOf :idmp-mprd/ISO20443-CodeSet,
   :cmns-txt/hasTextValue "STBL",
   :db/ident :idmp-mprd/IngredientRole-STBL,
   :dcterms/source
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :rdf/type [:idmp-mprd/IngredientRoleCode :owl/NamedIndividual],
   :rdfs/label "ingredient role - STBL",
   :skos/definition
   "code for a stabilizer, an ingredient added to keep the mixture homogenic (e.g. prevent the phases of an emulsion to separate)"})

(def IngredientRoleCode
  "sequence of characters denoting an ingredient role, according to the ISO 20443 implementation guide for ISO 11615"
  {:cmns-av/adaptedFrom
   "ISO/TS 20443:2017(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, table D.1, clause D.2.1",
   :db/ident :idmp-mprd/IngredientRoleCode,
   :rdf/type :owl/Class,
   :rdfs/label "ingredient role code",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-sub/Ingredient,
                      :owl/onProperty :cmns-dsg/denotes,
                      :rdf/type       :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "sequence of characters denoting an ingredient role, according to the ISO 20443 implementation guide for ISO 11615"})

(def IntermediatePackaging
  "container between the outer packaging and the immediate container"
  {:db/ident :idmp-mprd/IntermediatePackaging,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.29",
   :rdf/type :owl/Class,
   :rdfs/label "intermediate packaging",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-mprd/contains,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:idmp-sub/ManufacturedItem
                                            :idmp-mprd/PharmaceuticalProduct],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :idmp-mprd/MedicinalProductContainer],
   :skos/definition
   "container between the outer packaging and the immediate container"})

(def InvestigationalMedicinalProduct
  "role of a pharmaceutical product or combination of pharmaceutical products or placebo(s) being tested or used as a reference in a clinical trial, including products already with a marketing authorization but used or assembled (packaged) in a way different from the authorized form, used for an unauthorized indication, or used to gain further information about the authorized form"
  {:cmns-av/abbreviation "IMP",
   :cmns-av/directSource
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.31",
   :db/ident :idmp-mprd/InvestigationalMedicinalProduct,
   :rdf/type :owl/Class,
   :rdfs/label "investigational medicinal product",
   :rdfs/subClassOf :idmp-mprd/ProductRole,
   :skos/definition
   "role of a pharmaceutical product or combination of pharmaceutical products or placebo(s) being tested or used as a reference in a clinical trial, including products already with a marketing authorization but used or assembled (packaged) in a way different from the authorized form, used for an unauthorized indication, or used to gain further information about the authorized form"})

(def InvestigationalMedicinalProductIdentifier
  "unique identifier allocated to an investigational medicinal product supplementary to any existing identifier as ascribed by a medicines regulatory agency in a region/jurisdiction or a sponsor of a clinical trial"
  {:cmns-av/abbreviation "IMPID",
   :db/ident :idmp-mprd/InvestigationalMedicinalProductIdentifier,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.32",
   :rdf/type :owl/Class,
   :rdfs/label "investigational medicinal product identifier",
   :rdfs/subClassOf [:cmns-ra/RegisteredIdentifier
                     :cmns-cds/CodeElement
                     {:owl/onClass :idmp-mprd/InvestigationalMedicinalProduct,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "unique identifier allocated to an investigational medicinal product supplementary to any existing identifier as ascribed by a medicines regulatory agency in a region/jurisdiction or a sponsor of a clinical trial",
   :skos/note
   ["This is for indexing purposes and to contribute to improving patient safety by allowing for the unique identification of medicinal products worldwide."
    "This is an alphanumeric text field."]})

(def Lot
  "unique amount of material having a set of common traits"
  {:db/ident :idmp-mprd/Lot,
   :dcterms/source
   "ANSI/ISA S88: https://www.isa.org/products/ansi-isa-88-00-01-2010-batch-control-part-1-models (paragraph 3.1.32)",
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type :owl/Class,
   :rdfs/label "lot",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :idmp-sub/Matter,
                      :rdf/type           :owl/Restriction}
                     :cmns-prd/Product],
   :skos/definition "unique amount of material having a set of common traits",
   :skos/editorialNote
   "This is preliminary and needs extension to specify common characteristics of a given lot.",
   :skos/note
   ["Some examples of common traits are material source, the master recipe used to produce the material, and distinct physical properties."
    "As defined in ANSI/ISA-95 and IEC 62264-1 as material lot: uniquely identifiable amount of a material."]})

(def LotNumber
  "identifier assigned to a unique amount of material having a set of common traits"
  {:cmns-av/adaptedFrom
   "ANSI/ISA S88: https://www.isa.org/products/ansi-isa-88-00-01-2010-batch-control-part-1-models (paragraph 3.1.32)",
   :cmns-av/synonym ["lot identifier" "lot ID"],
   :db/ident :idmp-mprd/LotNumber,
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type :owl/Class,
   :rdfs/label "lot number",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-id/denotes,
                      :owl/someValuesFrom :idmp-mprd/Lot,
                      :rdf/type           :owl/Restriction}
                     :cmns-cxtdsg/ContextualDesignation],
   :skos/definition
   "identifier assigned to a unique amount of material having a set of common traits"})

(def ManufacturingAuthorization
  "authorization provided by a medicines regulatory agency to manufacture medicinal products within a region"
  {:cmns-av/directSource
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.39",
   :db/ident :idmp-mprd/ManufacturingAuthorization,
   :rdf/type :owl/Class,
   :rdfs/label "manufacturing authorization",
   :rdfs/subClassOf [:idmp-mprd/Authorization
                     {:owl/onProperty     :cmns-cxtdsg/isApplicableIn,
                      :owl/someValuesFrom :lcc-cr/GeographicRegion,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :idmp-mprd/MedicinalProduct,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :idmp-mprd/hasAuthorizingParty,
                      :owl/someValuesFrom :idmp-mprd/MedicinesRegulatoryAgency,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :idmp-mprd/hasAuthorizedParty,
                      :owl/someValuesFrom :idmp-sub/Manufacturer,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "authorization provided by a medicines regulatory agency to manufacture medicinal products within a region",
   :skos/note
   "Such authorization may be required for both total and partial manufacture and for the various processes of dividing up, packaging or presentation. However, such authorization may not be required for preparation, dividing up, changes in packaging or presentation where these processes are carried out, solely for retail supply, by pharmacists in dispensing pharmacies or by persons legally authorized in a region to carry out such processes."})

(def ManufacturingProcess
  "structured set of activities or operations performed upon material to convert it from the raw material or a semifinished state to a state of further completion"
  {:db/ident :idmp-mprd/ManufacturingProcess,
   :dcterms/source
   "ISO 18629-11:2005(en) Industrial automation systems and integration — Process specification language — Part 11: PSL core - https://www.iso.org/obp/ui/#iso:std:iso:18629:-11:ed-1:v1:en, clause 3.1.15",
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type :owl/Class,
   :rdfs/label "manufacturing process",
   :rdfs/subClassOf :idmp-mprd/Process,
   :skos/definition
   "structured set of activities or operations performed upon material to convert it from the raw material or a semifinished state to a state of further completion",
   :skos/editorialNote
   "This is a starting point that requires extension to include further axioms including relationships with input and output materials, derived from ANSI/ISA S88 and the ISO Process Specification Language (PSL).",
   :skos/note
   "Manufacturing processes may be arranged in process layout, product layout, cellular layout or fixed position layout. Manufacturing processes may be planned to support make-to-stock, make-to-order, assemble-to-order, etc., based on strategic use and placements of inventories. [SOURCE:ISO 15531-1]"})

(def MarketingAuthorization
  "authorization issued from a medicines regulatory agency that allows a medicinal product to be placed on the market"
  {:cmns-av/directSource
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.40",
   :db/ident :idmp-mprd/MarketingAuthorization,
   :rdf/type :owl/Class,
   :rdfs/label "marketing authorization",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/isApplicableIn,
                      :owl/someValuesFrom :lcc-cr/GeographicRegion,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :idmp-mprd/MedicinalProduct,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :idmp-mprd/hasAuthorizingParty,
                      :owl/someValuesFrom :idmp-mprd/MedicinesRegulatoryAgency,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :idmp-mprd/hasAuthorizedParty,
                      :owl/someValuesFrom
                      :idmp-mprd/MarketingAuthorizationHolder,
                      :rdf/type :owl/Restriction}
                     :idmp-mprd/Authorization],
   :skos/definition
   "authorization issued from a medicines regulatory agency that allows a medicinal product to be placed on the market"})

(def MarketingAuthorizationHolder
  "organisation that holds the authorization for marketing a medicinal product in a region"
  {:cmns-av/directSource
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.41",
   :db/ident :idmp-mprd/MarketingAuthorizationHolder,
   :rdf/type :owl/Class,
   :rdfs/label "marketing authorization holder",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-org/LegalEntity,
                      :owl/onProperty :cmns-pts/isPlayedBy,
                      :rdf/type       :owl/Restriction}
                     :idmp-mprd/AuthorizedParty],
   :skos/definition
   "organisation that holds the authorization for marketing a medicinal product in a region"})

(def MarketingAuthorizationNumber
  "identifier assigned by a medicines regulatory agency to a medicinal product"
  {:cmns-av/directSource
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.42",
   :db/ident :idmp-mprd/MarketingAuthorizationNumber,
   :rdf/type :owl/Class,
   :rdfs/label "marketing authorization number",
   :rdfs/subClassOf [{:owl/onClass    :idmp-mprd/MedicinesRegulatoryAgency,
                      :owl/onProperty :cmns-ra/isRegisteredBy,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :idmp-mprd/MarketingAuthorization,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-ra/RegisteredIdentifier
                     :cmns-cds/CodeElement],
   :skos/definition
   "identifier assigned by a medicines regulatory agency to a medicinal product"})

(def MassBasedStrength
  "quantity or range of quantities of the substance/specified substance present per unitary volume (or mass) ..."
  {:db/ident :idmp-mprd/MassBasedStrength,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated medicinal product information, clause 9.7.2.5.3",
   :rdf/type :owl/Class,
   :rdfs/label "mass-based strength",
   :rdfs/subClassOf :idmp-mprd/Strength,
   :skos/definition
   "quantity or range of quantities of the substance/specified substance present per unitary volume (or mass) ..."})

(def MedicinalProduct
  "pharmaceutical product or combination of pharmaceutical products that may be administered to human beings (or animals) for treating or preventing disease, with the aim/purpose of making a medical diagnosis or to restore, correct or modify physiological functions"
  {:cmns-av/directSource
   ["ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.50"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.42"],
   :db/ident :idmp-mprd/MedicinalProduct,
   :rdf/type :owl/Class,
   :rdfs/label "medicinal product",
   :rdfs/subClassOf [:idmp-sub/ManufacturedItem
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-sub/ManufacturedItem,
                      :owl/onProperty :cmns-col/comprises,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-mprd/PharmaceuticalProduct,
                      :owl/onProperty :cmns-col/comprises,
                      :rdf/type       :owl/Restriction}
                     :idmp-sub/Material
                     :cmns-prd/CommercialProduct],
   :skos/definition
   "pharmaceutical product or combination of pharmaceutical products that may be administered to human beings (or animals) for treating or preventing disease, with the aim/purpose of making a medical diagnosis or to restore, correct or modify physiological functions",
   :skos/note
   ["A medicinal product may contain in the packaging one or more manufactured items and one or more pharmaceutical products. In certain regions, a medicinal product may also be defined as any substance or combination of substances which may be used to make a medical diagnosis."
    "The provisions in this document [ontology] apply to proprietary medicinal products for human use intended to be placed on the market and to industrially manufactured medicinal products, the marketing of which has been authorized by a medicines regulatory agency. However, the provisions do not apply to: i) medicinal products prepared according to prescription (e.g. prepared in a pharmacy from a prescription intended for a specific patient), ii) medicinal products prepared in accordance with an official formula (e.g. prepared in a pharmacy in accordance with the instructions in a pharmacopoeia and intended to be given direct to the patient by the pharmacy), iii) medicinal products intended for research and development trials, and to iv) intermediate products intended for subsequent processing by an authorized manufacturer."]})

(def MedicinalProductBatchIdentifierForImmediatePackaging
  "unique identifier allocated to a specific batch of a medicinal product, which appears on the immediate packaging, where this is not the outer packaging"
  {:cmns-av/abbreviation "BAID2",
   :cmns-av/synonym "medicinal product batch identifier 2",
   :db/ident :idmp-mprd/MedicinalProductBatchIdentifierForImmediatePackaging,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.52",
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-DefinitionallyConformant,
   :rdf/type :owl/Class,
   :rdfs/label "medicinal product batch identifier for immediate packaging",
   :rdfs/subClassOf [{:owl/onProperty :cmns-col/comprises,
                      :owl/someValuesFrom
                      :idmp-mprd/PharmaceuticalProductBatchNumber,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :cmns-cxtid/StructuredIdentifier
                     :idmp-mprd/BatchNumber],
   :skos/definition
   "unique identifier allocated to a specific batch of a medicinal product, which appears on the immediate packaging, where this is not the outer packaging",
   :skos/editorialNote
   "For more explicit modeling of the semanitics we should consider creating a property chain that links the BAID1 through the pharmaceutical product batch identifier, through the pharmaceutical product batch to its expiration date rather than using a disconnected date (future update).",
   :skos/note
   "It is constructed by using the batch number assigned by the manufacturer and the expiration date. This is for indexing purposes and to contribute to improving patient safety by allowing for the unique identification of a medicinal product based at the level of the immediate container."})

(def MedicinalProductBatchIdentifierForOuterPackaging
  "unique identifier allocated to a specific batch of a medicinal product, which appears on the outer packaging of the medicinal product"
  {:cmns-av/abbreviation "BAID1",
   :cmns-av/synonym "medicinal product batch identifier 1",
   :db/ident :idmp-mprd/MedicinalProductBatchIdentifierForOuterPackaging,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.51",
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-DefinitionallyConformant,
   :rdf/type :owl/Class,
   :rdfs/label "medicinal product batch identifier for outer packaging",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :cmns-col/comprises,
                      :owl/someValuesFrom
                      :idmp-mprd/PharmaceuticalProductBatchNumber,
                      :rdf/type :owl/Restriction}
                     :cmns-cxtid/StructuredIdentifier
                     :idmp-mprd/BatchNumber],
   :skos/definition
   "unique identifier allocated to a specific batch of a medicinal product, which appears on the outer packaging of the medicinal product",
   :skos/editorialNote
   "For more explicit modeling of the semanitics we should consider creating a property chain that links the BAID1 through the pharmaceutical product batch identifier, through the pharmaceutical product batch to its expiration date rather than using a disconnected date (future update).",
   :skos/note
   "It is constructed by using the batch number assigned by the manufacturer and the expiration date. This is for indexing purposes and to contribute to improving patient safety by allowing for the unique identification of a medicinal product at the package level."})

(def MedicinalProductContainer
  "container that is part of a medicinal product and is used for storage, identification and/or transport of the components of the medicinal product"
  {:cmns-av/adaptedFrom
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.16",
   :cmns-av/usageNote
   "In the ISO 11615 standard, the term container was used more generally and in some cases more specifically. This concept, medicinal product container, was added with the original definition for container in the IDMP standard in order to differentiate the two concepts and enable proper representation of some of the more specific kinds of containers included in the standard.",
   :db/ident :idmp-mprd/MedicinalProductContainer,
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-DefinitionallyConformant,
   :rdf/type :owl/Class,
   :rdfs/label "medicinal product container",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/isPartOf,
                      :owl/someValuesFrom :idmp-mprd/MedicinalProduct,
                      :rdf/type           :owl/Restriction}
                     :idmp-mprd/Container
                     :idmp-sub/ManufacturedItem],
   :skos/definition
   "container that is part of a medicinal product and is used for storage, identification and/or transport of the components of the medicinal product"})

(def MedicinalProductIdentifier
  "unique identifier allocated to a medicinal product supplementary to any existing authorization number as ascribed by a medicines regulatory agency in a region"
  {:cmns-av/abbreviation "MPID",
   :cmns-av/directSource
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.53",
   :db/ident :idmp-mprd/MedicinalProductIdentifier,
   :rdf/type :owl/Class,
   :rdfs/label "medicinal product identifier",
   :rdfs/subClassOf [{:owl/onClass    :idmp-mprd/MedicinalProduct,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-ra/RegisteredIdentifier
                     :cmns-cds/CodeElement
                     :cmns-cxtid/StructuredIdentifier],
   :skos/definition
   "unique identifier allocated to a medicinal product supplementary to any existing authorization number as ascribed by a medicines regulatory agency in a region",
   :skos/note
   ["This is for indexing purposes and to contribute to improved patient safety by allowing for the unique identification of Medicinal Products worldwide."
    "This is an alphanumeric text field."]})

(def MedicinalProductManufacturingProcess
  "process of production for a substance or medicinal product from the acquisition of all materials through all processing stages"
  {:cmns-av/synonym "manufacturing",
   :db/ident :idmp-mprd/MedicinalProductManufacturingProcess,
   :dcterms/source
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.40",
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-DefinitionallyConformant,
   :rdf/type :owl/Class,
   :rdfs/label "medicinal product manufacturing process",
   :rdfs/subClassOf :idmp-mprd/ManufacturingProcess,
   :skos/definition
   "process of production for a substance or medicinal product from the acquisition of all materials through all processing stages",
   :skos/editorialNote
   "This is a starting point that requires extension to include additional relationships as described in the note.",
   :skos/note
   "The critical process, critical process steps, starting and processing materials and critical production parameters are included."})

(def MedicinalProductName
  "name as authorised by a medicines regulatory agency"
  {:cmns-av/directSource
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.54",
   :db/ident :idmp-mprd/MedicinalProductName,
   :rdf/type :owl/Class,
   :rdfs/label "medicinal product name",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-dsg/isNameOf,
                      :owl/someValuesFrom :idmp-mprd/MedicinalProduct,
                      :rdf/type           :owl/Restriction}
                     :cmns-cxtdsg/ContextualName],
   :skos/definition "name as authorised by a medicines regulatory agency",
   :skos/note
   "This may be either an invented name not liable to be confused with the common name, or a common or a scientific name accompanied by a trade mark or any other applicable descriptor."})

(def MedicinesRegulatoryAgency
  "institutional body that, according to the legal system under which it has been established, is responsible for the granting of marketing authorizations, clinical trial authorizations and manufacturing authorizations for medicinal products"
  {:cmns-av/directSource
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.56",
   :db/ident :idmp-mprd/MedicinesRegulatoryAgency,
   :rdf/type :owl/Class,
   :rdfs/label "medicines regulatory agency",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-mprd/ManufacturingAuthorization,
                      :owl/onProperty :idmp-mprd/authorizesThrough,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-mprd/MedicinalProduct,
                      :owl/onProperty :cmns-rga/regulates,
                      :rdf/type       :owl/Restriction}
                     :cmns-rga/RegulatoryAgency
                     :idmp-mprd/AuthorizingParty
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-mprd/MarketingAuthorization,
                      :owl/onProperty :idmp-mprd/authorizesThrough,
                      :rdf/type       :owl/Restriction}
                     :cmns-ra/RegistrationAuthority],
   :skos/definition
   "institutional body that, according to the legal system under which it has been established, is responsible for the granting of marketing authorizations, clinical trial authorizations and manufacturing authorizations for medicinal products",
   :skos/note
   "In certain regions, the role of the institutional body, which according to the legal system grants the marketing authorization of medicinal products, may be complemented by an additional institutional body responsible for the evaluation and supervision of medicinal products. For example, in the EU, the European Commission is the institutional body that grants the marketing authorization of medicinal products and the European Medicines Agency is the body responsible for the evaluation and supervision of medicinal products."})

(def OuterPackaging
  "external container in which a medicinal product is supplied"
  {:cmns-av/explanatoryNote
   "The manufactured item or pharmaceutical product is not in direct contact with the outer packaging except where the outer packaging also serves as the immediate container. An alternative, compatible definition of outer packaging is given in Directive 92/27/EEC.",
   :db/ident :idmp-mprd/OuterPackaging,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.57",
   :rdf/type :owl/Class,
   :rdfs/label "outer packaging",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-mprd/contains,
                      :owl/someValuesFrom :idmp-mprd/MedicinalProduct,
                      :rdf/type           :owl/Restriction}
                     :idmp-mprd/MedicinalProductContainer],
   :skos/definition
   "external container in which a medicinal product is supplied"})

(def PackageItem
  "individual, distinct item contained in a packaged medicinal product that acts as a container for one or more manufactured item(s)"
  {:cmns-av/explanatoryNote
   "The manufactured item or pharmaceutical product is not in direct contact with the outer packaging except where the outer packaging also serves as the immediate container. An alternative, compatible definition of outer packaging is given in Directive 92/27/EEC.",
   :db/ident :idmp-mprd/PackageItem,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.58",
   :rdf/type :owl/Class,
   :rdfs/label "package item",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-mprd/isContainedIn,
                      :owl/someValuesFrom :idmp-mprd/PackagedMedicinalProduct,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :idmp-mprd/contains,
                      :owl/someValuesFrom :idmp-sub/ManufacturedItem,
                      :rdf/type           :owl/Restriction}
                     :idmp-mprd/MedicinalProductContainer],
   :skos/definition
   "individual, distinct item contained in a packaged medicinal product that acts as a container for one or more manufactured item(s)"})

(def PackagedMedicinalProduct
  "medicinal product in a container being part of a package, representing the entirety that has been packaged for sale or supply"
  {:db/ident :idmp-mprd/PackagedMedicinalProduct,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.57",
   :rdf/type :owl/Class,
   :rdfs/label "packaged medicinal product",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-mprd/isContainedIn,
                      :owl/someValuesFrom :idmp-mprd/MedicinalProductContainer,
                      :rdf/type           :owl/Restriction}
                     :idmp-mprd/MedicinalProduct],
   :skos/definition
   "medicinal product in a container being part of a package, representing the entirety that has been packaged for sale or supply"})

(def PharmaceuticalProduct
  "qualitative and quantitative composition of a medicinal product in the dose form approved for administration in line with the regulated product information"
  {:cmns-av/directSource
   ["ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.60"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.58"],
   :db/ident :idmp-mprd/PharmaceuticalProduct,
   :rdf/type :owl/Class,
   :rdfs/label "pharmaceutical product",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-dsg/isDefinedIn,
                      :owl/someValuesFrom :idmp-mprd/ProductConstituency,
                      :rdf/type           :owl/Restriction}
                     :cmns-prd/Product
                     :idmp-sub/Material],
   :skos/definition
   "qualitative and quantitative composition of a medicinal product in the dose form approved for administration in line with the regulated product information",
   :skos/note
   "In many instances, the pharmaceutical product is equal to the manufactured item. However, there are instances where the manufactured item shall undergo a transformation before being administered to the patient (as the pharmaceutical product) and the two are not equal."})

(def PharmaceuticalProductBatch
  "specific quantity of a drug or other material that is intended to have uniform character and quality, within specified limits, and is produced according to a single manufacturing order during the same cycle of manufacture"
  {:db/ident :idmp-mprd/PharmaceuticalProductBatch,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.8",
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-DefinitionallyConformant,
   :rdf/type :owl/Class,
   :rdfs/label "pharmaceutical product batch",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-doc/hasExpirationDate,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :idmp-mprd/Batch
                     {:owl/onProperty     :cmns-col/isConstituentOf,
                      :owl/someValuesFrom :idmp-mprd/PharmaceuticalProduct,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-qtu/hasQuantityValue,
                      :owl/someValuesFrom :cmns-qtu/QuantityValue,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :idmp-mprd/isContainedIn,
                      :owl/someValuesFrom :idmp-mprd/PackagedMedicinalProduct,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "specific quantity of a drug or other material that is intended to have uniform character and quality, within specified limits, and is produced according to a single manufacturing order during the same cycle of manufacture",
   :skos/editorialNote
   "This definition of batch entails axioms relating the batch to a manufacturing order and identifying the manufacturing cycle, which need to be added."})

(def PharmaceuticalProductBatchNumber
  "identifier assigned to a specific batch of a medicinal product or item resulting from a manufacturing process at a specific point of time"
  {:db/ident :idmp-mprd/PharmaceuticalProductBatchNumber,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.9",
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-DefinitionallyConformant,
   :rdf/type :owl/Class,
   :rdfs/label "pharmaceutical product batch number",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-dsg/denotes,
                      :owl/someValuesFrom :idmp-mprd/PharmaceuticalProductBatch,
                      :rdf/type           :owl/Restriction}
                     :idmp-mprd/BatchNumber],
   :skos/definition
   "identifier assigned to a specific batch of a medicinal product or item resulting from a manufacturing process at a specific point of time"})

(def PharmaceuticalProductIdentifier
  "unique identifier for a pharmaceutical product"
  {:cmns-av/abbreviation "PhPID",
   :cmns-av/directSource
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.61",
   :db/ident        :idmp-mprd/PharmaceuticalProductIdentifier,
   :rdf/type        :owl/Class,
   :rdfs/label      "pharmaceutical product identifier",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-id/identifies,
                      :owl/someValuesFrom :idmp-mprd/PharmaceuticalProduct,
                      :rdf/type           :owl/Restriction}
                     :cmns-id/Identifier],
   :skos/definition "unique identifier for a pharmaceutical product"})

(def Placebo
  "inactive substance, treatment or procedure that is intended to provide baseline measurements for the experimental protocol of a clinical trial"
  {:cmns-av/explanatoryNote
   "A placebo is essentially a medicinal product, with the same packaging, etc. from a patient perspective as the actual investigational or authorized product used in a clinical trial, but without the active ingredient studied in the trial.",
   :db/ident :idmp-mprd/Placebo,
   :dcterms/source
   "National Cancer Institute Thesaurus, see http://ncicb.nci.nih.gov/xml/owl/EVS/Thesaurus.owl#C753",
   :rdf/type :owl/Class,
   :rdfs/label "placebo",
   :rdfs/subClassOf :idmp-mprd/MedicinalProduct,
   :skos/definition
   "inactive substance, treatment or procedure that is intended to provide baseline measurements for the experimental protocol of a clinical trial"})

(def PresentationStrength
  "quantity or range of quantities of the substance/specified substance present per unitary volume (or mass) expressed in units of presentation ..."
  {:cmns-av/synonym "strength (presentation)",
   :db/ident :idmp-mprd/PresentationStrength,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated medicinal product information, clause 9.7.2.5.3",
   :rdf/type :owl/Class,
   :rdfs/label "presentation strength",
   :rdfs/subClassOf :idmp-mprd/Strength,
   :skos/definition
   "quantity or range of quantities of the substance/specified substance present per unitary volume (or mass) expressed in units of presentation ..."})

(def ProcessClass
  "structured set of activities involving various enterprise entities, that is designed and organized for a given purpose"
  {:db/ident :idmp-mprd/Process,
   :dcterms/source
   "ISO 18629-11:2005(en) Industrial automation systems and integration — Process specification language — Part 11: PSL core - https://www.iso.org/obp/ui/#iso:std:iso:18629:-11:ed-1:v1:en, clause 3.1.21",
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type :owl/Class,
   :rdfs/label "process",
   :skos/definition
   "structured set of activities involving various enterprise entities, that is designed and organized for a given purpose",
   :skos/editorialNote
   "This is a starting point that requires extension to include the activities that comprise the process, derived from ANSI/ISA S88 and the ISO Process Specification Language (PSL).",
   :skos/note
   "The definition provided here is very close to that given in ISO 10303-49. Nevertheless ISO 15531 needs the notion of structured set of activities, without any predefined reference to the time or steps. In addition, from the point of view of flow management, some empty processes may be needed for a synchronisation purpose although they are not actually doing anything (ghost task). [SOURCE:ISO 15531-1]"})

(def ProcessIdentifier
  "identifier assigned to a structured set of activities involving various enterprise entities, that is designed and organized for a given purpose"
  {:cmns-av/adaptedFrom
   "ISO 18629-11:2005(en) Industrial automation systems and integration — Process specification language — Part 11: PSL core - https://www.iso.org/obp/ui/#iso:std:iso:18629:-11:ed-1:v1:en, clause 3.1.21",
   :db/ident :idmp-mprd/ProcessIdentifier,
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type :owl/Class,
   :rdfs/label "process identifier",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-id/denotes,
                      :owl/someValuesFrom :idmp-mprd/Process,
                      :rdf/type           :owl/Restriction}
                     :cmns-cxtdsg/ContextualDesignation],
   :skos/definition
   "identifier assigned to a structured set of activities involving various enterprise entities, that is designed and organized for a given purpose"})

(def ProcessStep
  "part of a process that usually operates independently from other process stages and that usually results in a planned sequence of chemical or physical changes in the material being processed"
  {:db/ident :idmp-mprd/ProcessStep,
   :dcterms/source
   "ANSI/ISA S88: https://www.isa.org/products/ansi-isa-88-00-01-2010-batch-control-part-1-models (paragraph 3.1.6)",
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type :owl/Class,
   :rdfs/label "process step",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/isPartOf,
                      :owl/someValuesFrom :idmp-mprd/Process,
                      :rdf/type           :owl/Restriction}
                     :cmns-col/Constituent],
   :skos/definition
   "part of a process that usually operates independently from other process stages and that usually results in a planned sequence of chemical or physical changes in the material being processed",
   :skos/editorialNote
   "Note that this is an early representation of the concept only, and will likely require extension in future releases."})

(def ProcessStepIdentifier
  "identifier assigned to a part of a process"
  {:cmns-av/adaptedFrom
   "ANSI/ISA S88: https://www.isa.org/products/ansi-isa-88-00-01-2010-batch-control-part-1-models (paragraph 3.1.6)",
   :db/ident :idmp-mprd/ProcessStepIdentifier,
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type :owl/Class,
   :rdfs/label "process step identifier",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-id/denotes,
                      :owl/someValuesFrom :idmp-mprd/ProcessStep,
                      :rdf/type           :owl/Restriction}
                     :cmns-cxtdsg/ContextualDesignation],
   :skos/definition "identifier assigned to a part of a process"})

(def ProductConstituency
  "constituency that defines some product based on its relationship(s) to some other substance(s) (ingredient(s)), potentially with a given strength, in some context"
  {:cmns-av/usageNote
   "From an implementation (mapping) perspective, this product constituency class provides the basis for a (blank) node in the relationship 'product realizes ingredient role played by some substance', where the ingredient role may be that of an active ingredient which, in turn, may have some basis of strength in some context. The same product constituency could be used to link inactive ingredients to a product in which they are realized. A given product may include multiple active ingredients, each of which may have a different basis of strength.",
   :db/ident :idmp-mprd/ProductConstituency,
   :rdf/type :owl/Class,
   :rdfs/label "product constituency",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-pts/hasRole,
                      :owl/someValuesFrom :idmp-sub/Ingredient,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-mprd/PharmaceuticalProduct,
                      :owl/onProperty :cmns-dsg/defines,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-mprd/MedicinalProduct,
                      :owl/onProperty :cmns-dsg/defines,
                      :rdf/type       :owl/Restriction}
                     :cmns-pts/Constituency],
   :skos/definition
   "constituency that defines some product based on its relationship(s) to some other substance(s) (ingredient(s)), potentially with a given strength, in some context"})

(def ProductRole
  "functional role played by a product that is part of or used in the preparation of some manufactured item, or pharmaceutical product, medication, or drug, or in some investigation"
  {:db/ident :idmp-mprd/ProductRole,
   :rdf/type :owl/Class,
   :rdfs/label "product role",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-pts/isPlayedBy,
                      :owl/someValuesFrom :cmns-prd/Product,
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/FunctionalRole],
   :skos/definition
   "functional role played by a product that is part of or used in the preparation of some manufactured item, or pharmaceutical product, medication, or drug, or in some investigation"})

(def ReferenceStrength
  "strength of an active substance(s) and/or specified substance(s) used as a reference from which the strength of an investigational or authorised medicinal product is described"
  {:db/ident :idmp-mprd/ReferenceStrength,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated medicinal product information, clause 3.1.72",
   :rdf/type :owl/Class,
   :rdfs/label "reference strength",
   :rdfs/subClassOf :idmp-mprd/Strength,
   :skos/definition
   "strength of an active substance(s) and/or specified substance(s) used as a reference from which the strength of an investigational or authorised medicinal product is described",
   :skos/note
   "The strength of the active substance(s) and/or specified substance(s) shall be described as a quantity of the substance present in a given unit of the pharmaceutical product or manufactured item."})

(def RegistrationNumber
  "identifier assigned to a clinical trial by a medicines regulatory agency in a region for tracking purposes"
  {:db/ident :idmp-mprd/RegistrationNumber,
   :rdf/type :owl/Class,
   :rdfs/label "registration number",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-rga/isApplicableInJurisdiction,
                      :owl/someValuesFrom :lcc-cr/GeographicRegion,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-ra/isRegisteredBy,
                      :owl/someValuesFrom :idmp-mprd/MedicinesRegulatoryAgency,
                      :rdf/type           :owl/Restriction}
                     :idmp-mprd/ClinicalTrialIdentifier],
   :skos/definition
   "identifier assigned to a clinical trial by a medicines regulatory agency in a region for tracking purposes"})

(def Sponsor
  "individual, company, institution or organization (party), which takes responsibility for the initiation, management and/or financing of a clinical trial"
  {:db/ident :idmp-mprd/Sponsor,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated medicinal product information, clause 3.1.78",
   :rdf/type :owl/Class,
   :rdfs/label "sponsor",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-mprd/sponsors,
                      :owl/someValuesFrom :idmp-mprd/ClinicalTrial,
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/Actor],
   :skos/definition
   "individual, company, institution or organization (party), which takes responsibility for the initiation, management and/or financing of a clinical trial"})

(def Strength
  "quantity or range of quantities of the substance/specified substance present per unitary volume (or mass)"
  {:cmns-av/explanatoryNote
   "When required for expression of strength, the unit of presentation shall be specified in accordance with ISO 11239 and its resulting terminology. The controlled term and a term identifier for the unit of presentation shall be specified in the associated manufactured item or pharmaceutical product. For strength expressed using standard units, the unit of measure symbol and the symbol identifier as defined in ISO 11240 and its resulting controlled vocabulary shall be specified.",
   :db/ident :idmp-mprd/Strength,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated medicinal product information, clause 9.7.2.5.3",
   :rdf/type :owl/Class,
   :rdfs/label "strength",
   :rdfs/subClassOf
   [{:owl/onClass    {:owl/unionOf [:cmns-qtu/QuantityValue
                                    :cmns-qtu/QuantityValueRange],
                      :rdf/type    :owl/Class},
     :owl/onProperty :cmns-qtu/hasNumerator,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    :cmns-qtu/Expression
    {:owl/onClass    {:owl/unionOf [:cmns-qtu/QuantityValue
                                    :cmns-qtu/QuantityValueRange],
                      :rdf/type    :owl/Class},
     :owl/onProperty :cmns-qtu/hasDenominator,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :cmns-doc/refersTo,
     :owl/someValuesFrom :idmp-sub/Substance,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "quantity or range of quantities of the substance/specified substance present per unitary volume (or mass)",
   :skos/note
   "For solid dose forms, strength (concentration) is generally the same as strength (presentation) and therefore is not required to be expressed separately; the strength (presentation) only is required."})

(def administers
  "indicates a medicinal product that is administered by some party, such as a clinician"
  {:db/ident :idmp-mprd/administers,
   :owl/inverseOf :idmp-mprd/isAdministeredBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "administers",
   :rdfs/range :idmp-mprd/MedicinalProduct,
   :rdfs/subPropertyOf :cmns-prd/provides,
   :skos/definition
   "indicates a medicinal product that is administered by some party, such as a clinician"})

(def authorizes
  "endorses, enables, empowers, or gives permission to"
  {:db/ident           :idmp-mprd/authorizes,
   :owl/inverseOf      :idmp-mprd/isAuthorizedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :idmp-mprd/AuthorizingParty,
   :rdfs/label         "authorizes",
   :rdfs/range         :idmp-mprd/AuthorizedParty,
   :rdfs/subPropertyOf :cmns-pts/actsOn,
   :skos/definition    "endorses, enables, empowers, or gives permission to"})

(def authorizesThrough
  "indicates the situation that facilitates designation of an authorized party by the authorizing party for some purpose"
  {:db/ident :idmp-mprd/authorizesThrough,
   :owl/inverseOf :idmp-mprd/hasAuthorizingParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-mprd/AuthorizingParty,
   :rdfs/label "authorizes through",
   :rdfs/range :idmp-mprd/Authorization,
   :rdfs/subPropertyOf :cmns-pts/actsIn,
   :skos/definition
   "indicates the situation that facilitates designation of an authorized party by the authorizing party for some purpose"})

(def contains
  "holds within its volume or area"
  {:cmns-av/explanatoryNote
   "Contains implies the actual presence of something, such as some material or substance.",
   :db/ident           :idmp-mprd/contains,
   :owl/inverseOf      :idmp-mprd/isContainedIn,
   :rdf/type           [:owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/domain        :idmp-mprd/Container,
   :rdfs/label         "contains",
   :rdfs/subPropertyOf :cmns-col/hasPart,
   :skos/definition    "holds within its volume or area"})

(def evaluates
  "assesses the nature, quality, or ability of someone or something"
  {:db/ident :idmp-mprd/evaluates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "evaluates",
   :rdfs/subPropertyOf :cmns-cxtdsg/appliesTo,
   :skos/definition
   "assesses the nature, quality, or ability of someone or something"})

(def hasActiveIngredient
  "relates something representing the contituents of a pharmaceutical or medicinal product to something in the role of an active ingredient"
  {:db/ident :idmp-mprd/hasActiveIngredient,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has active ingredient",
   :rdfs/range :idmp-sub/ActiveIngredient,
   :rdfs/subPropertyOf :idmp-mprd/hasIngredient,
   :skos/definition
   "relates something representing the contituents of a pharmaceutical or medicinal product to something in the role of an active ingredient"})

(def hasActiveIngredientRole
  {:db/ident       :idmp-mprd/hasActiveIngredientRole,
   :owl/deprecated true,
   :owl/equivalentProperty :idmp-mprd/hasActiveIngredient,
   :rdf/type       :owl/ObjectProperty})

(def hasAuthorization
  "relates a medicinal product to a specific authorization (manufacturing or marketing) in some jurisdiction"
  {:db/ident :idmp-mprd/hasAuthorization,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has authorization",
   :rdfs/range :idmp-mprd/Authorization,
   :rdfs/subPropertyOf :cmns-cxtdsg/isApplicableIn,
   :skos/definition
   "relates a medicinal product to a specific authorization (manufacturing or marketing) in some jurisdiction"})

(def hasAuthorizedParty
  "indicates the party that is endorsed, enabled, empowered, or otherwise permitted to do something in the situation"
  {:db/ident :idmp-mprd/hasAuthorizedParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-mprd/Authorization,
   :rdfs/label "has authorized party",
   :rdfs/range :idmp-mprd/AuthorizedParty,
   :rdfs/subPropertyOf :cmns-pts/hasUndergoer,
   :skos/definition
   "indicates the party that is endorsed, enabled, empowered, or otherwise permitted to do something in the situation"})

(def hasAuthorizingParty
  "indicates the party that endorses, enables, empowers, or gives permission in the situation"
  {:db/ident :idmp-mprd/hasAuthorizingParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-mprd/Authorization,
   :rdfs/label "has authorizing party",
   :rdfs/range :idmp-mprd/AuthorizingParty,
   :rdfs/subPropertyOf :cmns-pts/hasActor,
   :skos/definition
   "indicates the party that endorses, enables, empowers, or gives permission in the situation"})

(def hasBasisOfStrength
  "relates a pharmaceutical or medicinal product to a substance that is its basis of strength"
  {:db/ident :idmp-mprd/hasBasisOfStrength,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has basis of strength",
   :rdfs/range :idmp-sub/Substance,
   :rdfs/subPropertyOf :cmns-ra/isRelatedTo,
   :skos/definition
   "relates a pharmaceutical or medicinal product to a substance that is its basis of strength"})

(def hasBasisOfStrengthAsManufactured
  "indicates the role of an active ingredient as the basis of strength of any substance or pharmaceutical product as manufactured"
  {:db/ident :idmp-mprd/hasBasisOfStrengthAsManufactured,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has basis of strength as manufactured",
   :rdfs/subPropertyOf :idmp-mprd/hasActiveIngredient,
   :skos/definition
   "indicates the role of an active ingredient as the basis of strength of any substance or pharmaceutical product as manufactured"})

(def hasIngredient
  "relates something representing the contituents of a pharmaceutical or medicinal product to something in the role of an ingredient"
  {:db/ident :idmp-mprd/hasIngredient,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has ingredient",
   :rdfs/range :idmp-sub/Ingredient,
   :rdfs/subPropertyOf :cmns-pts/hasRole,
   :skos/definition
   "relates something representing the contituents of a pharmaceutical or medicinal product to something in the role of an ingredient"})

(def hasIngredientRole
  {:db/ident       :idmp-mprd/hasIngredientRole,
   :owl/deprecated true,
   :owl/equivalentProperty :idmp-mprd/hasIngredient,
   :rdf/type       :owl/ObjectProperty})

(def hasReferenceStrength
  "indicates the reference strength for the reference substance of an active ingredient in a pharmaceutical or medicinal product"
  {:db/ident :idmp-mprd/hasReferenceStrength,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has reference strength",
   :rdfs/range :idmp-mprd/ReferenceStrength,
   :rdfs/subPropertyOf :idmp-mprd/hasStrength,
   :skos/definition
   "indicates the reference strength for the reference substance of an active ingredient in a pharmaceutical or medicinal product"})

(def hasReferenceSubstance
  "relates a substance in the role of an active ingredient in a pharmaceutical or medicinal product to a reference substance that is its underlying basis of strength"
  {:db/ident :idmp-mprd/hasReferenceSubstance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has reference substance",
   :rdfs/range :idmp-sub/Substance,
   :rdfs/subPropertyOf :idmp-mprd/hasBasisOfStrength,
   :skos/definition
   "relates a substance in the role of an active ingredient in a pharmaceutical or medicinal product to a reference substance that is its underlying basis of strength"})

(def hasSponsor
  "indicates the party that initiates, manages, and/or finances the clinical trial"
  {:cmns-av/adaptedFrom
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated medicinal product information, clause 3.1.78",
   :db/ident :idmp-mprd/hasSponsor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-mprd/ClinicalTrial,
   :rdfs/label "has sponsor",
   :rdfs/range :idmp-mprd/Sponsor,
   :rdfs/subPropertyOf :cmns-pts/hasActor,
   :skos/definition
   "indicates the party that initiates, manages, and/or finances the clinical trial"})

(def hasStrength
  "indicates the strength of any element in a substance or pharmaceutical product"
  {:db/ident :idmp-mprd/hasStrength,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has strength",
   :rdfs/range :idmp-mprd/Strength,
   :rdfs/subPropertyOf :cmns-qtu/hasExpression,
   :skos/definition
   "indicates the strength of any element in a substance or pharmaceutical product"})

(def immediatelyContains
  "holds within its volume or area and is in direct contact with"
  {:db/ident :idmp-mprd/immediatelyContains,
   :dcterms/source
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1.27",
   :owl/inverseOf :idmp-mprd/isImmediatelyContainedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-mprd/Container,
   :rdfs/label "immediately contains",
   :rdfs/subPropertyOf [:cmns-col/hasDirectPart :idmp-mprd/contains],
   :skos/definition
   "holds within its volume or area and is in direct contact with"})

(def isAdministeredBy
  "indicates a party, such as a clinician, that administers some medicinal product"
  {:db/ident :idmp-mprd/isAdministeredBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-mprd/MedicinalProduct,
   :rdfs/label "is administered by",
   :rdfs/subPropertyOf :cmns-prd/isProvidedBy,
   :skos/definition
   "indicates a party, such as a clinician, that administers some medicinal product"})

(def isAdministeredIn
  "indicates a clinical trial in which a given investigational medicinal product is administered"
  {:db/ident :idmp-mprd/isAdministeredIn,
   :owl/inverseOf :idmp-mprd/managesAdministrationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-mprd/InvestigationalMedicinalProduct,
   :rdfs/label "is administered in",
   :rdfs/range :idmp-mprd/ClinicalTrial,
   :rdfs/subPropertyOf :cmns-pts/isObjectRoleIn,
   :skos/definition
   "indicates a clinical trial in which a given investigational medicinal product is administered"})

(def isAllergenic
  "is a device that contains allergens and/or materials of concern or ingredient that is a known or suspected allergen"
  {:cmns-av/adaptedFrom
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated medicinal product information, clause 9.7.2.2.3",
   :db/ident :idmp-mprd/isAllergenic,
   :dcterms/source
   "ISO/TS 20443:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11615 data elements and structures for the unique identification and exchange of regulated medicinal product information, clauses C.3.16.3 and D.2.2",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-BL,
   :idmp-sub/hasConformanceLevel :idmp-sub/ConformanceLevel-Conditional,
   :rdf/type [:owl/DatatypeProperty :owl/FunctionalProperty],
   :rdfs/label "is allergenic",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :idmp-dtp/hasBooleanValue,
   :skos/definition
   "is a device that contains allergens and/or materials of concern or ingredient that is a known or suspected allergen"})

(def isAuthorizedBy
  "is endorsed, enabled, empowered, or otherwise permitted by"
  {:db/ident :idmp-mprd/isAuthorizedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-mprd/AuthorizedParty,
   :rdfs/label "is authorized by",
   :rdfs/range :idmp-mprd/AuthorizingParty,
   :rdfs/subPropertyOf :cmns-pts/isAffectedBy,
   :skos/definition
   "is endorsed, enabled, empowered, or otherwise permitted by"})

(def isAuthorizedThrough
  "indicates the situation that faciliates endorsement of the authorized party for some purpose"
  {:db/ident :idmp-mprd/isAuthorizedThrough,
   :owl/inverseOf :idmp-mprd/hasAuthorizedParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-mprd/AuthorizedParty,
   :rdfs/label "is authorized through",
   :rdfs/range :idmp-mprd/Authorization,
   :rdfs/subPropertyOf :cmns-pts/undergoes,
   :skos/definition
   "indicates the situation that faciliates endorsement of the authorized party for some purpose"})

(def isContainedIn
  "is held within"
  {:db/ident           :idmp-mprd/isContainedIn,
   :owl/inverseOf      :idmp-mprd/contains,
   :rdf/type           [:owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/label         "is contained in",
   :rdfs/range         :idmp-mprd/Container,
   :rdfs/subPropertyOf :cmns-col/isPartOf,
   :skos/definition    "is held within"})

(def isEvaluatedBy
  "is ascertained or determined by"
  {:db/ident        :idmp-mprd/isEvaluatedBy,
   :owl/inverseOf   :idmp-mprd/evaluates,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "is evaluated by",
   :skos/definition "is ascertained or determined by"})

(def isImmediatelyContainedIn
  "is held within its volume or area and is in direct contact with"
  {:db/ident :idmp-mprd/isImmediatelyContainedIn,
   :owl/inverseOf :idmp-mprd/immediatelyContains,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is immediately contained in",
   :rdfs/range :idmp-mprd/Container,
   :rdfs/subPropertyOf [:cmns-col/isDirectPartOf :idmp-mprd/isContainedIn],
   :skos/definition
   "is held within its volume or area and is in direct contact with"})

(def isInputTo
  "is put in, taken in, or operated on by"
  {:db/ident           :idmp-mprd/isInputTo,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "is input to",
   :rdfs/subPropertyOf :cmns-ra/isRelatedTo,
   :skos/definition    "is put in, taken in, or operated on by"})

(def isOutputOf
  "is produced by or results from some process, process step, action, activity, or other effort"
  {:db/ident :idmp-mprd/isOutputOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is output of",
   :rdfs/subPropertyOf :cmns-ra/isRelatedTo,
   :skos/definition
   "is produced by or results from some process, process step, action, activity, or other effort"})

(def managesAdministrationOf
  "indicates an investigational medicinal product that is administered in the context of a clinical trial"
  {:db/ident :idmp-mprd/managesAdministrationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-mprd/ClinicalTrial,
   :rdfs/label "manages administration of",
   :rdfs/range :idmp-mprd/InvestigationalMedicinalProduct,
   :rdfs/subPropertyOf :cmns-pts/hasObjectRole,
   :skos/definition
   "indicates an investigational medicinal product that is administered in the context of a clinical trial"})

(def sponsors
  "indicates the clinical trial that an individual, company, institution or organization (party), initiates, manages and/or finances"
  {:cmns-av/adaptedFrom
   "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated medicinal product information, clause 3.1.78",
   :db/ident :idmp-mprd/sponsors,
   :owl/inverseOf :idmp-mprd/hasSponsor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-mprd/Sponsor,
   :rdfs/label "sponsors",
   :rdfs/range :idmp-mprd/ClinicalTrial,
   :rdfs/subPropertyOf :cmns-pts/actsIn,
   :skos/definition
   "indicates the clinical trial that an individual, company, institution or organization (party), initiates, manages and/or finances"})