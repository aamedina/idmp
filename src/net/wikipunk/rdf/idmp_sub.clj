(ns net.wikipunk.rdf.idmp-sub
  "The regulated information on substances ontology provides a semantic model representing the definitions for exchanging basic concepts for the unique identification and exchange of regulated information on substances. It is derived from the ISO 11238:2018 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of regulated information on substances standard."
  {:cmns-av/copyright ["Copyright (c) 2022 Pistoia Alliance, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/ISO11238-Substances.rdf",
   :dcterms/abstract
   "The regulated information on substances ontology provides a semantic model representing the definitions for exchanging basic concepts for the unique identification and exchange of regulated information on substances. It is derived from the ISO 11238:2018 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of regulated information on substances standard.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :idmp-chg/hasMaturityLevel :idmp-chg/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/CodesAndCodeSets/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ISOConformanceAnnotations/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://www.omg.org/spec/Commons/ProductsAndServices/"
    "https://www.omg.org/spec/Commons/TextDatatype/"
    "https://www.omg.org/spec/Commons/Designators/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/RegistrationAuthorities/"
    "https://www.omg.org/spec/Commons/Documents/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11240-UnitsOfMeasurement/"
    "https://www.omg.org/spec/Commons/PartiesAndSituations/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://www.omg.org/spec/Commons/RegulatoryAgencies/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/20221201/ISO11238-Substances/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
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
    "idmp-sub"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/",
    "idmp-uom"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11240-UnitsOfMeasurement/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/",
   :rdfa/prefix "idmp-sub",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/",
   :rdfs/label "ISO 11238 Regulated Information on Substances Ontology",
   :skos/changeNote
   ["The https://spec.pistoiaalliance.org/idmp/ontology/ISO/20221101/ISO11238-Substances.rdf version of this ontology was modified to relax the restriction on the property isStoichiometric with respect to chemical substances to optional from required (IDMP-380), and then reversed per the SME team and to conform with the IDMP standard."
    "The https://spec.pistoiaalliance.org/idmp/ontology/ISO/20221001/ISO11238-Substances.rdf version of this ontology was modified to rename 'ingredient role' to ingredient for clarification per discussion at the Pistoia Alliance Conference Workshop on 3 November 2022 (IDMP-298). It was also modified to add the concept of matter and to add a specific hasSubstanceName property rather than the more general hasName property in order to accommodate additional semantics. The relationship between a moiety or substance and some of its characteristics was also revised, including the relationship between a structure and its corresponding representation."]})

(def Acid
  "substance that yields hydrogen ions or protons in aqueous solutions; a substance capable of accepting a pair of electrons for the formation of a coordinate covalent bond; a substance whose hydrogen can be replaced by metals or basic radicals, or which react with bases to form salts and water."
  {:db/ident :idmp-sub/Acid,
   :rdf/type :owl/Class,
   :rdfs/label "acid",
   :rdfs/seeAlso ["http://purl.obolibrary.org/obo/CHEBI_37527"
                  "http://ncicb.nci.nih.gov/xml/owl/EVS/Thesaurus.owl#C48057"],
   :rdfs/subClassOf :idmp-sub/Substance,
   :skos/definition
   "substance that yields hydrogen ions or protons in aqueous solutions; a substance capable of accepting a pair of electrons for the formation of a coordinate covalent bond; a substance whose hydrogen can be replaced by metals or basic radicals, or which react with bases to form salts and water.",
   :skos/example "An example of an acid is hydrochloric acid.",
   :skos/note
   ["An acid is also defined in CHEBI as a molecular entity capable of donating a hydron (Bronsted acid) or capable of forming a covalent bond with an electron pair (Lewis acid)."
    "An acid is also defined as a chemical that gives off hydrogen ions in water and forms salts by combining with certain metals. Acids have a sour taste and turn certain dyes red. Some acids made by the body, such as gastric acid, can help the body work the way it should."]})

(def ActiveIngredient
  "role of a substance present in a currently or previously marketed drug product indicating that it is or becomes pharmacologically active once delivered to patients"
  {:cmns-av/adaptedFrom
   "Inxight Drugs, Natonal Center for Advancing Translational Sciences, National Institutes of Health, derived from Definitions, available at https://drugs.ncats.io/about",
   :cmns-av/synonym "active pharmacological ingredient",
   :db/ident :idmp-sub/ActiveIngredient,
   :rdf/type :owl/Class,
   :rdfs/label "active ingredient",
   :rdfs/subClassOf :idmp-sub/Ingredient,
   :skos/definition
   "role of a substance present in a currently or previously marketed drug product indicating that it is or becomes pharmacologically active once delivered to patients"})

(def ActiveIngredientRole
  {:db/ident       :idmp-sub/ActiveIngredientRole,
   :owl/deprecated true,
   :owl/equivalentClass :idmp-sub/ActiveIngredient,
   :rdf/type       :owl/Class})

(def ActiveMoietyRole
  "role of the part of a molecule responsible for the physiological or pharmacological action of the substance"
  {:cmns-av/adaptedFrom
   "Inxight Drugs, Natonal Center for Advancing Translational Sciences, National Institutes of Health, derived from Definitions, available at https://drugs.ncats.io/about",
   :db/ident :idmp-sub/ActiveMoietyRole,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.6.3"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.1"],
   :rdf/type :owl/Class,
   :rdfs/label "active moiety role",
   :rdfs/subClassOf :idmp-sub/MoietyRole,
   :skos/definition
   "role of the part of a molecule responsible for the physiological or pharmacological action of the substance",
   :skos/note
   "Chemically, the active moiety of a stoichiometric or non-stoichoimetrical substance molecule is considered that part of the molecule that is the base, free acid or ion molecular part of a salt, solvate, chelate, clathrate, molecular complex or ester."})

(def Adjuvant
  "pharmacological role of a component that potentiates the immune response to an antigen and/or modulates it towards the desired immune response"
  {:cmns-av/explanatoryNote
   "An adjuvant is defined as a component of a mixture in the ISO 11238 standard rather than as a role that such a component plays, thus this definition is non-conformant.",
   :db/ident :idmp-sub/Adjuvant,
   :dcterms/source
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.1",
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-NamingConformant,
   :rdf/type :owl/Class,
   :rdfs/label "adjuvant",
   :rdfs/seeAlso "http://ncicb.nci.nih.gov/xml/owl/EVS/Thesaurus.owl#C2140",
   :rdfs/subClassOf :idmp-sub/Ingredient,
   :skos/definition
   "pharmacological role of a component that potentiates the immune response to an antigen and/or modulates it towards the desired immune response",
   :skos/note
   "An adjuvant is an agent that enhances the activity or therapeutic effect of another pharmacologic substance without having much, if any, therapeutic impact by itself."})

(def AdjuvantRole
  {:db/ident       :idmp-sub/AdjuvantRole,
   :owl/deprecated true,
   :owl/equivalentClass :idmp-sub/Adjuvant,
   :rdf/type       :owl/Class})

(def Base
  "substance having an available pair of electrons capable of forming a covalent bond with a hydron or with the vacant orbital of some other molecular entity"
  {:db/ident :idmp-sub/Base,
   :rdf/type :owl/Class,
   :rdfs/label "base",
   :rdfs/seeAlso ["http://semanticscience.org/resource/SIO_010454"
                  "http://purl.obolibrary.org/obo/CHEBI_22695"],
   :rdfs/subClassOf :idmp-sub/Substance,
   :skos/definition
   "substance having an available pair of electrons capable of forming a covalent bond with a hydron or with the vacant orbital of some other molecular entity",
   :skos/note
   "A base is a molecular entity dissolved in a solvent that is capable of accepting a proton (Bronsted base) or forming a covalent bond with a hydron (Lewis base) (SIO)."})

(def ChemicalSubstance
  "single substance that can be described as a stoichiometric or non-stoichiometric single molecular entity and is not a protein, nucleic acid or polymer substance"
  {:cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.11",
   :db/ident :idmp-sub/ChemicalSubstance,
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-NameAndAnnotationConformant,
   :owl/disjointWith [:idmp-sub/PolymerSubstance
                      :idmp-sub/StructurallyDiverseSubstance
                      :idmp-sub/ProteinSubstance
                      :idmp-sub/NucleicAcidSubstance],
   :rdf/type :owl/Class,
   :rdfs/label "chemical substance",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :idmp-sub/isStoichiometric,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :idmp-sub/hasMolecularFormula,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :idmp-sub/Stereochemistry,
                      :owl/onProperty :idmp-sub/hasStereochemistry,
                      :rdf/type       :owl/Restriction}
                     :idmp-sub/SingleSubstance
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-sub/Moiety,
                      :owl/onProperty :cmns-col/hasConstituent,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :idmp-sub/hasMolecularFormulaByMoiety,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/integer,
                      :owl/onProperty  :idmp-sub/hasNumberOfMoieties,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :idmp-sub/OpticalActivity,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "single substance that can be described as a stoichiometric or non-stoichiometric single molecular entity and is not a protein, nucleic acid or polymer substance",
   :skos/note
   "Chemical substances are generally considered 'small' molecules which have associated salts, solvates or ions and may be described using a single definitive or representative structure."})

(def ConformanceLevel
  "classifier that describes whether an element is required for a given substance type or a specified substance group"
  {:db/ident :idmp-sub/ConformanceLevel,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 5",
   :owl/equivalentClass {:owl/oneOf [:idmp-sub/ConformanceLevel-Mandatory
                                     :idmp-sub/ConformanceLevel-Conditional
                                     :idmp-sub/ConformanceLevel-Optional],
                         :rdf/type  :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/label "conformance level",
   :rdfs/subClassOf [:cmns-cds/CodeElement :cmns-cls/Classifier],
   :skos/definition
   "classifier that describes whether an element is required for a given substance type or a specified substance group",
   :skos/scopeNote
   "Conformance is not meant to be applied globally to all types of messages. Conformance will be expressed based on the following terminology: Mandatory, Conditional and Optional. Whether a data element is conditional by data, by process or by regional rule is out of scope of this ontology and will be defined within regional implementation guides."})

(def ConformanceLevel-Conditional
  "conformance level that applies to data elements 'within a category' as applicable, that are subject to business rules and may become required by: data rules; process rules; regional rules"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue "CONDITIONAL",
   :db/ident :idmp-sub/ConformanceLevel-Conditional,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 5"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 5.9"],
   :rdf/type [:idmp-sub/ConformanceLevel :owl/NamedIndividual],
   :rdfs/label "conformance level - conditional",
   :skos/definition
   "conformance level that applies to data elements 'within a category' as applicable, that are subject to business rules and may become required by: data rules; process rules; regional rules",
   :skos/note
   "Conditional applies when there are alternative data sources for a given data element(s) to identify a Substance/Specified Substance. Regional implementation of the ISO 11238 and ISO/TS 19844 may elevate the conditional conformance categories to 'mandatory' per regional requirements."})

(def ConformanceLevel-Mandatory
  "conformance level that applies to data elements that are required and shall therefore be implemented"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue "MANDATORY",
   :db/ident :idmp-sub/ConformanceLevel-Mandatory,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 5"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 5.9"],
   :rdf/type [:idmp-sub/ConformanceLevel :owl/NamedIndividual],
   :rdfs/label "conformance level - mandatory",
   :skos/definition
   "conformance level that applies to data elements that are required and shall therefore be implemented",
   :skos/note
   "Mandatory elements are defining elements necessary for the unique identification of Substances and Specified Substances per the ISO IDMP standards/technical specifications."})

(def ConformanceLevel-Optional
  "conformance level that applies to data elements that are informative but not definitional"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue "OPTIONAL",
   :db/ident :idmp-sub/ConformanceLevel-Optional,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 5"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 5.9"],
   :rdf/type [:idmp-sub/ConformanceLevel :owl/NamedIndividual],
   :rdfs/label "conformance level - optional",
   :skos/definition
   "conformance level that applies to data elements that are informative but not definitional",
   :skos/note
   "When listed at the category level (e.g. Specified Substance), optional corresponds to ISO categories or data elements that are not absolutely necessary for the unique identification of Substances/Specified Substances as per ISO 11238. Regional implementation of ISO 11238 and ISO/TS 19844 may elevate the optional conformance categories to 'mandatory' or 'conditional' per regional requirements."})

(def Ester
  "substance formally derived from an oxoacid RkE(=O)l(OH)m (l > 0) and an alcohol, phenol, heteroarenol, or enol by linking with formal loss of water from an acidic hydroxy group of the former and a hydroxy group of the latter"
  {:db/ident :idmp-sub/Ester,
   :dcterms/source
   ["Medical Subject Headings, see http://purl.bioontology.org/ontology/MESH/D004952"
    "Chemical Entities of Biological Interest Ontology, see http://purl.obolibrary.org/obo/CHEBI_35701"],
   :rdf/type :owl/Class,
   :rdfs/label "ester",
   :rdfs/subClassOf :idmp-sub/Substance,
   :skos/definition
   "substance formally derived from an oxoacid RkE(=O)l(OH)m (l > 0) and an alcohol, phenol, heteroarenol, or enol by linking with formal loss of water from an acidic hydroxy group of the former and a hydroxy group of the latter",
   :skos/note
   "Esters are compounds derived from organic or inorganic acids in which at least one hydroxyl group is replaced by an -O-alkyl or another organic group. They can be represented by the structure formula RCOOR' and are usually formed by the reaction between an acid and an alcohol with elimination of water."})

