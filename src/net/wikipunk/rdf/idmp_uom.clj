(ns net.wikipunk.rdf.idmp-uom
  "This ontology provides a semantic model representing common definitions for exchanging units of measure and measurement concepts that are commonly encountered in healthcare environments in support of information exchange in the healthcare environment. It is derived from the ISO 11240:2012 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement as well as from other ISO and OMG standards such as SysML."
  {:cmns-av/copyright ["Copyright (c) 2022 Pistoia Alliance, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/ISO11240-UnitsOfMeasurement.rdf",
   :dcterms/abstract
   "This ontology provides a semantic model representing common definitions for exchanging units of measure and measurement concepts that are commonly encountered in healthcare environments in support of information exchange in the healthcare environment. It is derived from the ISO 11240:2012 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement as well as from other ISO and OMG standards such as SysML.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :idmp-chg/hasMaturityLevel :idmp-chg/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/QuantitiesAndUnits/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/"
    "https://www.omg.org/spec/Commons/Designators/"
    "https://www.omg.org/spec/Commons/TextDatatype/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/Commons/Documents/"
    "https://www.omg.org/spec/Commons/CodesAndCodeSets/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://www.omg.org/spec/Commons/Collections/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/20221001/ISO11240-UnitsOfMeasurement/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "idmp-dtp"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/",
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
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11240-UnitsOfMeasurement/",
   :rdfa/prefix "idmp-uom",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11240-UnitsOfMeasurement/",
   :rdfs/label "ISO 11240 Units of Measurement (UOM) Ontology"})

(def CodeSystemFullName
  "official name of the code system"
  {:db/ident :idmp-uom/CodeSystemFullName,
   :dcterms/source
   "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 4.6.2.3 Code System, Table 3",
   :rdf/type :owl/Class,
   :rdfs/label "code system full name",
   :rdfs/subClassOf [{:owl/onClass :idmp-uom/UnitOfMeasureIdentificationScheme,
                      :owl/onProperty :cmns-dsg/isNameOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :idmp-dtp/CodeSystemName],
   :skos/definition "official name of the code system"})

(def CodeSystemIdentifier
  "globally unique identifier for the code system"
  {:db/ident :idmp-uom/CodeSystemIdentifier,
   :dcterms/source
   "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 4.6.2.3 Code System, Table 3",
   :rdf/type :owl/Class,
   :rdfs/label "code system identifier",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-id/identifies,
                      :owl/someValuesFrom :cmns-cds/CodeSet,
                      :rdf/type           :owl/Restriction}
                     :idmp-dtp/ObjectIdentifier],
   :skos/definition "globally unique identifier for the code system",
   :skos/note
   "Code System Identifier should take the form of an ISO Object Identifier (OID)."})

(def ISO11240LexiconCodeEntry
  "unique identifier for the unit of measurement entry within the ISO lexicon"
  {:db/ident :idmp-uom/ISO11240LexiconCodeEntry,
   :dcterms/source
   "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 4.6.2.2",
   :rdf/type :owl/Class,
   :rdfs/label "ISO 11240 lexicon code entry",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-dtp/hasLanguageCode,
                      :owl/someValuesFrom :lcc-lr/LanguageIdentifier,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :idmp-uom/hasRegionCode,
                      :owl/someValuesFrom :lcc-cr/GeographicRegionIdentifier,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-txt/Text,
                      :owl/onProperty  :cmns-dsg/hasDescription,
                      :rdf/type        :owl/Restriction}
                     :idmp-uom/UnitOfMeasureIdentifier],
   :skos/definition
   "unique identifier for the unit of measurement entry within the ISO lexicon",
   :skos/note
   "This code represents the unit of measurement concept and shall be used as the unit of measurement identifier in electronic communication. This identifier shall be a Unified Code for Units of Measure (UCUM). A valid code shall be provided for each concept included in an implementation of this International Standard. The OID of the coding system for the unit of measurement identifier is 2.16.840.1.113883.6.8."})