(def Excipient
  "pharmacological role of a generally pharmacologically inactive substance that is formulated with the active ingredient of a medication"
  {:cmns-av/explanatoryNote
   "An excipient is not explicitly defined in the ISO 11238 standard (although clause 8.5 states that an excipient is a non-active ingredient intended to be used in the medicinal product), which this definition conforms with although it is modeled as a role in this ontology.",
   :cmns-av/synonym ["filler" "bulking agent"],
   :db/ident :idmp-sub/Excipient,
   :dcterms/source
   "Chemical Entities of Biological Interest Ontology, see http://purl.obolibrary.org/obo/CHEBI_75324",
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-DefinitionallyConformant,
   :rdf/type :owl/Class,
   :rdfs/label "excipient",
   :rdfs/subClassOf :idmp-sub/InactiveIngredient,
   :skos/definition
   "pharmacological role of a generally pharmacologically inactive substance that is formulated with the active ingredient of a medication"})

(def ExcipientRole
  {:db/ident       :idmp-sub/ExcipientRole,
   :owl/deprecated true,
   :owl/equivalentClass :idmp-sub/Excipient,
   :rdf/type       :owl/Class})

(def Hydrate
  "addition compound that contains water in weak chemical combination with another compound"
  {:db/ident :idmp-sub/Hydrate,
   :dcterms/source
   "Chemical Entities of Biological Interest Ontology, see http://purl.obolibrary.org/obo/CHEBI_35505",
   :rdf/type :owl/Class,
   :rdfs/label "hydrate",
   :rdfs/subClassOf :idmp-sub/Substance,
   :skos/definition
   "addition compound that contains water in weak chemical combination with another compound"})

(def ISO11238-ClassificationScheme
  "system for classifying substances and substance-related information specified in the ISO 11238 specification"
  {:db/ident :idmp-sub/ISO11238-ClassificationScheme,
   :rdf/type [:cmns-cls/ClassificationScheme :owl/NamedIndividual],
   :rdfs/label "ISO 11238 classification scheme",
   :rdfs/seeAlso "https://www.iso.org/standard/71965.html",
   :skos/definition
   "system for classifying substances and substance-related information specified in the ISO 11238 specification"})

(def ISO19844-CodeSet
  "set of controlled vocabularies and codes for reporting of substance-related information specified in the ISO/TS 19844 guidelines"
  {:db/ident :idmp-sub/ISO19844-CodeSet,
   :rdf/type [:cmns-cds/CodeSet :owl/NamedIndividual],
   :rdfs/label "ISO 19844 code set",
   :rdfs/seeAlso "https://www.iso.org/standard/71965.html",
   :skos/definition
   "set of controlled vocabularies and codes for reporting of substance-related information specified in the ISO/TS 19844 guidelines"})

(def InactiveIngredient
  "role of an ingredient of a given formulation (most frequently, an excipient) that does not exhibit pharmacological activity"
  {:cmns-av/adaptedFrom
   "Inxight Drugs, Natonal Center for Advancing Translational Sciences, National Institutes of Health, derived from Definitions, available at https://drugs.ncats.io/about",
   :cmns-av/explanatoryNote
   "Substances are classified based on their effect on disease progression for a specific disease or condition. In this case, a condition is only related to such compound via the formulation used to affect (treat or diagnose) this condition.",
   :db/ident :idmp-sub/InactiveIngredient,
   :rdf/type :owl/Class,
   :rdfs/label "inactive ingredient",
   :rdfs/subClassOf :idmp-sub/Ingredient,
   :skos/definition
   "role of an ingredient of a given formulation (most frequently, an excipient) that does not exhibit pharmacological activity"})

(def InactiveIngredientRole
  {:db/ident       :idmp-sub/InactiveIngredientRole,
   :owl/deprecated true,
   :owl/equivalentClass :idmp-sub/InactiveIngredient,
   :rdf/type       :owl/Class})

(def InactiveMoietyRole
  "role of an inactive portion of a molecule or substance, i.e., one that that does not exhibit pharmacological activity"
  {:cmns-av/adaptedFrom
   "Inxight Drugs, Natonal Center for Advancing Translational Sciences, National Institutes of Health, derived from Definitions, available at https://drugs.ncats.io/about",
   :db/ident :idmp-sub/InactiveMoietyRole,
   :owl/disjointWith :idmp-sub/ActiveMoietyRole,
   :rdf/type :owl/Class,
   :rdfs/label "inactive moiety role",
   :rdfs/subClassOf :idmp-sub/MoietyRole,
   :skos/definition
   "role of an inactive portion of a molecule or substance, i.e., one that that does not exhibit pharmacological activity",
   :skos/example
   "Examples include the appended portions of the molecule that cause the drug to be an ester, salt (including a salt with hydrogen or coordination bonds), or other noncovalent derivative (such as a complex, chelate, or clathrate) of the molecule."})

(def Ingredient
  "substance role that is specifically part of or used in the preparation of some manufactured item, pharmaceutical product, medication, or drug"
  {:cmns-av/synonym "pharmacological role",
   :cmns-av/usageNote
   "An ingredient is defined as a material in the ISO 11238 standard rather than as a role, which would make the model inconsistent. Thus this concept is consistent in terms of its name but not in terms of its definition.",
   :db/ident :idmp-sub/Ingredient,
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-NamingConformant,
   :rdf/type :owl/Class,
   :rdfs/label "ingredient",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    {:owl/minQualifiedCardinality 0,
                                       :owl/onClass :idmp-sub/ManufacturedItem,
                                       :owl/onProperty :cmns-col/isIncludedIn,
                                       :rdf/type :owl/Restriction},
                      :owl/onProperty :cmns-pts/isPlayedBy,
                      :rdf/type       :owl/Restriction}
                     :idmp-sub/SubstanceRole],
   :skos/definition
   "substance role that is specifically part of or used in the preparation of some manufactured item, pharmaceutical product, medication, or drug"})

(def IngredientRole
  {:db/ident       :idmp-sub/IngredientRole,
   :owl/deprecated true,
   :owl/equivalentClass :idmp-sub/Ingredient,
   :rdf/type       :owl/Class})

(def ManufacturedItem
  "good that embodies the qualitative and quantitative composition of a product as contained in the packaging of the medicinal product"
  {:db/ident :idmp-sub/ManufacturedItem,
   :dcterms/source
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.38",
   :rdf/type :owl/Class,
   :rdfs/label "manufactured item",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-prd/isProducedBy,
                      :owl/someValuesFrom :idmp-sub/Manufacturer,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-sub/Material,
                      :owl/onProperty :cmns-col/comprises,
                      :rdf/type       :owl/Restriction}
                     :cmns-prd/Good],
   :skos/definition
   "good that embodies the qualitative and quantitative composition of a product as contained in the packaging of the medicinal product",
   :skos/note
   "A medicinal product may contain one or more manufactured items. In many instances the manufactured item is equal to the pharmaceutical product. However, there are instances where the manufactured item(s) undergo a transformation before being administered to the patient (as the pharmaceutical product) and the two are not equal."})

(def Manufacturer
  "producer that holds the authorization for the manufacturing process"
  {:cmns-av/synonym "establishment",
   :db/ident :idmp-sub/Manufacturer,
   :dcterms/source
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.39",
   :rdf/type :owl/Class,
   :rdfs/label "manufacturer",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-prd/produces,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:idmp-sub/Substance
                                            :idmp-sub/ManufacturedItem],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :cmns-prd/Producer],
   :skos/definition
   "producer that holds the authorization for the manufacturing process",
   :skos/note
   "In the context of ISO 11238, the definition refers to a company responsible for the manufacturing of the substance."})

(def MarketContext
  "context that reflects a group of people with some shared characteristics that an organization has identified as potential customers for for a substance or product"
  {:cmns-av/explanatoryNote
   "Market context is applicable with respect to patent exclusivity, for example.",
   :db/ident :idmp-sub/MarketContext,
   :rdf/type :owl/Class,
   :rdfs/label "market context",
   :rdfs/subClassOf :cmns-cxtdsg/Context,
   :skos/definition
   "context that reflects a group of people with some shared characteristics that an organization has identified as potential customers for for a substance or product"})

(def Material
  "entity that has mass, occupies space and consists of one or more substances"
  {:db/ident :idmp-sub/Material,
   :dcterms/source
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.41",
   :rdf/type :owl/Class,
   :rdfs/label "material",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-sub/Substance,
                      :owl/onProperty :cmns-col/comprises,
                      :rdf/type       :owl/Restriction}
                     :idmp-sub/Matter],
   :skos/definition
   "entity that has mass, occupies space and consists of one or more substances"})

(def Matter
  "something that has mass and occupies space by virtue of having volume"
  {:cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.41",
   :cmns-av/explanatoryNote
   "Note that the concept of 'matter' is used in the definition of substance but not explicitly defined in the IDMP standards. The definition of 'material' is close, but adds the notion of consisting of one or more substances, thus this term generalizes both material and substance.",
   :db/ident :idmp-sub/Matter,
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type :owl/Class,
   :rdfs/label "matter",
   :skos/definition
   "something that has mass and occupies space by virtue of having volume"})

(def Mixture
  "polydisperse substance that is a combination of single substances isolated together or produced in the same synthetic process"
  {:cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.44",
   :cmns-av/synonym "mixture of single molecular entities",
   :db/ident :idmp-sub/Mixture,
   :owl/disjointWith :idmp-sub/SingleSubstance,
   :rdf/type :owl/Class,
   :rdfs/label "mixture",
   :rdfs/subClassOf [:idmp-sub/Substance
                     {:owl/minQualifiedCardinality 2,
                      :owl/onClass    :idmp-sub/SingleSubstance,
                      :owl/onProperty :cmns-col/comprises,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "polydisperse substance that is a combination of single substances isolated together or produced in the same synthetic process",
   :skos/example
   ["Glyceryl monoesters could be defined as a mixture of two single substances which differ in the position of esterification."
    "Gentamicin is defined as a mixture substance of Gentamicin C1, Gentamicin C1A, Gentamicin C2, Gentamicin C2A and Gentamicin C2B. Glyceryl monoesters are defined as mixture substances of two single substances which differ in the position of esterification. Simethicone, which consists of dimethicone and silicon dioxide, is not defined as a mixture substance since these are diverse materials brought together to form a multi-substance material."],
   :skos/note
   ["Single substances of diverse origin that are brought together and do not undergo a chemical transformation as a result of that combination are defined as multi-substance materials (Specified Substance Group 1) and not as mixture."
    "Mixture could be used for a homologous group of structurally diverse single substances used as starting materials in order to prepare an allergen extract. The extract is further described by using the class 'Source Material', element group 'Fraction Description' (allergen preparation) obtained from the structurally diverse single substances (starting materials) as parent substances. This substance (allergen extract) is the result of the same (synthetic) process and hence the extract is considered as a mixture substance."]})

(def Moiety
  "entity within a substance that has a complete and continuous molecular structure"
  {:cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.45",
   :db/ident :idmp-sub/Moiety,
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-NameAndAnnotationConformant,
   :rdf/type :owl/Class,
   :rdfs/label "moiety",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :idmp-sub/MolecularStructure,
                      :owl/onProperty :idmp-sub/hasStructure,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :idmp-sub/Stereochemistry,
                      :owl/onProperty :idmp-sub/hasStereochemistry,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :idmp-sub/hasMolecularFormulaByMoiety,
                      :rdf/type        :owl/Restriction}
                     :cmns-col/Constituent
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-sub/MolecularWeight,
                      :owl/onProperty :idmp-sub/hasMolecularWeight,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :idmp-sub/isMoietyOf,
                      :owl/someValuesFrom :idmp-sub/Substance,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :idmp-sub/OpticalActivity,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :idmp-sub/hasMolecularFormula,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   "entity within a substance that has a complete and continuous molecular structure",
   :skos/example
   "The strength of a medicinal product is often based on what is referred to as the active moiety of the molecule, responsible for the physiological or pharmacological action of the drug substance. To avoid ambiguity, the free acid and/or free base should be used as the moiety upon which strength is based.",
   :skos/note
   ["The moiety subclause serves for the description of both the moiety and the other fragment constituting the substance. The Element Group Moiety is attached to the element class Chemical in order to describe a salt, solvate and co-crystal relationship to the active moiety in an unambiguous way with respect to the description of the molecular formula and sometimes the official names. The Element Group Amount is attached to Moiety. This will help to describe salts, solvates, hydrated substances and co-crystallising agents in a more unambiguous way with respect to the description of the molecular formula and sometimes official names. Each moiety within the chemical substance is to be identified and the composition range of the moieties when known is to be provided by means of the following data elements: If the numeric value of the element 'Number of Moieties' is equal to 1, the class Moiety should not be used; otherwise the class shall always be mandatory."
    "The active moiety of a stoichiometric or non-stoichiometrical substance molecule is considered that part of the molecule that is the base, free acid or ion molecular part of a salt, solvate, chelate, clathrate, molecular complex or ester."]})

(def MoietyIdentifier
  "unique identifier for an entity within a substance that has a complete and continuous molecular structure"
  {:db/ident :idmp-sub/MoietyIdentifier,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.1.6"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.3, Figure 19"],
   :rdf/type :owl/Class,
   :rdfs/label "moiety identifier",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-id/identifies,
                      :owl/someValuesFrom :idmp-sub/Moiety,
                      :rdf/type           :owl/Restriction}
                     :cmns-id/Identifier],
   :skos/definition
   "unique identifier for an entity within a substance that has a complete and continuous molecular structure"})

(def MoietyName
  "name or company code associated with the substance"
  {:db/ident :idmp-sub/MoietyName,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.1.6"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.3, Figure 19"],
   :rdf/type :owl/Class,
   :rdfs/label "moiety name",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-dsg/isNameOf,
                      :owl/someValuesFrom :idmp-sub/Moiety,
                      :rdf/type           :owl/Restriction}
                     :cmns-cxtdsg/ContextualName],
   :skos/definition "name or company code associated with the substance"})

(def MoietyRole
  "functional role played by a moiety in some substance or product"
  {:db/ident :idmp-sub/MoietyRole,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.1.6"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.3, Figure 19"],
   :rdf/type :owl/Class,
   :rdfs/label "moiety role",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-sub/Moiety,
                      :owl/onProperty :cmns-pts/isPlayedBy,
                      :rdf/type       :owl/Restriction}
                     :cmns-pts/FunctionalRole
                     {:owl/onProperty     :cmns-cxtdsg/isApplicableIn,
                      :owl/someValuesFrom :idmp-sub/RegulatoryContext,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "functional role played by a moiety in some substance or product",
   :skos/example
   "counter-ion, solvate, hydrate, parent, base, acid, co-crystallising agent",
   :skos/note
   "The role of the moiety should be specified if there is a specific role the moiety is playing. In addition to the moiety role for chemicals, for many peptides, the moiety role of counter-ions such as acetate should be indicated."})

(def MolecularGraph
  "single chemical structure that is an unambiguous representation of the arrangement of atoms, normalized to conform with the International Union of Pure and Applied Chemistry (IUPAC) specification for drawing chemical structures to the degree possible"
  {:db/ident :idmp-sub/MolecularGraph,
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type :owl/Class,
   :rdfs/label "molecular graph",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :idmp-sub/hasRendering,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :idmp-sub/StructuralRepresentation],
   :skos/definition
   "single chemical structure that is an unambiguous representation of the arrangement of atoms, normalized to conform with the International Union of Pure and Applied Chemistry (IUPAC) specification for drawing chemical structures to the degree possible"})

(def MolecularGraphIdentifier
  "unique identifier for a molecular graph representing a single chemical structure"
  {:db/ident :idmp-sub/MolecularGraphIdentifier,
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type :owl/Class,
   :rdfs/label "molecular graph identifier",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-id/identifies,
                      :owl/someValuesFrom :idmp-sub/MolecularGraph,
                      :rdf/type           :owl/Restriction}
                     :cmns-id/Identifier],
   :skos/definition
   "unique identifier for a molecular graph representing a single chemical structure"})

(def MolecularStructure
  "unambiguous representation of the arrangement of atoms"
  {:cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clauses 3.49, 7.2.1",
   :cmns-av/usageNote
   "While certain diagrams, such as Figure 14 in the ISO 11238:2018 show attributes such as stereochemistry, optical activity, and molecular formulas as characteristics of structure, from an ontological perspective these characteristics are actually characteristics of a moiety or chemical substance and are modeled as such herein.",
   :db/ident :idmp-sub/MolecularStructure,
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-NameAndAnnotationConformant,
   :rdf/type :owl/Class,
   :rdfs/label "molecular structure",
   :rdfs/subClassOf
   [{:owl/maxQualifiedCardinality 1,
     :owl/onClass    :idmp-sub/StructuralRepresentation,
     :owl/onProperty :cmns-dsg/isDescribedBy,
     :rdf/type       :owl/Restriction}
    {:owl/maxQualifiedCardinality 1,
     :owl/onDataRange :xsd/string,
     :owl/onProperty
     :idmp-sub/hasSimplifiedMolecularInputLineEntrySpecification,
     :rdf/type :owl/Restriction}
    :idmp-sub/Structure],
   :skos/definition "unambiguous representation of the arrangement of atoms",
   :skos/note
   ["For the purposes of defining substances, the three-dimensional conformations are not captured. Individual conformations or conformers of substances would only be captured in either a general sense for proteins (i.e. denatured) or when a given rotation about a single bond is restricted in such a way that the two different conformers are isolatable from each other and do not interconvert at room temperature (e.g. substituted biphenyls)."
    "This representation should be generally translatable into a graphical representation."
    "Structural representations shall include the complete molecular structure with all known stereochemistry indicated. Molecular fragments and moieties shall also contain structural representations. The structure is a defining element for chemicals, polymers and structural modifications. It should be defined in a consistent and unambiguous manner. The Structural Representation can cover complex substances like proteins and nucleic acid by graphical representation."
    "The structure shall contain a sufficient amount of graphical and textual information to define the underlying atoms and the connectivity between atoms as well as the composition ratio of moieties."]})

(def MolecularStructureIdentifier
  "unique identifier for the unambiguous representation of the arrangement of atoms for a given substance"
  {:db/ident :idmp-sub/MolecularStructureIdentifier,
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type :owl/Class,
   :rdfs/label "molecular structure identifier",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-id/identifies,
                      :owl/someValuesFrom :idmp-sub/MolecularStructure,
                      :rdf/type           :owl/Restriction}
                     :cmns-id/Identifier],
   :skos/definition
   "unique identifier for the unambiguous representation of the arrangement of atoms for a given substance"})

(def MolecularWeight
  "mass of one molecule of a homogenous substance or the average mass of molecules that comprise a heterogeneous substance, which is derived from the molecular structure or the molecular formula"
  {:cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.50",
   :db/ident :idmp-sub/MolecularWeight,
   :rdf/type :owl/Class,
   :rdfs/label "molecular weight",
   :rdfs/subClassOf :cmns-qtu/QuantityValue,
   :skos/definition
   "mass of one molecule of a homogenous substance or the average mass of molecules that comprise a heterogeneous substance, which is derived from the molecular structure or the molecular formula",
   :skos/note
   ["For a substance not described in a Pharmacopoeia a mass spectrum may be provided to substantiate the calculated molecular weight."
    "For polymers, there are several different types of molecular weight (weight average, number average, etc.)."
    "It is calculated as the sum of the mass of each constituent atom multiplied by the number of atoms of that element in the molecular formula. The unified atomic mass unit is the unit of molecular weight and includes the type of molecular weight (g/mol)."
    "The unified atomic mass unit or Dalton is the unit of molecular weight. The type of molecular weight should always be captured."
    "For stoichiometric chemicals, the molecular weight is calculated from the molecular formula using standard masses for each of the elements. The molecular mass refers to the complete structure or a moiety or a fragment."]})

(def NucleicAcidSubstance
  "single substance that can be defined by a linear sequence of nucleosides typically linked through phosphate or phosphate-like diester bonds"
  {:cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.54",
   :db/ident :idmp-sub/NucleicAcidSubstance,
   :owl/disjointWith [:idmp-sub/StructurallyDiverseSubstance
                      :idmp-sub/PolymerSubstance],
   :rdf/type :owl/Class,
   :rdfs/label "nucleic acid substance",
   :rdfs/subClassOf :idmp-sub/SingleSubstance,
   :skos/definition
   "single substance that can be defined by a linear sequence of nucleosides typically linked through phosphate or phosphate-like diester bonds",
   :skos/note
   "The type of nucleic acid substance, e.g. ribonucleic acid (RNA) and deoxyribonucleic acid (DNA), is also identified. Oligonucleotides and gene elements, e.g. promoters, enhancers, coding sequences and silencers, are defined as nucleic acid substances."})

(def OfficialName
  "name given by an official registration authority/organization"
  {:cmns-av/usageNote
   "Rather than creating an independent code for the representation of the registration authority, the property 'is registered by' must be used to link to the authority responsible for such registration in the context of this ontology. Note that this approach allows for linking to all relevant authorities, as required by the ISO standard.",
   :db/ident :idmp-sub/OfficialName,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.6.1"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.55"],
   :rdf/type :owl/Class,
   :rdfs/label "official name",
   :rdfs/subClassOf
   [{:owl/hasValue   :idmp-sub/SubstanceNameClassifier-OfficialName,
     :owl/onProperty :idmp-sub/hasSubstanceNameType,
     :rdf/type       :owl/Restriction}
    :idmp-sub/SubstanceName
    {:owl/onProperty     :cmns-ra/isRegisteredBy,
     :owl/someValuesFrom {:owl/unionOf [:cmns-ra/RegistrationAuthority
                                        :cmns-ra/Registrar],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :cmns-dt/CombinedDateTime,
     :owl/onProperty  :idmp-sub/hasChangeDate,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :cmns-cls/isClassifiedBy,
     :owl/someValuesFrom :idmp-sub/OfficialNameStatus,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "name given by an official registration authority/organization",
   :skos/note
   "Any authority which assigns official names shall typically do so in a publication, and as such, referencing the publication is sufficient indication for the name being 'official' and sufficient representation for the 'official name type'. When new official names are issued by official naming bodies, the naming bodies will be reflected in this terminology."})

(def OfficialNameStatus
  "classifier that indicates the status of an official name from a pre-defined ISO 19844 code set"
  {:db/ident :idmp-sub/OfficialNameStatus,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.6.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type :owl/Class,
   :rdfs/label "official name status",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-sub/SubstanceName,
                      :owl/onProperty :cmns-cls/classifies,
                      :rdf/type       :owl/Restriction}
                     :cmns-cls/Classifier],
   :skos/definition
   "classifier that indicates the status of an official name from a pre-defined ISO 19844 code set"})

(def OfficialNameStatus-Alternate
  "status of an official name that is considered a synonym for the primary official name"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Alternate",
   :db/ident :idmp-sub/OfficialNameStatus-Alternate,
   :dcterms/source
   ["ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"
    "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.6.2"],
   :rdf/type [:idmp-sub/OfficialNameStatus :owl/NamedIndividual],
   :rdfs/label "official name status - alternate",
   :skos/definition
   "status of an official name that is considered a synonym for the primary official name",
   :skos/note
   "The fact that a name is alternate is evident by having more than one name assigned to the same substance by the same authority for the same language, domain, etc."})

(def OfficialNameStatus-Current
  "status of an official name that is presently in use"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Current",
   :db/ident :idmp-sub/OfficialNameStatus-Current,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.6.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/OfficialNameStatus :owl/NamedIndividual],
   :rdfs/label "official name status - current",
   :skos/definition "status of an official name that is presently in use"})

(def OfficialNameStatus-Primary
  "status of an official name that is the main official name approved for use"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Proposed",
   :db/ident :idmp-sub/OfficialNameStatus-Primary,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.6.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/OfficialNameStatus :owl/NamedIndividual],
   :rdfs/label "official name status - primary",
   :skos/definition
   "status of an official name that is the main official name approved for use"})

(def OfficialNameStatus-Proposed
  "status of an official name that has been proposed for use but has not yet be formally adopted"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Proposed",
   :db/ident :idmp-sub/OfficialNameStatus-Proposed,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.6.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/OfficialNameStatus :owl/NamedIndividual],
   :rdfs/label "official name status - proposed",
   :skos/definition
   "status of an official name that has been proposed for use but has not yet be formally adopted"})

(def OfficialNameStatus-Superseded
  "status of an official name that was formerly in use and has been replaced"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Superseded",
   :db/ident :idmp-sub/OfficialNameStatus-Superseded,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.6.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/OfficialNameStatus :owl/NamedIndividual],
   :rdfs/label "official name status - superseded",
   :skos/definition
   "status of an official name that was formerly in use and has been replaced"})

(def OpticalActivity
  "ability of a chemical substance to rotate the plane of vibration of polarized light to the right or left"
  {:db/ident :idmp-sub/OpticalActivity,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.3, Figure 14"],
   :rdf/type :owl/Class,
   :rdfs/label "optical activity",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "ability of a chemical substance to rotate the plane of vibration of polarized light to the right or left",
   :skos/example "(+/-), (+), (-), None, N/A, Unknown",
   :skos/note
   "The extent of optical rotation is not mandatory at the substance level."})

(def OpticalActivity-EitherDirection
  "optical activity indicating the ability of a chemical substance to rotate the plane of vibration of polarized light either to the right or left"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue "(+/-)",
   :db/ident :idmp-sub/OpticalActivity-EitherDirection,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53",
   :rdf/type [:idmp-sub/OpticalActivity :owl/NamedIndividual],
   :rdfs/label "optical activity - either direction",
   :skos/definition
   "optical activity indicating the ability of a chemical substance to rotate the plane of vibration of polarized light either to the right or left"})