(def UnitOfMeasureIdentificationScheme
  "system for minting identifiers for things that specifies constraints on the structure of the unit of measure identifier"
  {:db/ident :idmp-uom/UnitOfMeasureIdentificationScheme,
   :dcterms/source
   "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 4.6.2.1",
   :rdf/type :owl/Class,
   :rdfs/label "unit of measure identification scheme",
   :rdfs/subClassOf [{:owl/onClass    :idmp-dtp/CodeSystemName,
                      :owl/onProperty :cmns-dsg/hasName,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-id/IdentificationScheme
                     {:owl/allValuesFrom :idmp-uom/UnitOfMeasureIdentifier,
                      :owl/onProperty    :cmns-col/hasMember,
                      :rdf/type          :owl/Restriction}
                     {:owl/onDataRange :cmns-txt/Text,
                      :owl/onProperty  :cmns-dsg/hasDescription,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :cmns-cds/CodeSet
                     {:owl/onClass    :idmp-uom/CodeSystemFullName,
                      :owl/onProperty :cmns-dsg/hasName,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "system for minting identifiers for things that specifies constraints on the structure of the unit of measure identifier"})

(def UnitOfMeasureIdentifier
  "unique identifier for the unit of measure in some system of units"
  {:db/ident :idmp-uom/UnitOfMeasureIdentifier,
   :dcterms/source
   "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 4.6.2.1",
   :rdf/type :owl/Class,
   :rdfs/label "unit of measure identifier",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-id/identifies,
     :owl/someValuesFrom :cmns-qtu/MeasurementUnit,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-col/isMemberOf,
     :owl/someValuesFrom :idmp-uom/UnitOfMeasureIdentificationScheme,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-col/compliesWith,
     :owl/someValuesFrom :idmp-uom/UnitOfMeasureIdentificationScheme,
     :rdf/type           :owl/Restriction}
    :cmns-id/Identifier
    :cmns-cds/CodeElement],
   :skos/definition
   "unique identifier for the unit of measure in some system of units"})

(def UnitOfPresentation
  "qualitative term describing the discrete countable entity in which a pharmaceutical product or manufactured item is presented, in cases where strength or quantity is expressed referring to one instance of this countable entity"
  {:db/ident :idmp-uom/UnitOfPresentation,
   :dcterms/source
   "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.34",
   :rdf/type :owl/Class,
   :rdfs/label "unit of presentation",
   :rdfs/subClassOf :cmns-qtu/MeasurementUnit,
   :skos/definition
   "qualitative term describing the discrete countable entity in which a pharmaceutical product or manufactured item is presented, in cases where strength or quantity is expressed referring to one instance of this countable entity",
   :skos/example
   ["To describe strength: a puff, spray or tablet 'contains 100 mcg per spray' (unit of presentation = spray)."
    "To describe quantity: a bottle, box or vial 'contains 100 ml per bottle' (unit of presentation = bottle)."],
   :skos/note
   "A unit of presentation can have the same name as another controlled vocabulary, such as a basic dose form or a container, but the two concepts are not equivalent, and each has a unique controlled vocabulary term identifier."})

(def hasRegionCode
  "indicates a geographic refinement of the language of this entry using ISO 3166"
  {:db/ident :idmp-uom/hasRegionCode,
   :dcterms/source
   "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 4.6.2.2 Unit of measurement Code Entry, Table 2",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-CD,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has region code",
   :rdfs/range :lcc-cr/GeographicRegionIdentifier,
   :rdfs/subPropertyOf :cmns-doc/refersTo,
   :skos/definition
   "indicates a geographic refinement of the language of this entry using ISO 3166"})

(def isSIQuantity
  "indicates that the unit of measure is an SI quantity, or is based on an SI quantity"
  {:db/ident :idmp-uom/isSIQuantity,
   :dcterms/source
   "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 4.6.2.1, Table 1",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-BL,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/domain :cmns-qtu/MeasurementUnit,
   :rdfs/label "is SI quantity",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :idmp-dtp/hasBooleanValue,
   :skos/definition
   "indicates that the unit of measure is an SI quantity, or is based on an SI quantity"})