(def OpticalActivity-Left
  "optical activity indicating the ability of a chemical substance to rotate the plane of vibration of polarized light to the left"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue "(-)",
   :db/ident :idmp-sub/OpticalActivity-Left,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53",
   :rdf/type [:idmp-sub/OpticalActivity :owl/NamedIndividual],
   :rdfs/label "optical activity - left",
   :skos/definition
   "optical activity indicating the ability of a chemical substance to rotate the plane of vibration of polarized light to the left"})

(def OpticalActivity-None
  "optical activity indicating that a chemical substance has no ability to rotate the plane of vibration of polarized light"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue "None",
   :db/ident :idmp-sub/OpticalActivity-None,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53",
   :rdf/type [:idmp-sub/OpticalActivity :owl/NamedIndividual],
   :rdfs/label "optical activity - none",
   :skos/definition
   "optical activity indicating that a chemical substance has no ability to rotate the plane of vibration of polarized light"})

(def OpticalActivity-NotApplicable
  "optical activity indicating that optical activity does not apply to a chemical substance"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue "None",
   :db/ident :idmp-sub/OpticalActivity-NotApplicable,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53",
   :rdf/type [:idmp-sub/OpticalActivity :owl/NamedIndividual],
   :rdfs/label "optical activity - not applicable",
   :skos/definition
   "optical activity indicating that optical activity does not apply to a chemical substance"})

(def OpticalActivity-Right
  "optical activity indicating the ability of a chemical substance to rotate the plane of vibration of polarized light to the right"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue "(+)",
   :db/ident :idmp-sub/OpticalActivity-Right,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53",
   :rdf/type [:idmp-sub/OpticalActivity :owl/NamedIndividual],
   :rdfs/label "optical activity - right",
   :skos/definition
   "optical activity indicating the ability of a chemical substance to rotate the plane of vibration of polarized light to the right"})

(def PolymerSubstance
  "single polydisperse substance that contains structural repeat units linked by covalent bonds"
  {:cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.63",
   :db/ident :idmp-sub/PolymerSubstance,
   :owl/disjointWith :idmp-sub/StructurallyDiverseSubstance,
   :rdf/type :owl/Class,
   :rdfs/label "polymer substance",
   :rdfs/subClassOf :idmp-sub/SingleSubstance,
   :skos/definition
   "single polydisperse substance that contains structural repeat units linked by covalent bonds",
   :skos/note
   "Monodisperse proteins and nucleic acids with defined sequences shall not be defined using the polymer substance elements."})

(def ProteinSubstance
  "single substance with a defined sequence of alpha-amino acids connected through peptide bonds"
  {:cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.68",
   :db/ident :idmp-sub/ProteinSubstance,
   :owl/disjointWith [:idmp-sub/StructurallyDiverseSubstance
                      :idmp-sub/NucleicAcidSubstance
                      :idmp-sub/PolymerSubstance],
   :rdf/type :owl/Class,
   :rdfs/label "protein substance",
   :rdfs/subClassOf :idmp-sub/SingleSubstance,
   :skos/definition
   "single substance with a defined sequence of alpha-amino acids connected through peptide bonds",
   :skos/note
   ["A protein consists of one or more chains with a length of more than 40 amino acids. A peptide is defined as a linear sequence consisting of 2 to 40 amino acid residues."
    "Synthetic peptides and proteins with defined sequences, recombinant proteins and highly purified proteins extracted from biological matrices are described as protein substances. Sites of glycosylation, disulphide linkages and glycosylation type (e.g. fungal, plant, anthropoid, avian mammalian, human) are defining elements of protein substances, when known. A graphical molecular structure is also included in the definition of all peptides of 40 amino acid residues or less."
    "The absolute configuration at the a-carbon atom of the a-amino acids is designated by the prefixed small capital letter D or L to indicate a formal relationship to D- or L-serine and thus to D- or L-glyceraldehyde."]})

(def RegulatoryContext
  "context that reflects a regulatory reporting viewpoint"
  {:cmns-av/explanatoryNote
   "Certain definitions used in the IDMP standards appear to be specific to regulatory reporting, which differ with the perspective of a chemist (scientist) performing analysis. In such cases in this ontology we will attempt to capture both perspectives and identify distinctions to limit ambiguity.",
   :db/ident        :idmp-sub/RegulatoryContext,
   :rdf/type        :owl/Class,
   :rdfs/label      "regulatory context",
   :rdfs/subClassOf :cmns-cxtdsg/Context,
   :skos/definition "context that reflects a regulatory reporting viewpoint"})

(def Salt
  "ionic substance formed from the neutralization reaction of an acid and a base"
  {:cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.71",
   :db/ident :idmp-sub/Salt,
   :dcterms/source
   ["National Cancer Institute Thesaurus, see http://ncicb.nci.nih.gov/xml/owl/EVS/Thesaurus.owl#C822"
    "Chemical Entities of Biological Interest Ontology, see http://purl.obolibrary.org/obo/CHEBI_24866"],
   :rdf/type :owl/Class,
   :rdfs/label "salt",
   :rdfs/subClassOf :idmp-sub/Substance,
   :skos/definition
   "ionic substance formed from the neutralization reaction of an acid and a base",
   :skos/note
   "Salts are ionic compounds composed of cations (positive ions) and anions (negative ions)."})

(def ScientificContext
  "context that reflects the viewpoint of subject matter experts that are scientists, including but not limited to organic chemists"
  {:cmns-av/explanatoryNote
   "Certain definitions used in the IDMP standards appear to be specific to regulatory reporting, which differ with the perspective of a chemist (scientist) performing analysis. In such cases in this ontology we will attempt to capture both perspectives and identify distinctions to limit ambiguity.",
   :db/ident :idmp-sub/ScientificContext,
   :rdf/type :owl/Class,
   :rdfs/label "scientific context",
   :rdfs/subClassOf :cmns-cxtdsg/Context,
   :skos/definition
   "context that reflects the viewpoint of subject matter experts that are scientists, including but not limited to organic chemists"})

(def SingleSubstance
  "substance that can be described by a single representation or set of descriptive elements"
  {:cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.74",
   :cmns-av/synonym "single molecular entity",
   :db/ident :idmp-sub/SingleSubstance,
   :rdf/type :owl/Class,
   :rdfs/label "single substance",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :idmp-sub/MolecularStructure,
                      :owl/onProperty :idmp-sub/hasStructure,
                      :rdf/type       :owl/Restriction}
                     :idmp-sub/Substance],
   :skos/definition
   "substance that can be described by a single representation or set of descriptive elements",
   :skos/note
   ["Racemates and substances with unknown, epimeric or mixed chirality can be defined as single substances because a single structural representation may be generated and the stereochemistry indicated as descriptive text."
    "A single substance can be described using one or more of five types of elements: chemical, protein, nucleic acid, polymer or structurally diverse substances."]})

(def SpecifiedSubstance
  "substance defined by groups of elements that describe multi-substance materials or specify further information on substances relevant to the description of medicinal products"
  {:cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clauses 3.78, 6.2",
   :db/ident :idmp-sub/SpecifiedSubstance,
   :rdf/type :owl/Class,
   :rdfs/label "specified substance",
   :rdfs/subClassOf :idmp-sub/Substance,
   :skos/definition
   "substance defined by groups of elements that describe multi-substance materials or specify further information on substances relevant to the description of medicinal products",
   :skos/note
   ["This could include grade, units of measure, physical form, constituents, manufacturer, critical manufacturing processes (e.g. extraction, synthetic or recombinant processes), specification and the analytical methods used to determine whether a substance is in compliance with a specification. There are four different groups of elements that can be used to define a given specified substance and specific relationships between each group of elements."
    "A specified substance is generally a further specification of a substance that captures information on manufacture, specifications, physical form or multi-substance materials that are components of a medicinal product formulation."]})

(def Stereochemistry
  "relative spatial arrangement of atoms in 3-dimensional space within molecules"
  {:cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.80, clause 7.2.2 Figure 14",
   :cmns-av/synonym "molecular geometry",
   :db/ident :idmp-sub/Stereochemistry,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause B.6.5.1",
   :rdf/type :owl/Class,
   :rdfs/label "stereochemistry",
   :rdfs/subClassOf [:idmp-sub/Structure :cmns-cls/Classifier],
   :skos/definition
   "relative spatial arrangement of atoms in 3-dimensional space within molecules",
   :skos/example
   "absolute, axial r, axial s, square planar 1, square planar 2, square planar 3, square planar 4, tetrahedral, octahedral 12, octahedral 22, octahedral 21, chiral, geometric, achiral, racemic, mixed",
   :skos/note
   "Stereochemistry is concerned with the 3-dimensional arrangement of atoms in molecules, and stereoisomers are isomers with no difference in connectivity or bond multiplicity, but whose atomicspatial arrangements differ."})

(def Stereochemistry-Absolute
  "stereochemistry classifier indicating ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["absolute" "ABSOLUTE"],
   :db/ident :idmp-sub/Stereochemistry-Absolute,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - absolute",
   :skos/definition "stereochemistry classifier indicating ..."})

(def Stereochemistry-Achiral
  "stereochemistry classifier indicating ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["achiral" "ACHIRAL"],
   :db/ident :idmp-sub/Stereochemistry-Achiral,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - achiral",
   :skos/definition "stereochemistry classifier indicating ..."})

(def Stereochemistry-Axial
  "stereochemistry classifier indicating ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["axial" "AXIAL"],
   :db/ident :idmp-sub/Stereochemistry-Axial,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - axial",
   :skos/definition "stereochemistry classifier indicating ..."})

(def Stereochemistry-AxialR
  "stereochemistry classifier indicating a chirality axis based stereochemistry where, using the Cahn-Ingold-Prelog (CIP) priority rules, the priorities (from highest to lowest) of the substituent atoms exist in a clockwise direction"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["axial r" "AXIAL R"],
   :db/ident :idmp-sub/Stereochemistry-AxialR,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - axial r",
   :skos/definition
   "stereochemistry classifier indicating a chirality axis based stereochemistry where, using the Cahn-Ingold-Prelog (CIP) priority rules, the priorities (from highest to lowest) of the substituent atoms exist in a clockwise direction"})

(def Stereochemistry-AxialS
  "stereochemistry classifier indicating a chirality axis based stereochemistry where, using the Cahn-Ingold-Prelog (CIP) priority rules, the priorities (from highest to lowest) of the substituent atoms exist in an anti-clockwise direction"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["axial s" "AXIAL S"],
   :db/ident :idmp-sub/Stereochemistry-AxialS,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - axial s",
   :skos/definition
   "stereochemistry classifier indicating a chirality axis based stereochemistry where, using the Cahn-Ingold-Prelog (CIP) priority rules, the priorities (from highest to lowest) of the substituent atoms exist in an anti-clockwise direction"})

(def Stereochemistry-Chiral
  "stereochemistry classifier indicating an object or molecule that is not superimposable on its mirror image"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["chiral" "CHIRAL"],
   :db/ident :idmp-sub/Stereochemistry-Chiral,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - chiral",
   :skos/definition
   "stereochemistry classifier indicating an object or molecule that is not superimposable on its mirror image",
   :skos/note
   "The classic description of chirality is the comparison of the hand in a mirror, because the mirror image is the opposite. A chiral molecule has one or more chiral centres."})

(def Stereochemistry-Cis
  "stereochemistry classifier indicating ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["cis" "CIS"],
   :db/ident :idmp-sub/Stereochemistry-Cis,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - cis",
   :skos/definition "stereochemistry classifier indicating ..."})

(def Stereochemistry-Epimeric
  "stereochemistry classifier indicating a particular kind of diastereomers that differ in their stereochemistry at only one chiral centre; the stereochemistry at all other chiral centres is identical"
  {:cmns-av/synonym "epimeric centres",
   :cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["epimeric" "EPIMERIC"],
   :db/ident :idmp-sub/Stereochemistry-Epimeric,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - epimeric",
   :skos/definition
   "stereochemistry classifier indicating a particular kind of diastereomers that differ in their stereochemistry at only one chiral centre; the stereochemistry at all other chiral centres is identical"})

(def Stereochemistry-Meso
  "stereochemistry classifier indicating ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["meso" "MESO"],
   :db/ident :idmp-sub/Stereochemistry-Meso,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - meso",
   :skos/definition "stereochemistry classifier indicating ..."})

(def Stereochemistry-Mixed
  "stereochemistry classifier indicating ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["mixed" "MIXED"],
   :db/ident :idmp-sub/Stereochemistry-Mixed,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - mixed",
   :skos/definition "stereochemistry classifier indicating ..."})

(def Stereochemistry-Octahedral12
  "stereochemistry classifier indicating an octahedral molecular geometry where the Cahn-Ingold-Prelog (CIP) priority of the lowest priority donor atom directly across from (trans to) a priority 1 donor atom is also 1 and the priority of the donor atom across from (trans to) the highest priority atom in the plane perpendicular to this reference axis is 2"
  {:cmns-av/synonym "trans octahedral",
   :cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["octahedral 12" "OCTAHEDRAL 12"],
   :db/ident :idmp-sub/Stereochemistry-Octahedral12,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - octahedral 12",
   :skos/definition
   "stereochemistry classifier indicating an octahedral molecular geometry where the Cahn-Ingold-Prelog (CIP) priority of the lowest priority donor atom directly across from (trans to) a priority 1 donor atom is also 1 and the priority of the donor atom across from (trans to) the highest priority atom in the plane perpendicular to this reference axis is 2"})

(def Stereochemistry-Octahedral21
  "stereochemistry classifier indicating an octahedral molecular geometry where the Cahn-Ingold-Prelog (CIP) priority of the lowest priority donor atom directly across from (trans to) a priority 1 donor atom is 2 and the priority of the donor atom across from (trans to) the highest priority atom in the plane perpendicular to this reference axis is 1"
  {:cmns-av/synonym "trans octahedral 21",
   :cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["octahedral 21" "OCTAHEDRAL 21"],
   :db/ident :idmp-sub/Stereochemistry-Octahedral21,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - octahedral 21",
   :skos/definition
   "stereochemistry classifier indicating an octahedral molecular geometry where the Cahn-Ingold-Prelog (CIP) priority of the lowest priority donor atom directly across from (trans to) a priority 1 donor atom is 2 and the priority of the donor atom across from (trans to) the highest priority atom in the plane perpendicular to this reference axis is 1"})

(def Stereochemistry-Octahedral22
  "stereochemistry classifier indicating an octahedral molecular geometry where the Cahn-Ingold-Prelog (CIP) priority of the lowest priority donor atom directly across from (trans to) a priority 1 donor atom is 2 and the priority of the donor atom across from (trans to) the highest priority atom in the plane perpendicular to this reference axis is 2"
  {:cmns-av/synonym "trans octahedral 22",
   :cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["octahedral 22" "OCTAHEDRAL 22"],
   :db/ident :idmp-sub/Stereochemistry-Octahedral22,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - octahedral 22",
   :skos/definition
   "stereochemistry classifier indicating an octahedral molecular geometry where the Cahn-Ingold-Prelog (CIP) priority of the lowest priority donor atom directly across from (trans to) a priority 1 donor atom is 2 and the priority of the donor atom across from (trans to) the highest priority atom in the plane perpendicular to this reference axis is 2"})

(def Stereochemistry-Racemic
  "stereochemistry classifier indicating an equimolar mixture of two enantiomers"
  {:cmns-av/synonym "racemate",
   :cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["racemic" "RACEMIC"],
   :db/ident :idmp-sub/Stereochemistry-Racemic,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - racemic",
   :skos/definition
   "stereochemistry classifier indicating an equimolar mixture of two enantiomers",
   :skos/note "A racemate is optically inactive."})

(def Stereochemistry-SquarePlanar1
  "stereochemistry classifier indicating a square planar molecular geometry where the Cahn-Ingold-Prelog (CIP) priority of the donor atom directly across from the priority 1 donor atom is also 1"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["square planar 1" "SQUARE PLANAR 1"],
   :db/ident :idmp-sub/Stereochemistry-SquarePlanar1,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - square planar 1",
   :skos/definition
   "stereochemistry classifier indicating a square planar molecular geometry where the Cahn-Ingold-Prelog (CIP) priority of the donor atom directly across from the priority 1 donor atom is also 1"})

(def Stereochemistry-SquarePlanar2
  "stereochemistry classifier indicating a square planar molecular geometry where the Cahn-Ingold-Prelog (CIP) priority of the donor atom directly across from the priority 1 donor atom is 2"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["square planar 2" "SQUARE PLANAR 2"],
   :db/ident :idmp-sub/Stereochemistry-SquarePlanar2,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - square planar 2",
   :skos/definition
   "stereochemistry classifier indicating a square planar molecular geometry where the Cahn-Ingold-Prelog (CIP) priority of the donor atom directly across from the priority 1 donor atom is 2"})

(def Stereochemistry-SquarePlanar3
  "stereochemistry classifier indicating a square planar molecular geometry where the Cahn-Ingold-Prelog (CIP) priority of the donor atom directly across from the priority 1 donor atom is 3."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["square planar 3" "SQUARE PLANAR 3"],
   :db/ident :idmp-sub/Stereochemistry-SquarePlanar3,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - square planar 3",
   :skos/definition
   "stereochemistry classifier indicating a square planar molecular geometry where the Cahn-Ingold-Prelog (CIP) priority of the donor atom directly across from the priority 1 donor atom is 3."})

(def Stereochemistry-SquarePlanar4
  "stereochemistry classifier indicating a square planar molecular geometry where the Cahn-Ingold-Prelog (CIP) priority of the donor atom directly across from the priority 1 donor atom is 4"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["square planar 4" "SQUARE PLANAR 4"],
   :db/ident :idmp-sub/Stereochemistry-SquarePlanar4,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - square planar 4",
   :skos/definition
   "stereochemistry classifier indicating a square planar molecular geometry where the Cahn-Ingold-Prelog (CIP) priority of the donor atom directly across from the priority 1 donor atom is 4"})

(def Stereochemistry-Tetrahedral
  "stereochemistry classifier indicating a molecule in which the central atom is bound to four atoms that form the vertices of a tetrahedron and are described by the chirality symbols (R) and (S)"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["tetrahedral" "TETRAHEDRAL"],
   :db/ident :idmp-sub/Stereochemistry-Tetrahedral,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - tetrahedral",
   :skos/definition
   "stereochemistry classifier indicating a molecule in which the central atom is bound to four atoms that form the vertices of a tetrahedron and are described by the chirality symbols (R) and (S)"})

(def Stereochemistry-Trans
  "stereochemistry classifier indicating ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["trans" "TRANS"],
   :db/ident :idmp-sub/Stereochemistry-Trans,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53, clause B.6.5.1",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - trans",
   :skos/definition "stereochemistry classifier indicating ..."})

(def Stereochemistry-Unknown
  "stereochemistry classifier indicating that the molecular geometry is not known"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-txt/hasTextValue ["unknown" "UNKNOWN"],
   :db/ident :idmp-sub/Stereochemistry-Unknown,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.1, Table 53",
   :rdf/type [:idmp-sub/Stereochemistry :owl/NamedIndividual],
   :rdfs/label "stereochemistry - unknown",
   :skos/definition
   "stereochemistry classifier indicating that the molecular geometry is not known"})

(def StructuralRepresentation
  "representation of the arrangement of atoms for drawing chemical structures"
  {:db/ident :idmp-sub/StructuralRepresentation,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.6"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.3"],
   :rdf/type :owl/Class,
   :rdfs/label "structural representation",
   :rdfs/subClassOf :cmns-dsg/Designation,
   :skos/definition
   "representation of the arrangement of atoms for drawing chemical structures",
   :skos/note
   ["Structural representations can be in a variety of formats or even multiple formats. The commonly used formats include molfile, SMILES, InChI, and cdx. Indication of a preferred structural representation may be defined at regional level. Although most chemical substances may be represented by a single unambiguous structural representation, there are also many substances that can be represented by multiple structural representations or as a mixture of single substances."
    "Structural information is an essential element for all chemical substances, polymers and for other types of substances that have structurally definable elements or modifications. The representation should contain structural information in one or more of the standardized formats as indicated. A graphical image of the molecular structure should also be provided if available. A complete representation of the structure should be provided and is usually sufficient to define chemical substances."]})

(def StructurallyDiverseSubstance
  "single polydisperse substance isolated from a single source that is a complex combination which cannot be described as a mixture of a limited number of single substances"
  {:cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.63",
   :db/ident :idmp-sub/StructurallyDiverseSubstance,
   :rdf/type :owl/Class,
   :rdfs/label "structurally diverse substance",
   :rdfs/subClassOf :idmp-sub/SingleSubstance,
   :skos/definition
   "single polydisperse substance isolated from a single source that is a complex combination which cannot be described as a mixture of a limited number of single substances",
   :skos/note
   "Structurally diverse substances are defined based on immutable properties of a given material. Modifications that irreversibly alter the structure of the material, distinctive physical properties or components subsumed into the material, e.g. a gene in gene therapy substances, are defining elements for structurally diverse substances. Fractions derived from source material (oils/juices and extracts) are also captured in the definition. Protein mixtures containing a large number of diverse sequences such as polyclonal immunoglobulins are defined as structurally diverse substances."})

(def Structure
  "arrangement and organization of interrelated elements in a material object or system"
  {:cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clauses 3.49, 7.2.1",
   :cmns-av/usageNote
   "Note that the term 'structure' is not explicitly defined in the standard, but molecular structure is defined using this concept, and the concept appears in various UML diagrams in the standard.",
   :db/ident :idmp-sub/Structure,
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type :owl/Class,
   :rdfs/label "structure",
   :rdfs/subClassOf :cmns-col/Arrangement,
   :skos/definition
   "arrangement and organization of interrelated elements in a material object or system",
   :skos/note
   "Material structures include man-made objects such as buildings and machines and natural objects such as biological organisms, minerals and chemicals."})

(def Substance
  "matter of defined composition that has discrete existence, whose origin may be biological, mineral or chemical"
  {:cmns-av/directSource
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.84",
   :cmns-av/explanatoryNote
   "Note that while the IDMP standards require a substance name for all substances, the ontology deviates from this by making the name optional in the restriction on substance. This is to enable mapping to various source repositories for substance information that do not necessarily provide names but that define a substance based on its molecular structure, which is typically more accurate.",
   :db/ident :idmp-sub/Substance,
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-NameAndAnnotationConformant,
   :rdf/type :owl/Class,
   :rdfs/label "substance",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-sub/SubstanceName,
                      :owl/onProperty :idmp-sub/hasSubstanceName,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-sub/MolecularWeight,
                      :owl/onProperty :idmp-sub/hasMolecularWeight,
                      :rdf/type       :owl/Restriction}
                     :idmp-sub/Matter
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-sub/Substance,
                      :owl/onProperty :idmp-sub/isRelatedSubstanceTo,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :idmp-sub/hasStructure,
                      :owl/someValuesFrom :idmp-sub/Structure,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "matter of defined composition that has discrete existence, whose origin may be biological, mineral or chemical",
   :skos/note
   ["Discrete existence refers to the ability of a substance to exist independently of any other substance. Substances can either be well-defined entities containing definite chemical structures, synthetic (e.g. isomeric mixtures) or naturally-occurring (e.g. conjugated oestrogens) mixtures of chemicals containing definite molecular structures, or materials derived from plants, animals, microorganisms or inorganic matrices for which the chemical structure may be unknown or difficult to define."
    "A substance can be a moiety. A moiety is an entity within a substance that has a complete and continuous molecular structure. The strength of a pharmaceutical product is often based on what is referred to as the active moiety of the molecule, responsible for the physiological or pharmacological action of the drug substance. Chemically, the active moiety of a stoichiometric or non-stoichoimetrical substance molecule is considered that part of the molecule that is the base, free acid or ion molecular part of a salt, solvate, chelate, clathrate, molecular complex or ester."
    "Substances are further described as single substances, mixture substances or one of a group of specified substances. Single substances are defined using a minimally sufficient set of data elements divided into five types: chemical, protein, nucleic acid, polymer and structurally diverse. Substances may be salts, solvates, free acids, free bases or mixtures of related compounds that are either isolated or synthesized together. Pharmacopoeial terminology and defining characteristics will be used when available and appropriate. Defining elements are dependent on the type of substance."]})

(def SubstanceCode
  "sequence of characters denoting a registered code for a given substance that is associated with a publicly recognized code system"
  {:cmns-av/adaptedFrom
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.5"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.2.8"],
   :db/ident :idmp-sub/SubstanceCode,
   :rdf/type :owl/Class,
   :rdfs/label "substance code",
   :rdfs/subClassOf [:cmns-cds/CodeElement
                     {:owl/onClass    :idmp-sub/Substance,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :idmp-sub/hasComment,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :idmp-sub/hasChangeDate,
                      :rdf/type        :owl/Restriction}
                     :cmns-ra/RegisteredIdentifier],
   :skos/definition
   "sequence of characters denoting a registered code for a given substance that is associated with a publicly recognized code system",
   :skos/example
   ["CAS Registry numbers, EC numbers, FDA UNII codes, EMA XEVMPD codes, ASK numbers, EPA Pesticide codes"
    "These codes include Chemical Abstract Service (CAS) Registry Numbers, European Inventory of Existing Commercial Chemical Substances (EINECS), European Drug Codes (XEVMPD) and Japanese Drug Codes."],
   :skos/note
   ["The actual code shall be captured using the same format that is used in the code system. Only codes associated with a code system shall be captured. The code shall be specifically associated with a given substance. Many public and non-public databases identify substances with a code and these codes can be very helpful in mapping substances to various systems. Codes shall always be verified against the source system. Different jurisdictions may require a code from a code system or multiple code systems to be associated and submitted with a substance."
    "Codes typically facilitate mapping and linking of substances to a variety of information sources."]})

(def SubstanceConstituency
  "constituency that defines some substance based on its relationship(s) to some other substance (ingredient) or moiety, potentially in some amount, in some context"
  {:cmns-av/synonym "substance relationship",
   :cmns-av/usageNote
   "From an implementation (mapping) perspective, this substance constituency class provides the basis for a node in the relationship 'substance in the role of a subject realizes an ingredient or moiety role played by some substance or moiety', where the object may have some amount, limit on impurities, or basis of strength, for example, in a given context. Qualifiers such as the context, purity requirements or limits, basis of strength, amont substance should be added to the constituency node, rather than to the roles.",
   :db/ident :idmp-sub/SubstanceConstituency,
   :dcterms/source
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 3.17",
   :rdf/type :owl/Class,
   :rdfs/label "substance constituency",
   :rdfs/subClassOf [:cmns-pts/Constituency
                     {:owl/onProperty     :cmns-pts/hasRole,
                      :owl/someValuesFrom {:owl/unionOf [:idmp-sub/Ingredient
                                                         :idmp-sub/MoietyRole],
                                           :rdf/type    :owl/Class},
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-dsg/defines,
                      :owl/someValuesFrom :idmp-sub/Substance,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :idmp-sub/Substance,
                      :owl/onProperty    :cmns-dsg/defines,
                      :rdf/type          :owl/Restriction}],
   :skos/definition
   "constituency that defines some substance based on its relationship(s) to some other substance (ingredient) or moiety, potentially in some amount, in some context",
   :skos/example
   "The substance, triamcinolone acetonide is the parent (constituent) substance of the specified substance Group 1 substance, triamcinolone acetonide, micronized. In this example, the subject role is played by 'triamcinolone acetonide, micronized' and object role by 'triamcinolone acetonide'.",
   :skos/note
   ["Constituent component is part of a mixture belonging to a homologous group of individual components, described as parent substances for the manufacture of an allergenic extract. In this example, the subject role would be played by the mixture, whose object role is played by multiple substances (ingredient roles)."
    "Constituents shall have an associated role and amount at the Specified Substance Group 1 information model. Constituent specifications shall be used to describe components as well as limits on impurities or related substances for a given material."
    "Constituents can be impurities, degradants, extraction solvents, vehicles, active markers or signature substances, parent substances or single substances mixed together to form a multi-substance material."]})

(def SubstanceIdentifier
  "registered identifier that is non-semantic, random and of fixed length with an internal integrity check"
  {:cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.5",
   :cmns-av/synonym ["Substance-ID" "Substance ID"],
   :db/ident :idmp-sub/SubstanceIdentifier,
   :rdf/type :owl/Class,
   :rdfs/label "substance identifier",
   :rdfs/subClassOf [:cmns-ra/RegisteredIdentifier
                     {:owl/onClass    :idmp-sub/Substance,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "registered identifier that is non-semantic, random and of fixed length with an internal integrity check",
   :skos/note
   ["Each substance and specified substance shall have only one permanently associated unique identifier (called respectively Substance-ID, resp. Specified Substance Group 1, 2, 3 or 4-ID) that shall not indicate the order of submission to the registration process. The Substance ID and Specified Substance Group 1, 2, 3 or 4-ID are per definition unique and therefore global."
    "A variety of chemical and biological nomenclature systems have been developed that describe the pharmacological actions of drugs. Functional naming systems such as INN or USAN are valuable in either describing molecular structure or the biological actions of a substance. However, a unique identifier based on such classification systems may result in greater maintenance requirements because classification schemes often require broad ranges of expertise as well as a controlled terminology. Translation is also always a problem with any semantic system. Once a substance has been defined and assigned a unique identifier it is essential that this identifier be permanently associated with the substance. A substance shall only have one unique identifier. This will necessitate the generation of detailed rules to define substances that will be presented in the ISO/TS 19844 implementation guide."
    "A unique identifier shall be assigned to approved and investigational substances, excipients and impurities, solvents, ions, fragments and moieties, each of which shall be defined as a Substance."
    "The unique identifiers can be publicly available when the defining information along with the name or company code is publicly available in a single reference. The use of the identifier shall be royalty free."]})

(def SubstanceName
  "name or company code associated with the substance"
  {:cmns-av/explanatoryNote
   ["Although ISO 11238 does not provide any guidance on substance nomenclature, it does provide a structure for the capture of names and codes that are used to refer to a substance. For the purpose of ISO 11238 there are at the moment sixteen types of names, e.g. Official names, systematic names, other names, brand names, company codes, homeopathic names, specified homeopathic names, plasma-derived names, Specified Substance Group 1, 2 and 3 names."
    "Names for a given substance and/or standardized names submitted by another party may be available in the substance terminology. Indication that a name is the preferred name or term by which a substance will be referred to in a given jurisdiction and domain may be presented in the terminology. This preferred term may vary depending on jurisdiction or domain or the state of development of a given substance."],
   :db/ident :idmp-sub/SubstanceName,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type :owl/Class,
   :rdfs/label "substance name",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :idmp-sub/hasSubstanceNameValue,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :cmns-cxtdsg/ContextualName
                     {:owl/onProperty     :cmns-dsg/isNameOf,
                      :owl/someValuesFrom :idmp-sub/Substance,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :idmp-dtp/hasLanguageCode,
                      :owl/someValuesFrom :lcc-lr/LanguageIdentifier,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :idmp-sub/SubstanceNameClassifier,
                      :owl/onProperty :idmp-sub/hasSubstanceNameType,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-sub/SubstanceNameDomain,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :cmns-rga/isApplicableInJurisdiction,
                      :owl/someValuesFrom :lcc-cr/GeographicRegionIdentifier,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-doc/Reference,
                      :owl/onProperty :cmns-dsg/isDescribedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition "name or company code associated with the substance",
   :skos/example
   "During the early stages of clinical development, the preferred term for a substance can be its company code. In later stages, an INN can be associated with the substance and become the preferred term for that substance.",
   :skos/note
   ["At least one substance name or company code shall be associated with each substance. The element group 'Substance Name' consists of the following attributes: 'Substance Name', 'Substance Name Type', 'Language', 'Substance Name Domain' and 'Jurisdiction'. If the name is an official name, the naming authority used shall be identified by the 'Official Name Type' as well as the 'Official Name Status'."
    "It is anticipated that every substance will have a name in English. Synonyms can be associated with a substance. Translations of English names to other languages can also be accommodated. Language and Jurisdiction will be described using ISO standards."]})

(def SubstanceNameClassifier
  "classifier that describes the nature of the substance name from a pre-defined ISO 19844 code set"
  {:cmns-av/synonym "substance name type",
   :db/ident :idmp-sub/SubstanceNameClassifier,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type :owl/Class,
   :rdfs/label "substance name classifier",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-sub/SubstanceName,
                      :owl/onProperty :cmns-cls/classifies,
                      :rdf/type       :owl/Restriction}
                     :cmns-cls/Classifier],
   :skos/definition
   "classifier that describes the nature of the substance name from a pre-defined ISO 19844 code set"})

(def SubstanceNameClassifier-BrandName
  "substance name classifier for a name by which a company identifies a given substance typically for marketing purposes"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Brand Name",
   :db/ident :idmp-sub/SubstanceNameClassifier-BrandName,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/SubstanceNameClassifier :owl/NamedIndividual],
   :rdfs/label "substance name classifier - brand name",
   :skos/definition
   "substance name classifier for a name by which a company identifies a given substance typically for marketing purposes"})

(def SubstanceNameClassifier-CommonName
  "substance name classifier for a name that ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Common Name",
   :db/ident :idmp-sub/SubstanceNameClassifier-CommonName,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/SubstanceNameClassifier :owl/NamedIndividual],
   :rdfs/label "substance name classifier - common name",
   :skos/definition "substance name classifier for a name that ..."})

(def SubstanceNameClassifier-CompanyCode
  "substance name classifier for a name associated with a given substance that is an internal corporate code"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Company Code",
   :db/ident :idmp-sub/SubstanceNameClassifier-CompanyCode,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/SubstanceNameClassifier :owl/NamedIndividual],
   :rdfs/label "substance name classifier - company code",
   :skos/definition
   "substance name classifier for a name associated with a given substance that is an internal corporate code",
   :skos/example
   "During the early stages of clinical development, the preferred term for a substance can be its company code. In later stages, an INN can be associated with the substance and become the preferred term for that substance.",
   :skos/note
   "A company code may be used in cases where no official name is available and if it is associated with defining information and is found together in at least one single reference that is from a reputable source in the public domain (i.e. scientific journal, presentations or posters at scientific conferences, company publication, patent or published patent application, public databases such as STN from CAS)."})

(def SubstanceNameClassifier-DisplayName
  "substance name classifier for a name that ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Display Name",
   :db/ident :idmp-sub/SubstanceNameClassifier-DisplayName,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/SubstanceNameClassifier :owl/NamedIndividual],
   :rdfs/label "substance name classifier - display name",
   :skos/definition "substance name classifier for a name that ..."})

(def SubstanceNameClassifier-HerbalName
  "substance name classifier for a name that ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Herbal Name",
   :db/ident :idmp-sub/SubstanceNameClassifier-HerbalName,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/SubstanceNameClassifier :owl/NamedIndividual],
   :rdfs/label "substance name classifier - herbal name",
   :skos/definition "substance name classifier for a name that ..."})

(def SubstanceNameClassifier-HomeopathicName
  "substance name classifier for a name that ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Homeopathic Name",
   :db/ident :idmp-sub/SubstanceNameClassifier-HomeopathicName,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/SubstanceNameClassifier :owl/NamedIndividual],
   :rdfs/label "substance name classifier - homeopathic name",
   :skos/definition "substance name classifier for a name that ..."})

(def SubstanceNameClassifier-OfficialName
  "substance name classifier for a name that is typically nonproprietary used in a given jurisdiction and domain to refer to a specific substance"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Official",
   :db/ident :idmp-sub/SubstanceNameClassifier-OfficialName,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2, B.4.27"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/SubstanceNameClassifier :owl/NamedIndividual],
   :rdfs/label "substance name classifier - official name",
   :skos/definition
   "substance name classifier for a name that is typically nonproprietary used in a given jurisdiction and domain to refer to a specific substance",
   :skos/example
   "INN: International Nonproprietary Name, also known as rINN, recommended International Nonproprietary Name or pINN, proposed International Nonproprietary Name or INNM, Modified International Nonproprietary Name published by WHO: World Health Organization: in accordance with rules.",
   :skos/note
   "The domain, jurisdiction, and authority that assigned the name (USAN, INN, JAN etc.) and the language of the name are also captured."})

(def SubstanceNameClassifier-OtherName
  "substance name classifier for a name associated with a given substance that is considered a synonym"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Other Name",
   :db/ident :idmp-sub/SubstanceNameClassifier-OtherName,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/SubstanceNameClassifier :owl/NamedIndividual],
   :rdfs/label "substance name classifier - other name",
   :skos/definition
   "substance name classifier for a name associated with a given substance that is considered a synonym"})

(def SubstanceNameClassifier-PlasmaDerivedName
  "substance name classifier for a name that ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Plasma-Derived Name",
   :db/ident :idmp-sub/SubstanceNameClassifier-PlasmaDerivedName,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/SubstanceNameClassifier :owl/NamedIndividual],
   :rdfs/label "substance name classifier - plasma-derived name",
   :skos/definition "substance name classifier for a name that ..."})

(def SubstanceNameClassifier-PreferredName
  "substance name classifier for a name that ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Preferred Name",
   :db/ident :idmp-sub/SubstanceNameClassifier-PreferredName,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/SubstanceNameClassifier :owl/NamedIndividual],
   :rdfs/label "substance name classifier - preferred name",
   :skos/definition "substance name classifier for a name that ..."})

(def SubstanceNameClassifier-ScientificName
  "substance name classifier for a name that is the taxonomic name for an organism"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Scientific Name",
   :db/ident :idmp-sub/SubstanceNameClassifier-ScientificName,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2, 6.9.5"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:owl/NamedIndividual :idmp-sub/SubstanceNameClassifier],
   :rdfs/label "substance name classifier - scientific name",
   :skos/definition
   "substance name classifier for a name that is the taxonomic name for an organism",
   :skos/note
   "The accepted scientific name for plants is provided by Kew Gardens' Medicinal Plant Names Services (MPNS). The names for other organisms will be provided by other authoritative sources."})

(def SubstanceNameClassifier-SpecifiedHomeopathicName
  "substance name classifier for a name that ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Specified Homeopathic Name",
   :db/ident :idmp-sub/SubstanceNameClassifier-SpecifiedHomeopathicName,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/SubstanceNameClassifier :owl/NamedIndividual],
   :rdfs/label "substance name classifier - specified homeopathic name",
   :skos/definition "substance name classifier for a name that ..."})

(def SubstanceNameClassifier-SpecifiedSubstanceGroup1Name
  "substance name classifier for a name that ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Specified Substance Group 1 Name",
   :db/ident :idmp-sub/SubstanceNameClassifier-SpecifiedSubstanceGroup1Name,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/SubstanceNameClassifier :owl/NamedIndividual],
   :rdfs/label "substance name classifier - specified substance group 1 name",
   :skos/definition "substance name classifier for a name that ..."})

(def SubstanceNameClassifier-SpecifiedSubstanceGroup2Name
  "substance name classifier for a name that ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Specified Substance Group 2 Name",
   :db/ident :idmp-sub/SubstanceNameClassifier-SpecifiedSubstanceGroup2Name,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/SubstanceNameClassifier :owl/NamedIndividual],
   :rdfs/label "substance name classifier - specified substance group 2 name",
   :skos/definition "substance name classifier for a name that ..."})

(def SubstanceNameClassifier-SpecifiedSubstanceGroup3Name
  "substance name classifier for a name that ..."
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Specified Substance Group 3 Name",
   :db/ident :idmp-sub/SubstanceNameClassifier-SpecifiedSubstanceGroup3Name,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type [:idmp-sub/SubstanceNameClassifier :owl/NamedIndividual],
   :rdfs/label "substance name classifier - specified substance group 3 name",
   :skos/definition "substance name classifier for a name that ..."})

(def SubstanceNameClassifier-SystematicName
  "substance name classifier for a name that is typically be used for simple chemicals and structurally diverse materials where the definitions are based on a chemical structure or systematic taxonomic information"
  {:cmns-col/isMemberOf :idmp-sub/ISO19844-CodeSet,
   :cmns-dsg/isDefinedIn :idmp-sub/ISO11238-ClassificationScheme,
   :cmns-txt/hasTextValue "Systematic Name",
   :db/ident :idmp-sub/SubstanceNameClassifier-SystematicName,
   :dcterms/source
   ["ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"
    "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2, B.6.2"],
   :rdf/type [:owl/NamedIndividual :idmp-sub/SubstanceNameClassifier],
   :rdfs/label "substance name classifier - systematic name",
   :skos/definition
   "substance name classifier for a name that is typically be used for simple chemicals and structurally diverse materials where the definitions are based on a chemical structure or systematic taxonomic information",
   :skos/example
   "IUPAC name, CAS Registry Name and definitions of a Pharmacopoeial Monograph",
   :skos/note
   "For chemicals, these names are typically derived from IUPAC or CAS systems of nomenclature. From the systematic names of chemicals, a molecular structure can typically be derived and the name can be checked by a number of chemical drawing programmes that convert a given name to a molecular structure."})

(def SubstanceNameDomain
  "classifier that specifies when and for what purpose the name is to be used"
  {:db/ident :idmp-sub/SubstanceNameDomain,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.4"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :rdf/type :owl/Class,
   :rdfs/label "substance name domain",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-sub/SubstanceName,
                      :owl/onProperty :cmns-cls/classifies,
                      :rdf/type       :owl/Restriction}
                     :cmns-cls/Classifier],
   :skos/definition
   "classifier that specifies when and for what purpose the name is to be used",
   :skos/example
   "The terms DRUG and BIOLOGIC could be used in Japan and the US as official name domain. In the EU the term MEDICINE may cover the name of many substances that would be either DRUG or BIOLOGIC in the US and Japan.",
   :skos/note
   "All substance names can have at least one domain. This is useful to differentiate different names for the same substance as used for a drug active ingredient as opposed to a food colour additive. The domain and the actual name of a domain will vary according to jurisdiction."})

(def SubstanceRole
  "functional role played by a substance in another substance or that is part of or used in the preparation of some manufactured item, or pharmaceutical product, medication, or drug"
  {:db/ident :idmp-sub/SubstanceRole,
   :rdf/type :owl/Class,
   :rdfs/label "substance role",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-pts/isPlayedBy,
                      :owl/someValuesFrom :idmp-sub/Substance,
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/FunctionalRole],
   :skos/definition
   "functional role played by a substance in another substance or that is part of or used in the preparation of some manufactured item, or pharmaceutical product, medication, or drug",
   :skos/note
   "A pharmacological role is related to the composition, properties, or action of a substance or ingredient in another substance or pharmaceutical product. It covers adjuvant and expedient, which are roles played by the substance components in a pharmaceutical product, but it can also be used for treated disease, patient, packaging and routes of administrations, all of which are roles that are studied in the science of pharmacology and have an impact on the drug's effects."})

(def hasActiveMoiety
  "relates a substance directly to an active moiety"
  {:db/ident :idmp-sub/hasActiveMoiety,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.6.3"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.1"],
   :owl/inverseOf :idmp-sub/isActiveMoietyOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-sub/Substance,
   :rdfs/label "has active moiety",
   :rdfs/range :idmp-sub/Moiety,
   :rdfs/subPropertyOf :idmp-sub/hasMoiety,
   :skos/definition "relates a substance directly to an active moiety"})

(def hasBusinessRules
  "describes the nature of the rules to be applied for a given class or element in cases where that element is conditionally required for conformance per the ISO 19844 guideline"
  {:db/ident :idmp-sub/hasBusinessRules,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "has business rules",
   :skos/definition
   "describes the nature of the rules to be applied for a given class or element in cases where that element is conditionally required for conformance per the ISO 19844 guideline"})

(def hasChangeDate
  "indicates date on which the status of something has changed as part of the terminology maintenance"
  {:cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.2.8",
   :db/ident :idmp-sub/hasChangeDate,
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-TS,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has change date",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :rdfs/subPropertyOf :cmns-dt/hasObservedDateTime,
   :skos/definition
   "indicates date on which the status of something has changed as part of the terminology maintenance"})

(def hasComment
  "indicates a remark"
  {:cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.2.8",
   :db/ident           :idmp-sub/hasComment,
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ST,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/label         "has comment",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition    "indicates a remark"})

(def hasConformanceLevel
  "indicates whether a given class or element is mandatory, conditional, or optional with respect to a given substance type or specified substance group for reporting information per the ISO 19844 guideline"
  {:db/ident :idmp-sub/hasConformanceLevel,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "has conformance level",
   :rdfs/range :idmp-sub/ConformanceLevel,
   :skos/definition
   "indicates whether a given class or element is mandatory, conditional, or optional with respect to a given substance type or specified substance group for reporting information per the ISO 19844 guideline"})

(def hasMoiety
  "relates a substance directly to a moiety that defines it via a substance constituency"
  {:db/ident :idmp-sub/hasMoiety,
   :owl/propertyChainAxiom
   [:cmns-dsg/isDefinedIn :idmp-sub/hasMoietyRole :cmns-pts/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has moiety",
   :skos/definition
   "relates a substance directly to a moiety that defines it via a substance constituency"})

(def hasMoietyRole
  "relates a substance constituency to a role played by a moiety"
  {:db/ident :idmp-sub/hasMoietyRole,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.6.3"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.1"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-sub/SubstanceConstituency,
   :rdfs/label "has moiety role",
   :rdfs/range :idmp-sub/MoietyRole,
   :rdfs/subPropertyOf :cmns-pts/hasRole,
   :skos/definition
   "relates a substance constituency to a role played by a moiety"})

(def hasMolecularFormula
  "relates a single substance to a formal definition for its molecular formula"
  {:cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.2.2",
   :db/ident :idmp-sub/hasMolecularFormula,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.3",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ST,
   :idmp-sub/hasBusinessRules
   "Can be implicitly derived from the structure; Validity check for identity and structural representation. Molecular formula is not mandatory in the case of a large protein (e.g. more than 10k Da), a large nucleic acid or a large polymer. For small molecules up to molecular weight of 5 000 the unit should be g/mol; above that the Da/kDa is to be used.",
   :idmp-sub/hasConformanceLevel :idmp-sub/ConformanceLevel-Conditional,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has molecular formula",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "relates a single substance to a formal definition for its molecular formula",
   :skos/note
   ["Molecular formula is written as a sequence of pairs of atom symbol and stoichiometric number (see example below). This formal notation is essentially a code system. Specified according to the Hill system, i.e. first C, then H, then alphabetical."
    "The messaging requirements can dictate a specific electronic format for the molecular formula and the molecular formula by moiety."]})

(def hasMolecularFormulaByMoiety
  "way of describing of the molecular formula of a stoichiometric or non-stoichiometric substance existing of two or more moieties, the molecular formula of each moiety shall be described separated by a dot"
  {:cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.2.2",
   :db/ident :idmp-sub/hasMolecularFormulaByMoiety,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.4",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ST,
   :idmp-sub/hasBusinessRules
   "Can be implicitly derived from the structure; Validity check for identity and structural representation. For a salt/hydrate the molecular formula of the base or the acid and the salt/hydrate part are separated by a dot per moiety, e.g. Desmopressin Monoacetate Trihydrate: Molecular formula by moiety: C46H64N14O12S2.C2H4O2.3H2O.",
   :idmp-sub/hasConformanceLevel :idmp-sub/ConformanceLevel-Conditional,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has molecular formula by moiety",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "way of describing of the molecular formula of a stoichiometric or non-stoichiometric substance existing of two or more moieties, the molecular formula of each moiety shall be described separated by a dot",
   :skos/note
   ["In non-cyclic linear structures like sodium nitroprusside: Na2[Fe(CN)5(NO)].2H2O, a non-cyclic structure is constructed in the following order: a) symbol of the central atom placed on the left; b) ionic ligands with cations first then anions; c) neutral ligands."
    "The messaging requirements can dictate a specific electronic format for the molecular formula and the molecular formula by moiety."
    "The molecular formula of the chemical salt Amlodipine besilate is described as C20H25ClN2O5.C6H6O3S."]})

(def hasMolecularWeight
  "relates a substance to its molecular weight"
  {:db/ident :idmp-sub/hasMolecularWeight,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.7.5, Figure 10"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.3"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has molecular weight",
   :rdfs/range :idmp-sub/MolecularWeight,
   :rdfs/subPropertyOf :cmns-qtu/hasQuantityValue,
   :skos/definition "relates a substance to its molecular weight"})

(def hasNumberOfMoieties
  "is a chemical substance that contains complete chemical structures and definite stoichiometric ratios among moieties"
  {:db/ident :idmp-sub/hasNumberOfMoieties,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.1.4",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-INT,
   :idmp-sub/hasBusinessRules
   "The numeric value shall be always greater than or equal to 2; The value is automatically calculated (Implicit) based on the number of Moieties; if the numeric value is equal to 1, the class Moiety shall not be used.",
   :idmp-sub/hasConformanceLevel :idmp-sub/ConformanceLevel-Conditional,
   :rdf/type [:owl/DatatypeProperty :owl/FunctionalProperty],
   :rdfs/domain :idmp-sub/ChemicalSubstance,
   :rdfs/label "has number of moieties",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :idmp-dtp/hasIntegerValue,
   :skos/definition
   "is a chemical substance that contains complete chemical structures and definite stoichiometric ratios among moieties",
   :skos/note
   "The number of moieties specified should be provided. Non-stoichiometric chemical substances shall have at least two moieties. Each moiety shall be represented by a chemical structure."})

(def hasParentSubstance
  "relates a substance to its parent substance"
  {:db/ident :idmp-sub/hasParentSubstance,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.6.3"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.1"],
   :owl/inverseOf :idmp-sub/isParentSubstanceOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-sub/Substance,
   :rdfs/label "has parent substance",
   :rdfs/range :idmp-sub/Substance,
   :rdfs/subPropertyOf :idmp-sub/isRelatedSubstanceTo,
   :skos/definition "relates a substance to its parent substance"})

(def hasRendering
  "has a drawing in perspective of a structure"
  {:db/ident           :idmp-sub/hasRendering,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/label         "has rendering",
   :rdfs/range         :xsd/anyURI,
   :rdfs/subPropertyOf :idmp-dtp/hasReferenceURL,
   :skos/definition    "has a drawing in perspective of a structure"})

(def hasSimplifiedMolecularInputLineEntrySpecification
  "specification for an unambiguous linear representation of chemical or molecular structures using ASCII characters"
  {:cmns-av/abbreviation "SMILES",
   :cmns-av/adaptedFrom
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause A.2.3",
   :db/ident :idmp-sub/hasSimplifiedMolecularInputLineEntrySpecification,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause A.2.3",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :idmp-sub/MolecularStructure,
   :rdfs/label "has simplified molecular input line entry specification",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "specification for an unambiguous linear representation of chemical or molecular structures using ASCII characters",
   :skos/note
   ["It is predominantly used by Daylight Chemical Information Systems Inc., although an open source version has been recently developed. Canonical smiles is a SMILES string that is unique for each structure and can be used to ensure that duplicate structures are not entered into a database."
    "Other linear representation forms for chemical structures include SYBYL line notation (SLN) and the older Wiswesser Line Notation, which was the first line notation for the representation of chemical structures. These other formats are not currently in wide use."]})

(def hasStereochemistry
  "is classified by the relative spatial arrangement of atoms within molecules"
  {:db/ident :idmp-sub/hasStereochemistry,
   :dcterms/source
   "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.2.2 Figure 14",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-CD,
   :idmp-sub/hasBusinessRules
   "When the substance type, as defined in is either chemical or polymer, this class is MANDATORY; for all other cases this class is CONDITIONAL.",
   :idmp-sub/hasConformanceLevel :idmp-sub/ConformanceLevel-Conditional,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has stereochemistry",
   :rdfs/range :idmp-sub/Stereochemistry,
   :rdfs/subPropertyOf [:cmns-cls/isClassifiedBy :idmp-sub/hasStructure],
   :skos/definition
   "is classified by the relative spatial arrangement of atoms within molecules"})

(def hasStructure
  "indicates any arrangement and/or organization of interrelated elements in a substance"
  {:db/ident :idmp-sub/hasStructure,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.2 Figure 3"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.2 Figure 10"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has structure",
   :rdfs/subPropertyOf :cmns-col/hasArrangement,
   :skos/definition
   "indicates any arrangement and/or organization of interrelated elements in a substance"})

(def hasSubstanceName
  "links a name or company code to the substance it denotes"
  {:cmns-av/explanatoryNote
   "Note that while the IDMP standards require a substance name for all substances, the ontology deviates from this by making the name optional in the restriction on substance. This is to enable mapping to various source repositories for substance information that do not necessarily provide names but that define a substance based on its molecular structure, which is typically more accurate.",
   :db/ident :idmp-sub/hasSubstanceName,
   :dcterms/source
   ["ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"
    "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3, Annex L"],
   :idmp-cmpl/hasConformanceToISOLevel
   :idmp-cmpl/ConformanceToISOLevel-NameAndAnnotationConformant,
   :idmp-sub/hasBusinessRules
   "Mandatory all substances shall have at least one name or company code (also considered to be a Substance Name) associated with the substance.",
   :idmp-sub/hasConformanceLevel :idmp-sub/ConformanceLevel-Mandatory,
   :idmp-sub/hasValuesAllowed
   "Free text, multiple names allowed, each in its own element.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-sub/Substance,
   :rdfs/label "has substance name",
   :rdfs/range :idmp-sub/SubstanceName,
   :rdfs/subPropertyOf :cmns-dsg/hasName,
   :skos/definition "links a name or company code to the substance it denotes",
   :skos/example
   "Amoxicillin; Harpagophytum procumbens (Burch.) DC. ex Meisn., Root",
   :skos/note
   "The name or company code associated with the Substance shall be specified. For substances originated from Plants the Substance is always a single species, or intraspecies, or is occasionally a single genus. It will have a Name which is composed of: [Scientific genus/binomial/trinomial with Author] [Part(s)]. The scientific element of the name is usually a binomial, but may be a trinomial or a genus, as appropriate, together with the author of the name. The Name is not an official name in any pharmacopoeia or other legislation, and the inclusion of the author is to ensure that it is not confused with the official names for specified substances that are derived from a single species substance. It can be written in any language and its jurisdiction can be restricted using Official Name Status."})

(def hasSubstanceNameType
  "links a substance name to the classifier for that name"
  {:db/ident :idmp-sub/hasSubstanceNameType,
   :dcterms/source
   ["ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"
    "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.2"],
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-CD,
   :idmp-sub/hasBusinessRules
   "A Substance Name shall always correspond to at least one and only one Substance Name Type. The Preferred Name is the name that describes at least all moieties of a substance and shall be used in all EU languages, e.g. Benzathine Benzylpenicillin tetrahydrate (Dutch: Benzathinebenzylpenicillinetetrahydraat). For the Substance (fresh) (e.g. Harpagophytum procumbens (Burch.) DC. ex Meisn., Root) the Substance Name Type shall be 'Other'. Specified Substance Group 1, 2 and 3 name types are used to guide the user with regards to which level the substance name belongs to e.g. water for injection – Ph.Eur. is a name having the substance name type: Specified Substance Group 3.",
   :idmp-sub/hasConformanceLevel :idmp-sub/ConformanceLevel-Mandatory,
   :idmp-sub/hasValuesAllowed
   "Official Name, Systematic Name, Scientific Name, Company Code, Other Name, Brand Name, Herbal Name, Homeopathic Name, Specified Homeopathic Name, Plasma-Derived Name, Preferred Name, Specified Substance Group 1 Name, Specified Substance Group 2 Name, Specified Substance Group 3 Name, Display Name, Common Name",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-sub/SubstanceName,
   :rdfs/label "has substance name type",
   :rdfs/range :idmp-sub/SubstanceNameClassifier,
   :rdfs/subPropertyOf :cmns-cls/isClassifiedBy,
   :skos/definition "links a substance name to the classifier for that name",
   :skos/note
   ["Systematic names will typically be used for simple chemicals and structurally diverse materials where the definitions are based on a chemical structure or systematic taxonomic information. For chemicals, these names are typically derived from IUPAC or CAS systems of nomenclature. From the systematic names of chemicals, a molecular structure can typically be derived and the name can be checked by a number of chemical drawing programmes that convert a given name to a molecular structure. Brand names are names by which a company identifies a given substance typically for marketing purposes. Other names associated with a given substance are for instance common names. Company codes (also known as lab/laboratory codes or clinical trial codes) are also treated as names. They are assigned by a given company to substances in clinical or preclinical development."
    "Every substance name shall have one name type. When a Substance has the Substance Name Type e.g. Other Name, but also an official name exists, which will be used then the Substance Name element group should be repeated with the Name referring to the Official Name and the Substance Name Type should be 'Official', see Table B.1. Official names are typically nonproprietary names used in a given jurisdiction and domain to refer to a specific substance. The domain, jurisdiction, and authority that assigned the name (USAN, INN, JAN etc.) and the language of the name are also captured."]})

(def hasSubstanceNameValue
  "name or company code associated with the substance"
  {:db/ident :idmp-sub/hasSubstanceNameValue,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.1"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4"],
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ST,
   :idmp-sub/hasBusinessRules
   "Mandatory all substances shall have at least one name or company code (also considered to be a Substance Name) associated with the substance.",
   :idmp-sub/hasConformanceLevel :idmp-sub/ConformanceLevel-Mandatory,
   :idmp-sub/hasValuesAllowed
   "Free text, multiple names allowed, each in its own element.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has substance name value",
   :rdfs/subPropertyOf :lcc-lr/hasTextualName,
   :skos/definition "name or company code associated with the substance",
   :skos/example
   ["Amoxicillin; Harpagophytum procumbens (Burch.) DC. ex Meisn., Root"
    "Polyethylene glycol is a name for a family of polymers, so it would not be an acceptable name for an individual substance. Polyethylene Glycol 1000 is an official name in the US for a polyethylene glycol polymer with an average molecular weight of 1000. In the European Union, the INN Macrogol 1000 would be an official name for the same substance. In the personal care products domain PEG-20 is the official name for the same substance and 20 refers to the average degree of polymerization."],
   :skos/note
   "For substances originated from Plants the Substance is always a single species, or intraspecies, or is occasionally a single genus. It will have a Name which is composed of: [Scientific genus/binomial/trinomial with Author] [Part(s)]. The scientific element of the name is usually a binomial, but may be a trinomial or a genus, as appropriate, together with the author of the name. The Name is not an official name in any pharmacopoeia or other legislation, and the inclusion of the author is to ensure that it is not confused with the official names for specified substances that are derived from a single species substance. It can be written in any language and its jurisdiction can be restricted using Official Name Status."})

(def hasValuesAllowed
  "describes the nature of valid values for a given class or element in cases where that information is encoded as a string rather than as a value domain per the ISO 19844 guideline"
  {:db/ident :idmp-sub/hasValuesAllowed,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "has values allowed",
   :skos/definition
   "describes the nature of valid values for a given class or element in cases where that information is encoded as a string rather than as a value domain per the ISO 19844 guideline"})

(def isActiveMoietyOf
  "relates a moiety to a substance for which it is the essential aspect, responsible for its pharmacological activity"
  {:db/ident :idmp-sub/isActiveMoietyOf,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.6.3"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.1"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is active moiety of",
   :rdfs/range :idmp-sub/Substance,
   :rdfs/subPropertyOf :idmp-sub/isMoietyOf,
   :skos/definition
   "relates a moiety to a substance for which it is the essential aspect, responsible for its pharmacological activity"})

(def isMoietyOf
  "relates a moiety directly to a substance that it defines via a substance constituency"
  {:cmns-av/usageNote
   "Note that this construct works fine with respect to the HermiT reasoner, but Pellet doesn't like it.",
   :db/ident :idmp-sub/isMoietyOf,
   :owl/propertyChainAxiom
   [:cmns-pts/playsRole :idmp-sub/isMoietyRoleIn :cmns-dsg/defines],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is moiety of",
   :skos/definition
   "relates a moiety directly to a substance that it defines via a substance constituency"})

(def isMoietyRoleIn
  "relates something in a moiety role (which may be a substance) to a constituency it is part of"
  {:db/ident :idmp-sub/isMoietyRoleIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-sub/MoietyRole,
   :rdfs/label "is moiety role in",
   :rdfs/range :idmp-sub/SubstanceConstituency,
   :rdfs/subPropertyOf :cmns-pts/isRoleIn,
   :skos/definition
   "relates something in a moiety role (which may be a substance) to a constituency it is part of"})

(def isParentSubstanceOf
  "relates a substance to a child/derived substance"
  {:cmns-av/synonym "is antecedent substance of",
   :db/ident :idmp-sub/isParentSubstanceOf,
   :dcterms/source
   ["ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.6.3"
    "ISO 11238:2018 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.3.1"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-sub/Substance,
   :rdfs/label "is parent substance of",
   :rdfs/range :idmp-sub/Substance,
   :rdfs/subPropertyOf :idmp-sub/isRelatedSubstanceTo,
   :skos/definition "relates a substance to a child/derived substance"})

(def isPublicDomain
  "indicates whether a reference source is available in the public domain"
  {:db/ident :idmp-sub/isPublicDomain,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.4",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-BL,
   :idmp-sub/hasBusinessRules
   "All regulatory submissions are considered not to be in the public domain. There may be an additional flag that determines whether any information can be released on a given substance.",
   :idmp-sub/hasConformanceLevel :idmp-sub/ConformanceLevel-Conditional,
   :rdf/type [:owl/DatatypeProperty :owl/FunctionalProperty],
   :rdfs/domain :cmns-doc/Reference,
   :rdfs/label "is public domain",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :idmp-dtp/hasBooleanValue,
   :skos/definition
   "indicates whether a reference source is available in the public domain",
   :skos/note
   ["Most reference sources other than regulatory submissions will be in the public domain. All regulatory submissions will typically be considered to not be in the public domain. If the reference source is in the public domain, the data elements referenced by the source could be made public. There may be a separate determination whether any portion of the record can be made public. This determination may vary depending on type of substance. Regardless, submitters of information should always explicitly indicate whether data should be considered confidential."
    "Company codes will only be released if the defining information is associated with the code in a public source such as Chemical Abstracts (CAS), a journal article, or a poster at scientific meeting attributable to the company."]})

(def isRelatedSubstanceTo
  "specifies a target substance with which the source has some relationship"
  {:db/ident :idmp-sub/isRelatedSubstanceTo,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 6.6.3",
   :idmp-sub/hasBusinessRules
   "The Equivalence Factor shall be less than or equal to 1,00. It is formed by dividing the molecular weight of the (parent) substance (active moiety)/molecular weight of the corresponding salt or salt hydrate or hydrate.",
   :idmp-sub/hasConformanceLevel :idmp-sub/ConformanceLevel-Conditional,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :idmp-sub/Substance,
   :rdfs/label "is related substance to",
   :rdfs/range :idmp-sub/Substance,
   :rdfs/subPropertyOf :cmns-ra/isRelatedTo,
   :skos/definition
   "specifies a target substance with which the source has some relationship",
   :skos/example
   "The active moiety of the salt amlodipine besilate hydrate (1:1:1) is the related substance amlodipine. The salt amlodipine besilate hydrate contains 69.8 percent w/w of amlodipine. Therefore, the equivalence factor is 0,698, meaning 10 mg amlodipine besilate hydrate salt corresponds to 6,98 (approx to 7 mg) amlodipine active moiety. The Equivalence Factor is captured by the element group Amount in combination with the element group Substance Relationship as Amount Text.",
   :skos/note
   "Relationships between substances such as the relationship between a salt form and its active moiety or parent substance should be captured. These relationships are often essential to the description of medicinal products, the basis of strength and the classification of substances. These relationships are often obvious and rules will be developed for specifying substances involved in each type of relationship. For example, the active moiety of all sodium salts would be the free acid, conversely the active moiety of a hydrochloride salt would be a free base."})

(def isStoichiometric
  "is a chemical substance that contains complete chemical structures and definite stoichiometric ratios among moieties"
  {:db/ident :idmp-sub/isStoichiometric,
   :dcterms/source
   "ISO/TS 19844:2018(E) Health informatics - Identification of medicinal products (IDMP) - Implementation guidelines for ISO 11238 for data elements and structures for the unique identification and exchange of regulated information on substances, clause 7.1.3",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-BL,
   :idmp-sub/hasConformanceLevel :idmp-sub/ConformanceLevel-Mandatory,
   :rdf/type [:owl/DatatypeProperty :owl/FunctionalProperty],
   :rdfs/domain :idmp-sub/ChemicalSubstance,
   :rdfs/label "is stoichiometric",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :idmp-dtp/hasBooleanValue,
   :skos/definition
   "is a chemical substance that contains complete chemical structures and definite stoichiometric ratios among moieties",
   :skos/note
   "Stoichiometry describes if a substance can be represented as single covalent structural moiety or a salt or solvate with a defined and constant ratio of ions or molecules and solvents. In the case of a substance consisting of one moiety (e.g. base, acid, ester) there is (per definition) one compound. In this case only one moiety shall be provided."})