(ns net.wikipunk.rdf.idmp-dtp
  "The harmonized datatypes ontology provides a semantic model representing the harmonized datatype definitions for exchanging basic concepts that are commonly encountered in healthcare environments in support of information exchange in the healthcare environment. It is derived from and largely conforms with the ISO 21090:2011 Health informatics - Harmonized data types for information interchange specification, which in turn is compliant with and uses the terminology, notations and datatypes defined in ISO/IEC 11404. The implementation of ISO 21090 included herein is an OWL 2 DL compliant representation of the datatypes defined in the ISO specification. This means that it is not a perfect match for the UML (Unified Modeling Language) representation given in the standard, as there is not a one-to-one alignment between UML and OWL. For details on mapping UML to OWL, please refer to the Object Management Group (OMG) specifications for (1) the Ontology Definition Metamode (ODM), available at https://www.omg.org/spec/ODM/, and (2) MOF to RDF Mapping (MOF2RDF), available at https://www.omg.org/spec/MOF2RDF/. As a consequence, this ontology is an indirectly conforming implementation that provides mappings to the XML Schema Datatypes that are supported in OWL 2 for some ISO 21090 datatypes, and encodes others in a manner that is OWL 2 DL compliant. References to ISO 11179 with respect to the representation of codes and code sets are faithful to the 3rd edition of 11179 as well as to revisions to that standard that are part of emerging work in the ISO JTC 1 SC32 WG2 working group to the degree possible. For more information on the ontologies on which this ontology depends, please refer to the Object Management Group (OMG) specifications for (1) the Commons Ontology Library (Commons) specification, available at https://www.omg.org/spec/COMMONS/, and (2) the Languages, Countries and Codes (LCC) specification, available at https://www.omg.org/spec/LCC/. Note that certain Commons ontologies referenced herein, including Documents and Quantities and Units, are not part of the Commons Ontology Library 1.0 Specification but are planned for inclusion in the 1.1 revision planned for late 2022 or early 2023."
  {:cmns-av/copyright ["Copyright (c) 2022 EDM Council, Inc."
                       "Copyright (c) 2022 Pistoia Alliance, Inc."],
   :cmns-av/explanatoryNote
   "The harmonized datatypes ontology provides a set of codes for datatypes and classes used in other standards in the health informatics family of standards, including those published by HL7. These codes need to be referenced via an annotation in the context of the IDMP ontologies due to the fact that any other approach would result in punning.",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/ISO21090-HarmonizedDatatypes.rdf",
   :dcterms/abstract
   "The harmonized datatypes ontology provides a semantic model representing the harmonized datatype definitions for exchanging basic concepts that are commonly encountered in healthcare environments in support of information exchange in the healthcare environment. It is derived from and largely conforms with the ISO 21090:2011 Health informatics - Harmonized data types for information interchange specification, which in turn is compliant with and uses the terminology, notations and datatypes defined in ISO/IEC 11404.\n\t\t\n\t\tThe implementation of ISO 21090 included herein is an OWL 2 DL compliant representation of the datatypes defined in the ISO specification. This means that it is not a perfect match for the UML (Unified Modeling Language) representation given in the standard, as there is not a one-to-one alignment between UML and OWL. For details on mapping UML to OWL, please refer to the Object Management Group (OMG) specifications for (1) the Ontology Definition Metamode (ODM), available at https://www.omg.org/spec/ODM/, and (2) MOF to RDF Mapping (MOF2RDF), available at https://www.omg.org/spec/MOF2RDF/. As a consequence, this ontology is an indirectly conforming implementation that provides mappings to the XML Schema Datatypes that are supported in OWL 2 for some ISO 21090 datatypes, and encodes others in a manner that is OWL 2 DL compliant. References to ISO 11179 with respect to the representation of codes and code sets are faithful to the 3rd edition of 11179 as well as to revisions to that standard that are part of emerging work in the ISO JTC 1 SC32 WG2 working group to the degree possible.\n\t\t\n\t\tFor more information on the ontologies on which this ontology depends, please refer to the Object Management Group (OMG) specifications for (1) the Commons Ontology Library (Commons) specification, available at https://www.omg.org/spec/COMMONS/, and (2) the Languages, Countries and Codes (LCC) specification, available at https://www.omg.org/spec/LCC/. Note that certain Commons ontologies referenced herein, including Documents and Quantities and Units, are not part of the Commons Ontology Library 1.0 Specification but are planned for inclusion in the 1.1 revision planned for late 2022 or early 2023.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :idmp-chg/hasMaturityLevel :idmp-chg/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://www.omg.org/spec/Commons/TextDatatype/"
    "https://www.omg.org/spec/Commons/CodesAndCodeSets/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://www.omg.org/spec/Commons/Designators/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://www.omg.org/spec/Commons/Documents/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/20221001/ISO21090-HarmonizedDatatypes/",
   :owl/versionInfo
   "The IDMP MVP version of this ontology is incomplete, and covers only the parts of the ISO 21090 standard required to support the MVP use cases.",
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
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "idmp-dtp"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/",
   :rdfa/prefix "idmp-dtp",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/",
   :rdfs/label "ISO 21090 Harmonized Datatypes Ontology"})

(def CodeSystemName
  "common name of the coding system"
  {:db/ident :idmp-dtp/CodeSystemName,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.5.2.4.3",
   :rdf/type :owl/Class,
   :rdfs/label "code system name",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-cds/CodeSet,
                      :owl/onProperty :cmns-dsg/isNameOf,
                      :rdf/type       :owl/Restriction}
                     :cmns-dsg/Name],
   :skos/definition "common name of the coding system",
   :skos/note
   "The purpose of a code system name is to assist an unaided human interpreter of a code value to understand which code system is referenced."})

(def CodingRationale
  "code element that indicates a reason why a particular CD has been provided, either as the root concept or as one of the translations."
  {:db/ident :idmp-dtp/CodingRationale,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.5.2.4.10",
   :rdf/type :owl/Class,
   :rdfs/label "coding rationale",
   :rdfs/subClassOf :idmp-dtp/DatatypeFlavor,
   :skos/definition
   "code element that indicates a reason why a particular CD has been provided, either as the root concept or as one of the translations.",
   :skos/note
   ["If populated, the value contained in this attribute shall be taken from this enumeration, composed from the HL7 CodingRationale code system."
    "A code is required when it is present in the instance to meet some constraints imposed on the instance by the context of use. Information Processing Entities shall not be required to mark a particular translation as required even though it is required by the context of use, but may do so. Information processing entities shall not reject instances because of the presence or absence of the codingRationale flag."
    "A code is deemed to be post-coded if the user does not assign the code when they first enter the data. codingRationale is not expected to act as a quality review marker on the quality of the coding or the translation processes."]})

(def CodingRationale-O
  "code indicating that the code descriptor represents the originally produced code"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Original",
   :cmns-txt/hasTextValue "O",
   :db/ident :idmp-dtp/CodingRationale-O,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.5.2.4.10",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/CodingRationale :owl/NamedIndividual],
   :rdfs/label "coding rationale O",
   :skos/definition
   "code indicating that the code descriptor represents the originally produced code"})

(def CodingRationale-OR
  "code indicating that the code descriptor is an originally produced code and is required by the specification describing the use of the coded concept"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Original and Required",
   :cmns-txt/hasTextValue "OR",
   :db/ident :idmp-dtp/CodingRationale-OR,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.5.2.4.10",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/CodingRationale :owl/NamedIndividual],
   :rdfs/label "coding rationale OR",
   :skos/definition
   "code indicating that the code descriptor is an originally produced code and is required by the specification describing the use of the coded concept"})

(def CodingRationale-P
  "code indicating that the code descriptor was post-coded from free text source"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Post-coded",
   :cmns-txt/hasTextValue "P",
   :db/ident :idmp-dtp/CodingRationale-P,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.5.2.4.10",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/CodingRationale :owl/NamedIndividual],
   :rdfs/label "coding rationale P",
   :skos/definition
   "code indicating that the code descriptor was post-coded from free text source"})

(def CodingRationale-PR
  "code indicating that the code descriptor is post-coded from free text source and is required by the specification describing the use of the coded concept"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Post-coded and Required",
   :cmns-txt/hasTextValue "PR",
   :db/ident :idmp-dtp/CodingRationale-PR,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.5.2.4.10",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/CodingRationale :owl/NamedIndividual],
   :rdfs/label "coding rationale PR",
   :skos/definition
   "code indicating that the code descriptor is post-coded from free text source and is required by the specification describing the use of the coded concept"})

(def CodingRationale-R
  "code indicating that the code descriptor is required by the specification describing the use of the coded concept"
  {:cmns-av/explanatoryNote
   "The exact form of the requirement is not specified here; it may be required by the specification directly, or it may arise as an indirect result of other conformance tools. More than one different requirement may exist simultaineously, so more than one code in a CD complex may be required.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Required",
   :cmns-txt/hasTextValue "R",
   :db/ident :idmp-dtp/CodingRationale-R,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.5.2.4.10",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/CodingRationale :owl/NamedIndividual],
   :rdfs/label "coding rationale R",
   :skos/definition
   "code indicating that the code descriptor is required by the specification describing the use of the coded concept"})

(def CodingRationaleEnumeration
  "singleton used for reference to the coding rationale code element class to avoid punning"
  {:db/ident :idmp-dtp/CodingRationaleEnumeration,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.5.2.4.10",
   :rdf/type [:idmp-dtp/CodingRationale :owl/NamedIndividual],
   :rdfs/label "coding rationale enumeration",
   :skos/definition
   "singleton used for reference to the coding rationale code element class to avoid punning"})

(def CompressionAlgorithm
  "code element that identifies an algorithm, if any, used to compress the raw byte data"
  {:cmns-av/synonym "compression algorithm enumeration",
   :db/ident :idmp-dtp/CompressionAlgorithm,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.8",
   :rdf/type :owl/Class,
   :rdfs/label "compression algorithm",
   :rdfs/subClassOf :idmp-dtp/DatatypeFlavor,
   :skos/definition
   "code element that identifies an algorithm, if any, used to compress the raw byte data",
   :skos/note
   ["If the attribute is null, the data are not compressed. Compression only applies to the binary form of the content."
    "If populated, the value of this attribute shall be taken from the HL7 CompressionAlgorithm code system."]})

(def CompressionAlgorithm-BZ
  "code indicating the bzip-2 compression format. See [http://www.bzip.org/] for more information."
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "bzip",
   :cmns-txt/hasTextValue "BZ",
   :db/ident :idmp-dtp/CompressionAlgorithm-BZ,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.8",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/CompressionAlgorithm :owl/NamedIndividual],
   :rdfs/label "compression algorithm BZ",
   :skos/definition
   "code indicating the bzip-2 compression format. See [http://www.bzip.org/] for more information."})

(def CompressionAlgorithm-DF
  "code indicating the deflate compressed data format as specified in IETF RFC 1951"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "deflate",
   :cmns-txt/hasTextValue "DF",
   :db/ident :idmp-dtp/CompressionAlgorithm-DF,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.8",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/CompressionAlgorithm :owl/NamedIndividual],
   :rdfs/label "compression algorithm DF",
   :skos/definition
   "code indicating the deflate compressed data format as specified in IETF RFC 1951"})

(def CompressionAlgorithm-GZ
  "code indicating a compressed data format that is compatible with the widely used GZIP utility as specified in IETF RFC 1952 (uses the deflate algorithm)"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "gzip",
   :cmns-txt/hasTextValue "GZ",
   :db/ident :idmp-dtp/CompressionAlgorithm-GZ,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.8",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/CompressionAlgorithm :owl/NamedIndividual],
   :rdfs/label "compression algorithm GZ",
   :skos/definition
   "code indicating a compressed data format that is compatible with the widely used GZIP utility as specified in IETF RFC 1952 (uses the deflate algorithm)"})

(def CompressionAlgorithm-Z
  "code indicating the original UNIX compress algorithm and file format using the LZC algorithm (a variant of LZW). Patent encumbered and less efficient than deflate"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "compress",
   :cmns-txt/hasTextValue "Z",
   :db/ident :idmp-dtp/CompressionAlgorithm-Z,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.8",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/CompressionAlgorithm :owl/NamedIndividual],
   :rdfs/label "compression algorithm Z",
   :skos/definition
   "code indicating the original UNIX compress algorithm and file format using the LZC algorithm (a variant of LZW). Patent encumbered and less efficient than deflate"})

(def CompressionAlgorithm-Z7
  "code indicating the 7z compression file format. See [http://www.7-zip.org/7z.html] for more information."
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Z7",
   :cmns-txt/hasTextValue "Z7",
   :db/ident :idmp-dtp/CompressionAlgorithm-Z7,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.8",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/CompressionAlgorithm :owl/NamedIndividual],
   :rdfs/label "compression algorithm Z7",
   :skos/definition
   "code indicating the 7z compression file format. See [http://www.7-zip.org/7z.html] for more information."})

(def CompressionAlgorithm-ZL
  "code indicating a compressed data format that also uses the deflate algorithm. Specified as IETF RFC 1950"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "zlib",
   :cmns-txt/hasTextValue "ZL",
   :db/ident :idmp-dtp/CompressionAlgorithm-ZL,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.8",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/CompressionAlgorithm :owl/NamedIndividual],
   :rdfs/label "compression algorithm ZL",
   :skos/definition
   "code indicating a compressed data format that also uses the deflate algorithm. Specified as IETF RFC 1950"})

(def CompressionAlgorithmEnumeration
  "singleton used for reference to the compression algorithm code element class to avoid punning"
  {:db/ident :idmp-dtp/CompressionAlgorithmEnumeration,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.8",
   :rdf/type [:idmp-dtp/CompressionAlgorithm :owl/NamedIndividual],
   :rdfs/label "compression algorithm enumeration",
   :skos/definition
   "singleton used for reference to the compression algorithm code element class to avoid punning"})

(def DatatypeCode-ANY
  "code representing the most basic, non-private datatype in the ISO 21090 datatype classification hierarchy"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-txt/hasTextValue "ANY",
   :db/ident :idmp-dtp/DatatypeCode-ANY,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.3.3.2",
   :rdf/type [:cmns-cds/CodeElement :owl/NamedIndividual],
   :rdfs/label "datatype code ANY",
   :skos/definition
   "code representing the most basic, non-private datatype in the ISO 21090 datatype classification hierarchy"})

(def DatatypeCode-BL
  "code for a boolean datatype"
  {:cmns-av/explanatoryNote "This code typically denotes an xsd:boolean value.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "boolean",
   :cmns-txt/hasTextValue "BL",
   :db/ident            :idmp-dtp/DatatypeCode-BL,
   :rdf/type            [:cmns-cds/CodeElement :owl/NamedIndividual],
   :rdfs/label          "datatype code BL",
   :skos/definition     "code for a boolean datatype"})

(def DatatypeCode-BL.NONNULL
  "code for a boolean datatype for which a value is required"
  {:cmns-av/explanatoryNote "This code typically denotes an xsd:boolean value.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "flavor that constrains boolean",
   :cmns-txt/hasTextValue "BL.NONNULL",
   :db/ident :idmp-dtp/DatatypeCode-BL.NONNULL,
   :rdf/type [:cmns-cds/CodeElement :owl/NamedIndividual],
   :rdfs/label "datatype code BL.NONNULL",
   :skos/definition
   "code for a boolean datatype for which a value is required"})

(def DatatypeCode-CD
  "code for a concept descriptor"
  {:cmns-av/explanatoryNote
   "This code typically denotes a complex concept that is a class that has inherent relationships and attributes.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "concept description",
   :cmns-txt/hasTextValue "CD",
   :db/ident            :idmp-dtp/DatatypeCode-CD,
   :rdf/type            [:cmns-cds/CodeElement :owl/NamedIndividual],
   :rdfs/label          "datatype code CD",
   :skos/definition     "code for a concept descriptor"})

(def DatatypeCode-ED
  "code for encapsulated data"
  {:cmns-av/explanatoryNote
   "This code may link to some external resource or denote a complex concept that is a class that has inherent relationships and attributes.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "encapsulated data",
   :cmns-txt/hasTextValue "ED",
   :db/ident :idmp-dtp/DatatypeCode-ED,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2",
   :rdf/type [:cmns-cds/CodeElement :owl/NamedIndividual],
   :rdfs/label "datatype code ED",
   :skos/definition "code for encapsulated data"})

(def DatatypeCode-EN
  "code for an entity name"
  {:cmns-av/explanatoryNote
   "This code denotes a name expressed as an xsd:string or rdf:langString, or a reified name that is an individual of type cmns-dsg:Name or of a subclass of cmns-dsg:Name such as a composite person name, organizational name, or other contextual name that may include provenance details such as the date such a name was last verified in addition to possible components of a name.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "entity name",
   :cmns-txt/hasTextValue "EN",
   :db/ident :idmp-dtp/DatatypeCode-EN,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.7.6",
   :rdf/type [:cmns-cds/CodeElement :owl/NamedIndividual],
   :rdfs/label "datatype code EN",
   :skos/definition "code for an entity name"})

(def DatatypeCode-HXIT
  "code representing the top-level datatype in the ISO 21090 datatype classification hierarchy"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-txt/hasTextValue "HXIT",
   :db/ident :idmp-dtp/DatatypeCode-HXIT,
   :rdf/type [:cmns-cds/CodeElement :owl/NamedIndividual],
   :rdfs/label "datatype code HXIT",
   :skos/definition
   "code representing the top-level datatype in the ISO 21090 datatype classification hierarchy"})

(def DatatypeCode-II
  "code for an instance identifier"
  {:cmns-av/explanatoryNote
   "This code typically denotes a complex concept, i.e., a named individual of type identifier that has inherent relationships and attributes, such as a named individual of type cmns-id:Individual or a subclass thereof.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "instance identifier",
   :cmns-txt/hasTextValue "II",
   :db/ident            :idmp-dtp/DatatypeCode-II,
   :rdf/type            [:cmns-cds/CodeElement :owl/NamedIndividual],
   :rdfs/label          "datatype code II",
   :skos/definition     "code for an instance identifier"})

(def DatatypeCode-INT
  "code for an integer datatype"
  {:cmns-av/explanatoryNote "This code denotes an xsd:integer value.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "integer",
   :cmns-txt/hasTextValue "INT",
   :db/ident            :idmp-dtp/DatatypeCode-INT,
   :rdf/type            [:cmns-cds/CodeElement :owl/NamedIndividual],
   :rdfs/label          "datatype code INT",
   :skos/definition     "code for an integer datatype"})

(def DatatypeCode-NM
  "code for a name"
  {:cmns-av/explanatoryNote
   "This code denotes a name expressed as an xsd:string or rdf:langString, or a reified name that is an individual of type cmns-dsg:Name.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "name",
   :cmns-txt/hasTextValue "NM",
   :db/ident            :idmp-dtp/DatatypeCode-NM,
   :rdf/type            [:cmns-cds/CodeElement :owl/NamedIndividual],
   :rdfs/label          "datatype code NM",
   :skos/definition     "code for a name"})

(def DatatypeCode-PQ
  "code for a physical quantity"
  {:cmns-av/explanatoryNote
   "This code denotes a complex concept, i.e., a named individual of type cmns-qtu:QuantityValue that has an inherent unit of measure and numeric value.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "physical quantity",
   :cmns-txt/hasTextValue "PQ",
   :db/ident            :idmp-dtp/DatatypeCode-PQ,
   :rdf/type            [:cmns-cds/CodeElement :owl/NamedIndividual],
   :rdfs/label          "datatype code PQ",
   :skos/definition     "code for a physical quantity"})

(def DatatypeCode-REAL
  "code for a real number datatype"
  {:cmns-av/explanatoryNote
   "This code denotes a real number typically expressed as an xsd:decimal, xsd:float, owl:rational, or owl:real datatype.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "real number",
   :cmns-txt/hasTextValue "REAL",
   :db/ident            :idmp-dtp/DatatypeCode-REAL,
   :rdf/type            [:cmns-cds/CodeElement :owl/NamedIndividual],
   :rdfs/label          "datatype code REAL",
   :skos/definition     "code for a real number datatype"})

(def DatatypeCode-ST
  "code for a string-valued datatype"
  {:cmns-av/explanatoryNote
   "This code denotes either an xsd:string or rdf:langString.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "string",
   :cmns-txt/hasTextValue "ST",
   :db/ident            :idmp-dtp/DatatypeCode-ST,
   :rdf/type            [:cmns-cds/CodeElement :owl/NamedIndividual],
   :rdfs/label          "datatype code ST",
   :skos/definition     "code for a string-valued datatype"})

(def DatatypeCode-STT
  "code for a datatype representing the condition of something as of some point in time"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "state",
   :cmns-txt/hasTextValue "STT",
   :db/ident :idmp-dtp/DatatypeCode-STT,
   :rdf/type [:cmns-cds/CodeElement :owl/NamedIndividual],
   :rdfs/label "datatype code STT",
   :skos/definition
   "code for a datatype representing the condition of something as of some point in time"})

(def DatatypeCode-TS
  "code for a timestamp datatype"
  {:cmns-av/explanatoryNote
   "This code denotes either a reified time instant (cmns:TimeInstant) or individual that is a member of a subclass of time instant, or an instance of cmns-dt:CombinedDateTime.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "timestamp",
   :cmns-txt/hasTextValue "TS",
   :db/ident            :idmp-dtp/DatatypeCode-TS,
   :rdf/type            [:cmns-cds/CodeElement :owl/NamedIndividual],
   :rdfs/label          "TS datatype code",
   :skos/definition     "code for a timestamp datatype"})

(def DatatypeFlavor
  "code element that describes a common constraint pattern on a datatype"
  {:db/ident :idmp-dtp/DatatypeFlavor,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 6.7.6",
   :rdf/type :owl/Class,
   :rdfs/label "datatype flavor",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-dtp/hasLevelInHierarchy,
                      :owl/someValuesFrom :xsd/nonNegativeInteger,
                      :rdf/type           :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "code element that describes a common constraint pattern on a datatype",
   :skos/note
   "Datatype flavors cannot introduce new attributes, new codes, default values, or any new definitional material. Datatype flavors may only make rules about what or how existing features of a class may be used."})

(def ISO21090-AnyDatatype
  "classifier that defines the basic properties of every data value"
  {:db/ident :idmp-dtp/ISO21090-AnyDatatype,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.3",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ANY,
   :rdf/type :owl/Class,
   :rdfs/label "ISO 21090 any datatype",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :idmp-dtp/NullFlavor,
                      :owl/onProperty :idmp-dtp/hasExceptionalValue,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :idmp-dtp/hasFlavorIdentifier,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :idmp-dtp/UpdateMode,
                      :owl/onProperty :idmp-dtp/hasUpdateMode,
                      :rdf/type       :owl/Restriction}
                     :idmp-dtp/ISO21090-Datatype],
   :skos/definition
   "classifier that defines the basic properties of every data value",
   :skos/note
   ["However exceptional values (nullFlavored values) may be of type ANY, except for the exceptional values that imply the NullFlavor INV, since this requires a type to be meaningful. Not all NullFlavors may be used with the type ANY."
    "This is conceptually an abstract type, meaning that no proper value can be just a data value without belonging to any concrete type. Every public concrete type is a specialization of this general abstract DataValue type."]})

(def ISO21090-Boolean
  "classifier that stands for the values of two-valued logic"
  {:db/ident :idmp-dtp/ISO21090-Boolean,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.4",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-BL,
   :rdf/type :owl/Class,
   :rdfs/label "ISO 21090 boolean",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :idmp-dtp/hasBooleanValue,
                      :rdf/type        :owl/Restriction}
                     :idmp-dtp/ISO21090-AnyDatatype],
   :skos/definition "classifier that stands for the values of two-valued logic",
   :skos/note
   "A BL value can be either true or false, or may have a nullFlavor, which makes this classifier essentially three-valued."})

(def ISO21090-BooleanNonNullDatatype
  "classifier that stands for the values of two-valued logic, for which a value is required"
  {:db/ident :idmp-dtp/ISO21090-BooleanNonNullDatatype,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.4",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-BL.NONNULL,
   :rdf/type :owl/Class,
   :rdfs/label "ISO 21090 boolean non-null datatype",
   :rdfs/subClassOf [{:owl/onProperty     :idmp-dtp/hasBooleanValue,
                      :owl/someValuesFrom :xsd/boolean,
                      :rdf/type           :owl/Restriction}
                     :idmp-dtp/ISO21090-Boolean],
   :skos/definition
   "classifier that stands for the values of two-valued logic, for which a value is required",
   :skos/note
   "BL.NONNULL is a constrained instance of BL that cannot have a nullFlavor. By implication, a null can never be used in the place of a BL.NONNULL, though this is not a rule that can be enforced by this International Standard."})

(def ISO21090-CharacterString
  "classifier that stands for text data, primarily intended for machine processing (e.g. sorting, querying, indexing, etc.) or direct display"
  {:db/ident :idmp-dtp/ISO21090-CharacterString,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.6",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ST,
   :rdf/type :owl/Class,
   :rdfs/label "ISO 21090 character string",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :cmns-txt/Text,
                      :owl/onProperty  :cmns-txt/hasTextValue,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :lcc-lr/LanguageIdentifier,
                      :owl/onProperty :idmp-dtp/hasLanguageCode,
                      :rdf/type       :owl/Restriction}
                     :idmp-dtp/ISO21090-AnyDatatype
                     {:owl/allValuesFrom :idmp-dtp/ISO21090-CharacterString,
                      :owl/onProperty    :idmp-dtp/hasTranslation,
                      :rdf/type          :owl/Restriction}],
   :skos/definition
   "classifier that stands for text data, primarily intended for machine processing (e.g. sorting, querying, indexing, etc.) or direct display",
   :skos/note
   "A ST shall have at least one character or else have a nullFlavor"})

(def ISO21090-CodeSet
  "set of codes for harmonized datatypes defined in the ISO 21090 specification"
  {:db/ident :idmp-dtp/ISO21090-CodeSet,
   :rdf/type [:cmns-cds/CodeSet :owl/NamedIndividual],
   :rdfs/label "ISO 21090 code set",
   :rdfs/seeAlso "https://www.iso.org/standard/35646.html",
   :skos/definition
   "set of codes for harmonized datatypes defined in the ISO 21090 specification"})

(def ISO21090-ConceptDescriptor
  "classifier that provides a reference to a concept defined in an external code system, terminology or ontology"
  {:db/ident :idmp-dtp/ISO21090-ConceptDescriptor,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.5.2",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-CD,
   :rdf/type :owl/Class,
   :rdfs/label "ISO 21090 concept descriptor",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-dtp/CodingRationale,
                      :owl/onProperty :cmns-cls/isCharacterizedBy,
                      :rdf/type       :owl/Restriction}
                     :idmp-dtp/ISO21090-AnyDatatype
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-dtp/ISO21090-ConceptDescriptor,
                      :owl/onProperty :idmp-dtp/hasSourceDescriptor,
                      :rdf/type       :owl/Restriction}
                     :cmns-cds/CodeElement
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :idmp-dtp/hasOriginalText,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :idmp-dtp/hasDisplayName,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-dtp/ISO21090-ConceptDescriptor,
                      :owl/onProperty :idmp-dtp/hasTranslation,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-dtp/ValueDomain,
                      :owl/onProperty :cmns-col/comprises,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "classifier that provides a reference to a concept defined in an external code system, terminology or ontology",
   :skos/note
   "A CD may contain a simple code – that is, a reference to a concept defined directly by the referenced code system, or it may contain an expression in some syntax defined by the referenced code system that can be meaningfully evaluated, e.g. the concept of a 'left foot' as a postcoordinated term built from the primary code 'FOOT' and the qualifier 'LEFT'."})

(def ISO21090-Datatype
  "classifier that provides the top-level, abstract definition of a datatype, which is set of distinct values, characterized by properties of those values, and by operations on those values, according to the ISO 20190 specification"
  {:db/ident :idmp-dtp/ISO21090-Datatype,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 3.7, 7.3.2",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-HXIT,
   :rdf/type :owl/Class,
   :rdfs/label "ISO 21090 datatype",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :idmp-dtp/hasControlInformationExtension,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :idmp-dtp/hasValidTimeHigh,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :idmp-dtp/hasValidTimeLow,
                      :rdf/type        :owl/Restriction}
                     :cmns-cls/Classifier
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :idmp-dtp/hasControlInformationRoot,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   "classifier that provides the top-level, abstract definition of a datatype, which is set of distinct values, characterized by properties of those values, and by operations on those values, according to the ISO 20190 specification",
   :skos/note
   ["Because of the way that the types are defined, a number of attributes of the datatypes have values with a type derived from HXIT (i.e., from this abstract class definition corresponding to HXIT). In these cases the HXIT attributes are constrained to null. The only case where the HXIT attributes are allowed within a datatype is on items in a collection (DSET, LIST, BAG, HIST). The use of these attributes is generally subject to further constraints in the specifications that make use of these types."
    "This concept corresponds to the HXIT datatype, which is abstract and private from a UML perspective - this datatype is not for use outside the datatypes in this International Standard."
    "Together, the root and extension identify a particular record of a real world event that may supply additional information about the value such as who made the change, when it was made, why it was made, what system originated the change. These attributes exist because sometimes this information is required, but the value is being represented in an external context that does not contain a proper relationship to the control information for the value itself. The record need not be directly or easily resolvable. Conformance statements may make additional statements about these two properties, or about how such a reference should be resolved. If a controlInformationExtension is provided, a ControlInformationRoot shall also be provided."]})

(def ISO21090-EncapsulatedData
  "classifier that stands for data that are primarily intended for human interpretation or for further machine processing outside the scope of the ISO 21090 International Standard"
  {:db/ident :idmp-dtp/ISO21090-EncapsulatedData,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.6",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ED,
   :rdf/type :owl/Class,
   :rdfs/label "ISO 21090 encapsulated data",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/base64Binary,
                      :owl/onProperty  :idmp-dtp/hasBinaryData,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :idmp-dtp/IntegrityCheckAlgorithm,
                      :owl/onProperty :idmp-dtp/hasIntegrityCheckAlgorithm,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :idmp-dtp/ISO21090-EncapsulatedData,
                      :owl/onProperty    :idmp-dtp/hasThumbnail,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :cmns-dsg/hasDescription,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :idmp-dtp/hasReferenceURL,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :idmp-dtp/CompressionAlgorithm,
                      :owl/onProperty :idmp-dtp/hasCompressionAlgorithm,
                      :rdf/type       :owl/Restriction}
                     :idmp-dtp/ISO21090-AnyDatatype
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/base64Binary,
                      :owl/onProperty  :idmp-dtp/hasIntegrityCheck,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :cmns-txt/Text,
                      :owl/onProperty  :cmns-txt/hasTextValue,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :lcc-lr/LanguageIdentifier,
                      :owl/onProperty :idmp-dtp/hasLanguageCode,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :idmp-dtp/ISO21090-EncapsulatedData,
                      :owl/onProperty    :idmp-dtp/hasTranslation,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :idmp-dtp/hasXMLEncodedData,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :cmns-cds/CodeElement,
                      :owl/onProperty :idmp-dtp/hasCharacterSet,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :cmns-cds/CodeElement,
                      :owl/onProperty :idmp-dtp/hasMediaType,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "classifier that stands for data that are primarily intended for human interpretation or for further machine processing outside the scope of the ISO 21090 International Standard",
   :skos/note
   ["The three representations of the ED data - as a sequence of characters, as a sequence of bytes, or as XML in a native XML format - are mutually incompatible and could also have been implemented as three specializations of an abstract ED supertype. However, doing so would complicate definition and implementation of the ED flavors and complicate the associated XML format (the additional of a mandatory xsi:type attribute) without significantly simplifying the overall implementation of ED."
    "This includes unformatted or formatted written language, multimedia data, or structured information as defined by a different standard (e.g. XML-signatures)."]})

(def ISO21090-EntityName
  "designation by which someone, some place, or something is known in the context of ISO 21090"
  {:db/ident :idmp-dtp/ISO21090-EntityName,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.7.6",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-EN,
   :rdf/type :owl/Class,
   :rdfs/label "ISO 21090 entity name",
   :rdfs/subClassOf [:cmns-cxtdsg/ContextualName
                     :idmp-dtp/ISO21090-AnyDatatype],
   :skos/definition
   "designation by which someone, some place, or something is known in the context of ISO 21090",
   :skos/note
   "From an ISO 21090 perspective, entity names may be simple names or include sequences of entity name parts. They add a 'use' code and a valid time range for information about when the name was used and how to choose between multiple aliases that may be valid at the same time."})

(def IntegrityCheckAlgorithm
  "code element that identifies the algorithm used to compute the integrityCheck value"
  {:cmns-av/synonym "integrity check algorithm enumeration",
   :db/ident :idmp-dtp/IntegrityCheckAlgorithm,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.10",
   :rdf/type :owl/Class,
   :rdfs/label "integrity check algorithm",
   :rdfs/subClassOf :idmp-dtp/DatatypeFlavor,
   :skos/definition
   "code element that identifies the algorithm used to compute the integrityCheck value",
   :skos/note
   "If populated, the value of this attribute shall be taken from the HL7 IntegrityCheckAlgorithm code system."})

(def IntegrityCheckAlgorithm-SHA1
  "code indicating the algorithm defined in FIPS PUB 180-1: Secure Hash Standard, As of April 17, 1995"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "secure hash algorithm - 1",
   :cmns-txt/hasTextValue "SHA1",
   :db/ident :idmp-dtp/IntegrityCheckAlgorithm-SHA1,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.10",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/IntegrityCheckAlgorithm :owl/NamedIndividual],
   :rdfs/label "integrity check algorithm SHA1",
   :skos/definition
   "code indicating the algorithm defined in FIPS PUB 180-1: Secure Hash Standard, As of April 17, 1995"})

(def IntegrityCheckAlgorithm-SHA256
  "code indicating the algorithm defined in FIPS PUB 180-2: Secure Hash Standard"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "secure hash algorithm - 256",
   :cmns-txt/hasTextValue "SHA256",
   :db/ident :idmp-dtp/IntegrityCheckAlgorithm-SHA256,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.10",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/IntegrityCheckAlgorithm :owl/NamedIndividual],
   :rdfs/label "integrity check algorithm SHA256",
   :skos/definition
   "code indicating the algorithm defined in FIPS PUB 180-2: Secure Hash Standard"})

(def IntegrityCheckAlgorithmEnumeration
  "singleton used for reference to the integrity check algorithm code element class to avoid punning"
  {:db/ident :idmp-dtp/IntegrityCheckAlgorithmEnumeration,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.10",
   :rdf/type [:idmp-dtp/IntegrityCheckAlgorithm :owl/NamedIndividual],
   :rdfs/label "integrity check algorithm enumeration",
   :skos/definition
   "singleton used for reference to the integrity check algorithm code element class to avoid punning"})

(def NullFlavor
  "code element that provides a general framework for handling incomplete data which is often encountered in healthcare information collection, use and analysis"
  {:cmns-av/synonym "null flavor enumeration",
   :db/ident :idmp-dtp/NullFlavor,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :rdf/type :owl/Class,
   :rdfs/label "null flavor",
   :rdfs/subClassOf :idmp-dtp/DatatypeFlavor,
   :skos/definition
   "code element that provides a general framework for handling incomplete data which is often encountered in healthcare information collection, use and analysis",
   :skos/note
   ["The nullFlavor property may also play a special role in conformance frameworks in specifications that make use of these types."
    "Some of the Null flavors are not generally applicable to all datatypes. The NullFlavors NINF, PINF, QS, and TRC shall only be used in association with QTY types. The NullFlavor UNC shall only be used with any type that has an originalText, and when UNC is used the originalText property shall be populated. When the NullFlavor DER is used, an expression shall be provided."]})

(def NullFlavor-ASKU
  "code for a value for which information was sought but not found (e.g. patient was asked but did not know)."
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Asked but unknown",
   :cmns-qtu/specializes :idmp-dtp/NullFlavor-UNK,
   :cmns-txt/hasTextValue "ASKU",
   :db/ident :idmp-dtp/NullFlavor-ASKU,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :idmp-dtp/hasLevelInHierarchy 3,
   :rdf/type [:idmp-dtp/NullFlavor :owl/NamedIndividual],
   :rdfs/label "null flavor ASKU",
   :skos/definition
   "code for a value for which information was sought but not found (e.g. patient was asked but did not know)."})

(def NullFlavor-DER
  "code for value for which no attempt has been made to encode the information correctly but the raw source information is represented (usually in originalText)"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Derived",
   :cmns-qtu/specializes :idmp-dtp/NullFlavor-INV,
   :cmns-txt/hasTextValue "DER",
   :db/ident :idmp-dtp/NullFlavor-DER,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :idmp-dtp/hasLevelInHierarchy 3,
   :rdf/type [:owl/NamedIndividual :idmp-dtp/NullFlavor],
   :rdfs/label "null flavor DER",
   :skos/definition
   "code for value for which no attempt has been made to encode the information correctly but the raw source information is represented (usually in originalText)"})

(def NullFlavor-INV
  "code for a value as represented in the instance that is not a member of the set of permitted data values in the constrained value domain of a variable"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Invalid",
   :cmns-qtu/specializes :idmp-dtp/NullFlavor-NI,
   :cmns-txt/hasTextValue "INV",
   :db/ident :idmp-dtp/NullFlavor-INV,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :idmp-dtp/hasLevelInHierarchy 2,
   :rdf/type [:idmp-dtp/NullFlavor :owl/NamedIndividual],
   :rdfs/label "null flavor INV",
   :skos/definition
   "code for a value as represented in the instance that is not a member of the set of permitted data values in the constrained value domain of a variable"})

(def NullFlavor-MSK
  "code for a value for which there is information available but it has not been provided by the sender due to security, privacy or other reasons"
  {:cmns-av/explanatoryNote
   ["There may be an alternate mechanism for gaining access to this information."
    "Warning: Using this Nullflavor does provide information that may be a breach of confidentiality, even though no detailed data are provided. Its primary purpose is for those circumstances where it is necessary to inform the receiver that the information does exist without providing any detail."],
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Masked",
   :cmns-qtu/specializes :idmp-dtp/NullFlavor-NI,
   :cmns-txt/hasTextValue "MSK",
   :db/ident :idmp-dtp/NullFlavor-MSK,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :idmp-dtp/hasLevelInHierarchy 2,
   :rdf/type [:owl/NamedIndividual :idmp-dtp/NullFlavor],
   :rdfs/label "null flavor MSK",
   :skos/definition
   "code for a value for which there is information available but it has not been provided by the sender due to security, privacy or other reasons"})

(def NullFlavor-NA
  "code for a value for which no proper value is applicable in this context (e.g. last menstrual period for a male)"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Not applicable",
   :cmns-qtu/specializes :idmp-dtp/NullFlavor-NI,
   :cmns-txt/hasTextValue "NA",
   :db/ident :idmp-dtp/NullFlavor-NA,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :idmp-dtp/hasLevelInHierarchy 2,
   :rdf/type [:idmp-dtp/NullFlavor :owl/NamedIndividual],
   :rdfs/label "null flavor NA",
   :skos/definition
   "code for a value for which no proper value is applicable in this context (e.g. last menstrual period for a male)"})

(def NullFlavor-NASK
  "code for a value for which information has not been sought (e.g. patient was not asked)"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Not asked",
   :cmns-qtu/specializes :idmp-dtp/NullFlavor-UNK,
   :cmns-txt/hasTextValue "NASK",
   :db/ident :idmp-dtp/NullFlavor-NASK,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :idmp-dtp/hasLevelInHierarchy 3,
   :rdf/type [:owl/NamedIndividual :idmp-dtp/NullFlavor],
   :rdfs/label "null flavor NASK",
   :skos/definition
   "code for a value for which information has not been sought (e.g. patient was not asked)"})

(def NullFlavor-NAV
  "code for a value for which information is not available at this time but it is expected that it would be available later"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Temporarily unavailable",
   :cmns-qtu/specializes :idmp-dtp/NullFlavor-ASKU,
   :cmns-txt/hasTextValue "NAV",
   :db/ident :idmp-dtp/NullFlavor-NAV,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :idmp-dtp/hasLevelInHierarchy 4,
   :rdf/type [:owl/NamedIndividual :idmp-dtp/NullFlavor],
   :rdfs/label "null flavor NAV",
   :skos/definition
   "code for a value for which information is not available at this time but it is expected that it would be available later"})

(def NullFlavor-NI
  "code for a value that is exceptional (missing, omitted, incomplete, improper)"
  {:cmns-av/explanatoryNote
   "No information as to the reason for being an exceptional value is provided. This is the most general exceptional value. It is also the default exceptional value.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "No information",
   :cmns-txt/hasTextValue "NI",
   :db/ident :idmp-dtp/NullFlavor-NI,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/NullFlavor :owl/NamedIndividual],
   :rdfs/label "null flavor NI",
   :skos/definition
   "code for a value that is exceptional (missing, omitted, incomplete, improper)"})

(def NullFlavor-NINF
  "code for a value that is part of a value domain including a negative infinity of numbers"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Negative infinity",
   :cmns-qtu/specializes :idmp-dtp/NullFlavor-OTH,
   :cmns-txt/hasTextValue "NINF",
   :db/ident :idmp-dtp/NullFlavor-NINF,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :idmp-dtp/hasLevelInHierarchy 4,
   :rdf/type [:idmp-dtp/NullFlavor :owl/NamedIndividual],
   :rdfs/label "null flavor NINF",
   :skos/definition
   "code for a value that is part of a value domain including a negative infinity of numbers"})

(def NullFlavor-OTH
  "code for an actual value that is not a member of the set of permitted data values in the constrained value domain of a variable (e.g. concept not provided by required code system)"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Other",
   :cmns-qtu/specializes :idmp-dtp/NullFlavor-INV,
   :cmns-txt/hasTextValue "OTH",
   :db/ident :idmp-dtp/NullFlavor-OTH,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :idmp-dtp/hasLevelInHierarchy 3,
   :rdf/type [:owl/NamedIndividual :idmp-dtp/NullFlavor],
   :rdfs/label "null flavor OTH",
   :skos/definition
   "code for an actual value that is not a member of the set of permitted data values in the constrained value domain of a variable (e.g. concept not provided by required code system)"})

(def NullFlavor-PINF
  "code for a value that is part of a value domain including a positive infinity of numbers"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Positive infinity",
   :cmns-qtu/specializes :idmp-dtp/NullFlavor-OTH,
   :cmns-txt/hasTextValue "PINF",
   :db/ident :idmp-dtp/NullFlavor-PINF,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :idmp-dtp/hasLevelInHierarchy 4,
   :rdf/type [:idmp-dtp/NullFlavor :owl/NamedIndividual],
   :rdfs/label "null flavor PINF",
   :skos/definition
   "code for a value that is part of a value domain including a positive infinity of numbers"})

(def NullFlavor-QS
  "code for a value for which a specific quantity is not known, but is known to be non-zero and is not specified because it makes up the bulk of the material"
  {:cmns-av/explanatoryNote
   "'Add 10 mg of ingredient X, 50 mg of ingredient Y, and sufficient quantity of water to 100 ml.' The null flavor would be used to express the quantity of water.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Sufficient quantity",
   :cmns-qtu/specializes :idmp-dtp/NullFlavor-UNK,
   :cmns-txt/hasTextValue "QS",
   :db/ident :idmp-dtp/NullFlavor-QS,
   :idmp-dtp/hasLevelInHierarchy 3,
   :rdf/type [:idmp-dtp/NullFlavor :owl/NamedIndividual],
   :rdfs/label "null flavor QS",
   :skos/definition
   "code for a value for which a specific quantity is not known, but is known to be non-zero and is not specified because it makes up the bulk of the material"})

(def NullFlavor-TRC
  "code for a value for which content is greater than zero, but too small to be quantified"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Trace",
   :cmns-qtu/specializes :idmp-dtp/NullFlavor-UNK,
   :cmns-txt/hasTextValue "TRC",
   :db/ident :idmp-dtp/NullFlavor-TRC,
   :idmp-dtp/hasLevelInHierarchy 3,
   :rdf/type [:idmp-dtp/NullFlavor :owl/NamedIndividual],
   :rdfs/label "null flavor TRC",
   :skos/definition
   "code for a value for which content is greater than zero, but too small to be quantified"})

(def NullFlavor-UNC
  "code for a value for which an actual value may exist, but it must be derived from the information provided (usually an expression is provided directly)"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Unencoded",
   :cmns-qtu/specializes :idmp-dtp/NullFlavor-INV,
   :cmns-txt/hasTextValue "UNC",
   :db/ident :idmp-dtp/NullFlavor-UNC,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :idmp-dtp/hasLevelInHierarchy 3,
   :rdf/type [:idmp-dtp/NullFlavor :owl/NamedIndividual],
   :rdfs/label "null flavor UNC",
   :skos/definition
   "code for a value for which an actual value may exist, but it must be derived from the information provided (usually an expression is provided directly)"})

(def NullFlavor-UNK
  "code for a value for which proper value is applicable, but not known"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Unknown",
   :cmns-qtu/specializes :idmp-dtp/NullFlavor-NI,
   :cmns-txt/hasTextValue "UNK",
   :db/ident :idmp-dtp/NullFlavor-UNK,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :idmp-dtp/hasLevelInHierarchy 2,
   :rdf/type [:idmp-dtp/NullFlavor :owl/NamedIndividual],
   :rdfs/label "null flavor UNK",
   :skos/definition
   "code for a value for which proper value is applicable, but not known"})

(def NullFlavorEnumeration
  "singleton used for reference to the null flavor code element class to avoid punning"
  {:db/ident :idmp-dtp/NullFlavorEnumeration,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :rdf/type [:idmp-dtp/NullFlavor :owl/NamedIndividual],
   :rdfs/label "null flavor enumeration",
   :skos/definition
   "singleton used for reference to the null flavor code element class to avoid punning"})

(def OID-2.16.840.1.113883.5.1008
  "object identifier for the null flavor enumeration"
  {:cmns-col/compliesWith :idmp-dtp/ISO21090-CodeSet,
   :cmns-id/identifies :idmp-dtp/NullFlavorEnumeration,
   :cmns-txt/hasTextValue "2.16.840.1.113883.5.1008",
   :db/ident :idmp-dtp/OID-2.16.840.1.113883.5.1008,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :rdf/type [:idmp-dtp/ObjectIdentifier :owl/NamedIndividual],
   :rdfs/label "null flavor enumeration object identifier",
   :skos/definition "object identifier for the null flavor enumeration"})

(def OID-2.16.840.1.113883.5.1009
  "object identifier for the compression algorithm enumeration"
  {:cmns-col/compliesWith :idmp-dtp/ISO21090-CodeSet,
   :cmns-id/identifies :idmp-dtp/CompressionAlgorithmEnumeration,
   :cmns-txt/hasTextValue "2.16.840.1.113883.5.1009",
   :db/ident :idmp-dtp/OID-2.16.840.1.113883.5.1009,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.8",
   :rdf/type [:idmp-dtp/ObjectIdentifier :owl/NamedIndividual],
   :rdfs/label "compression algorithm enumeration object identifier",
   :skos/definition
   "object identifier for the compression algorithm enumeration"})

(def OID-2.16.840.1.113883.5.1010
  "object identifier for the integrity check algorithm enumeration"
  {:cmns-col/compliesWith :idmp-dtp/ISO21090-CodeSet,
   :cmns-id/identifies :idmp-dtp/IntegrityCheckAlgorithmEnumeration,
   :cmns-txt/hasTextValue "2.16.840.1.113883.5.1010",
   :db/ident :idmp-dtp/OID-2.16.840.1.113883.5.1010,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.8",
   :rdf/type [:idmp-dtp/ObjectIdentifier :owl/NamedIndividual],
   :rdfs/label "integrity check algorithm enumeration object identifier",
   :skos/definition
   "object identifier for the integrity check algorithm enumeration"})

(def OID-2.16.840.1.113883.5.1074
  "object identifier for the coding rationale enumeration"
  {:cmns-col/compliesWith :idmp-dtp/ISO21090-CodeSet,
   :cmns-id/identifies :idmp-dtp/CodingRationaleEnumeration,
   :cmns-txt/hasTextValue "2.16.840.1.113883.5.1074",
   :db/ident :idmp-dtp/OID-2.16.840.1.113883.5.1074,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.5.2.4.10",
   :rdf/type [:idmp-dtp/ObjectIdentifier :owl/NamedIndividual],
   :rdfs/label "coding rationale enumeration object identifier",
   :skos/definition "object identifier for the coding rationale enumeration"})

(def OID-2.16.840.1.113883.5.57
  "object identifier for the update mode enumeration"
  {:cmns-av/abbreviation "update mode OID",
   :cmns-col/compliesWith :idmp-dtp/ISO21090-CodeSet,
   :cmns-id/identifies :idmp-dtp/UpdateModeEnumeration,
   :cmns-txt/hasTextValue "2.16.840.1.113883.5.57",
   :db/ident :idmp-dtp/OID-2.16.840.1.113883.5.57,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.3.3.2",
   :rdf/type [:idmp-dtp/ObjectIdentifier :owl/NamedIndividual],
   :rdfs/label "update mode enumeration object identifier",
   :skos/definition "object identifier for the update mode enumeration"})

(def ObjectIdentifier
  "globally unique identifier of a data object as defined in ISO/IEC 8824-2"
  {:cmns-av/abbreviation "OID",
   :cmns-av/adaptedFrom
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 4",
   :cmns-av/explanatoryNote
   "An object identifier (OID) is a unique alphanumeric/numeric identifier registered under the ISO/IEC 8824-2 registration standard to reference a specific object or object class.",
   :db/ident :idmp-dtp/ObjectIdentifier,
   :rdf/type :owl/Class,
   :rdfs/label "object identifier",
   :rdfs/subClassOf :cmns-id/Identifier,
   :skos/definition
   "globally unique identifier of a data object as defined in ISO/IEC 8824-2"})

(def UpdateMode
  "code element that allows a sending system to identify the role that thevcattribute plays in processing the instance that is being represented"
  {:cmns-av/synonym "update mode enumeration",
   :db/ident :idmp-dtp/UpdateMode,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.3.3.2",
   :rdf/type :owl/Class,
   :rdfs/label "update mode",
   :rdfs/subClassOf :idmp-dtp/DatatypeFlavor,
   :skos/definition
   "code element that allows a sending system to identify the role that thevcattribute plays in processing the instance that is being represented",
   :skos/note
   "If populated, the value of this attribute shall be taken from the HL7 UpdateMode code system."})

(def UpdateMode-A
  "code indicating that an item was (or is to be) added, having not been present immediately before"
  {:cmns-av/explanatoryNote
   "If it is already present, this may be treated as an error condition.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Add",
   :cmns-txt/hasTextValue "A",
   :db/ident :idmp-dtp/UpdateMode-A,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.3.3.2",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:owl/NamedIndividual :idmp-dtp/UpdateMode],
   :rdfs/label "update mode A",
   :skos/definition
   "code indicating that an item was (or is to be) added, having not been present immediately before"})

(def UpdateMode-AR
  "code indicating that an item was (or is to be) either added or replaced"
  {:cmns-av/explanatoryNote
   "No assertion is made as to whether the item previously existed.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Add or replace",
   :cmns-txt/hasTextValue "AR",
   :db/ident :idmp-dtp/UpdateMode-AR,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.3.3.2",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:owl/NamedIndividual :idmp-dtp/UpdateMode],
   :rdfs/label "update mode AR",
   :skos/definition
   "code indicating that an item was (or is to be) either added or replaced"})

(def UpdateMode-D
  "code indicating that an item item was (or is to be) removed (sometimes referred to as deleted)"
  {:cmns-av/explanatoryNote
   "If the item is part of a collection, delete any matching items.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Remove",
   :cmns-txt/hasTextValue "D",
   :db/ident :idmp-dtp/UpdateMode-D,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.3.3.2",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:owl/NamedIndividual :idmp-dtp/UpdateMode],
   :rdfs/label "update mode D",
   :skos/definition
   "code indicating that an item item was (or is to be) removed (sometimes referred to as deleted)"})

(def UpdateMode-K
  "code indicating that the item is part of the identifying information for the object that contains it"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Key",
   :cmns-txt/hasTextValue "K",
   :db/ident :idmp-dtp/UpdateMode-K,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.3.3.2",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/UpdateMode :owl/NamedIndividual],
   :rdfs/label "update mode K",
   :skos/definition
   "code indicating that the item is part of the identifying information for the object that contains it"})

(def UpdateMode-N
  "code indicating that there was (or is to be) no change to the item"
  {:cmns-av/explanatoryNote
   "This is primarily used when this element has not changed, but other attributes in the instance have changed.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "No change",
   :cmns-txt/hasTextValue "N",
   :db/ident :idmp-dtp/UpdateMode-N,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.3.3.2",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:owl/NamedIndividual :idmp-dtp/UpdateMode],
   :rdfs/label "update mode N",
   :skos/definition
   "code indicating that there was (or is to be) no change to the item"})

(def UpdateMode-R
  "code indicating that an item existed previously and has been (or is to be) revised"
  {:cmns-av/explanatoryNote
   "If an item does not already exist, this may be treated as an error condition.",
   :cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Replace",
   :cmns-txt/hasTextValue "R",
   :db/ident :idmp-dtp/UpdateMode-R,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.3.3.2",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:owl/NamedIndividual :idmp-dtp/UpdateMode],
   :rdfs/label "update mode R",
   :skos/definition
   "code indicating that an item existed previously and has been (or is to be) revised"})

(def UpdateMode-U
  "code indicating that it is not specified whether or what kind of change has occurred to the item, or whether the item is present as a reference or identifying property"
  {:cmns-col/isMemberOf :idmp-dtp/ISO21090-CodeSet,
   :cmns-dsg/hasDescription "Unknown",
   :cmns-txt/hasTextValue "U",
   :db/ident :idmp-dtp/UpdateMode-U,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.3.3.2",
   :idmp-dtp/hasLevelInHierarchy 1,
   :rdf/type [:idmp-dtp/UpdateMode :owl/NamedIndividual],
   :rdfs/label "update mode U",
   :skos/definition
   "code indicating that it is not specified whether or what kind of change has occurred to the item, or whether the item is present as a reference or identifying property"})

(def UpdateModeEnumeration
  "singleton used for reference to the update mode code element class to avoid punning"
  {:db/ident :idmp-dtp/UpdateModeEnumeration,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.3.3.2",
   :rdf/type [:idmp-dtp/UpdateMode :owl/NamedIndividual],
   :rdfs/label "update mode enumeration",
   :skos/definition
   "singleton used for reference to the update mode code element class to avoid punning"})

(def ValueDomain
  "set of permissible values"
  {:cmns-av/abbreviation "VD",
   :cmns-av/synonym "value set",
   :db/ident :idmp-dtp/ValueDomain,
   :dcterms/source
   ["ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.5.2.4.5"
    "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15"],
   :rdf/type :owl/Class,
   :rdfs/label "value domain",
   :rdfs/subClassOf [:cmns-col/Collection
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :idmp-dtp/hasPublicationDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :idmp-dtp/hasVersion,
                      :rdf/type        :owl/Restriction}],
   :skos/definition "set of permissible values",
   :skos/note
   ["The permissible values may either be enumerated or expressed via a description."
    "The value domain provides representation, but has no implication as to what data element concept the values might be associated with nor what the values mean."]})

(def ValueDomainIdentifier
  "identifier that allows unambiguous reference to a value set"
  {:db/ident :idmp-dtp/ValueDomainIdentifier,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.5.2.4.5",
   :rdf/type :owl/Class,
   :rdfs/label "value domain identifier",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-id/identifies,
                      :owl/someValuesFrom :idmp-dtp/ValueDomain,
                      :rdf/type           :owl/Restriction}
                     :cmns-id/Identifier],
   :skos/definition
   "identifier that allows unambiguous reference to a value set",
   :skos/note
   "Where either ISO or HL7 have assigned an identifying name to a value set, then that name shall be used."})

(def hasBinaryData
  "indicates a simple sequence of byte values that contains the content"
  {:db/ident :idmp-dtp/hasBinaryData,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.2",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has binary data",
   :rdfs/range :xsd/base64Binary,
   :skos/definition
   "indicates a simple sequence of byte values that contains the content"})

(def hasBooleanValue
  "indicates the value of the BL"
  {:db/ident :idmp-dtp/hasBooleanValue,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.4.3.1",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-BL,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/label "has boolean value",
   :rdfs/range :xsd/boolean,
   :skos/definition "indicates the value of the BL"})

(def hasCharacterSet
  "identifies an Internet Assigned Numbers Authority (IANA) Charset Registered character set and character encoding for character-based encoding types"
  {:db/ident :idmp-dtp/hasCharacterSet,
   :dcterms/source "ISO 11240:2021, clause 7.4.2.3.6",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-CD,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/label "has character set",
   :rdfs/range :cmns-cds/CodeElement,
   :rdfs/subPropertyOf :cmns-doc/refersTo,
   :skos/definition
   "identifies an Internet Assigned Numbers Authority (IANA) Charset Registered character set and character encoding for character-based encoding types",
   :skos/note
   "Whenever the content of the ED is character type data in any form, the charset property needs to be known. If the content is provided directly in the value attribute, then the charset shall be a known character set consistent with the String Character Set. If the content is provided as a reference, and the access method does not provide the charset for the content (such as by a mime header), then the charset shall be conveyed as part of the ED."})

(def hasCompressionAlgorithm
  "indicates the algorithm, if any, used on the raw byte data for compression purposes"
  {:db/ident :idmp-dtp/hasCompressionAlgorithm,
   :dcterms/source "ISO 11240:2021, clause 7.4.2.3.6",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-CD,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/label "has compression algorithm",
   :rdfs/range :idmp-dtp/CompressionAlgorithm,
   :rdfs/subPropertyOf :cmns-doc/refersTo,
   :skos/definition
   "indicates the algorithm, if any, used on the raw byte data for compression purposes"})

(def hasControlInformationExtension
  "indicates the extension of the identifier of the event associated with setting the datatype to its specified value"
  {:db/ident :idmp-dtp/hasControlInformationExtension,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.2.3.4",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ST,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/domain :idmp-dtp/ISO21090-Datatype,
   :rdfs/label "has control information extension",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "indicates the extension of the identifier of the event associated with setting the datatype to its specified value"})

(def hasControlInformationRoot
  "indicates the root of the identifier of the event associated with setting the datatype to its specified value"
  {:db/ident :idmp-dtp/hasControlInformationRoot,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.2.3.3",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ST,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/domain :idmp-dtp/ISO21090-Datatype,
   :rdfs/label "has control information root",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "indicates the root of the identifier of the event associated with setting the datatype to its specified value"})

(def hasDisplayName
  "indicates a name, title, or representation for the code or expression as it exists in the code system"
  {:db/ident :idmp-dtp/hasDisplayName,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.5.2.4.7",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ST,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :idmp-dtp/ISO21090-AnyDatatype,
   :rdfs/label "has display name",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "indicates a name, title, or representation for the code or expression as it exists in the code system",
   :skos/note
   "If populated, the displayName shall be a valid human readable representation of the concept as defined by the code system at the time of data entry."})

(def hasExceptionalValue
  "indicates the reason if a value is not proper"
  {:db/ident :idmp-dtp/hasExceptionalValue,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.3.3.1",
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/domain :idmp-dtp/ISO21090-AnyDatatype,
   :rdfs/label "has exceptional value",
   :rdfs/range :idmp-dtp/NullFlavor,
   :rdfs/subPropertyOf :cmns-dsg/describes,
   :skos/definition "indicates the reason if a value is not proper"})

(def hasFlavorIdentifier
  "indicates the root of the identifier of the event associated with setting the datatype to its specified value"
  {:db/ident :idmp-dtp/hasFlavorIdentifier,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.2.3.3",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ST,
   :rdf/type [:owl/DatatypeProperty :owl/FunctionalProperty],
   :rdfs/domain :idmp-dtp/ISO21090-AnyDatatype,
   :rdfs/label "has flavor identifier",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "indicates the root of the identifier of the event associated with setting the datatype to its specified value",
   :skos/note
   "Signals the imposition of one or more sets of constraints on the datatype. The sole purpose of specifying that a constraint that has been used to further constrain the datatype is to support validation of the instance: a validation engine can look up the rules expressed for the specified flavors and confirm that the instance conforms to the rules for the flavor. No other processing should depend on the content of the flavor attribute. No other semantic or computational use shall depend on the value of this property. If this value is populated,the datatype flavor(s) shall be a valid constraint on the type of value."})

(def hasIntegerValue
  "indicates the value of the INT"
  {:db/ident :idmp-dtp/hasIntegerValue,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.8.3.3",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-INT,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/label "has integer value",
   :rdfs/range :xsd/integer,
   :skos/definition "indicates the value of the INT"})

(def hasIntegrityCheck
  "indicates a checksum calculated over the binary data"
  {:db/ident :idmp-dtp/hasIntegrityCheck,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.9",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/label "has integrity check",
   :rdfs/range :xsd/base64Binary,
   :rdfs/subPropertyOf :idmp-dtp/hasBinaryData,
   :skos/definition "indicates a checksum calculated over the binary data",
   :skos/note
   "The purpose of this property, when communicated with a reference is for anyone to validate later whether or not the reference still resolved to the same content that the reference resolved to when the encapsulated data value with reference was created. If the attribute is null, there is no integrityCheck. It is an error if the data resolved through the reference does not match the integrity check."})

(def hasIntegrityCheckAlgorithm
  "indicates the algorithm used to compute the integrityCheck value"
  {:db/ident :idmp-dtp/hasIntegrityCheckAlgorithm,
   :dcterms/source "ISO 11240:2021, clause 7.4.2.3.10",
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/label "has integrity check algorithm",
   :rdfs/range :idmp-dtp/IntegrityCheckAlgorithm,
   :rdfs/subPropertyOf :cmns-doc/refersTo,
   :skos/definition
   "indicates the algorithm used to compute the integrityCheck value"})

(def hasLanguageCode
  "indicates the human language of the content"
  {:db/ident :idmp-dtp/hasLanguageCode,
   :dcterms/source "ISO 11240:2021, clause 7.4.6.3.2",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-CD,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has language code",
   :rdfs/range :lcc-lr/LanguageIdentifier,
   :rdfs/subPropertyOf :cmns-doc/refersTo,
   :skos/definition "indicates the human language of the content",
   :skos/note
   "Valid codes are taken from the IETF RFC 3066. If this attribute is null, the language may be inferred from elsewhere, either from the context or from unicode language tags, for example. Conformance profiles should define defaulting rules for language for a given usage environment of this International Standard. While language tags usually alter the meaning of the text, the language does not alter the meaning of the characters in the text."})

(def hasLevelInHierarchy
  "indicates a position of the concept with respect to the hierarchy of the terminology"
  {:db/ident :idmp-dtp/hasLevelInHierarchy,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.1.4",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/label "has level in hierarchy",
   :rdfs/range :xsd/nonNegativeInteger,
   :skos/definition
   "indicates a position of the concept with respect to the hierarchy of the terminology",
   :skos/note
   ["The hierarchy in the enumeration is an important part of the specification. Although the enumerations are defined as linear lists within ISO/IEC 11404 and the UML definitions, any information processing entity that asserts direct or indirect conformance with this International Standard shall conform to the relationships when evaluating meaning (implication) within the enumeration. In addition, this International Standard occasionally refers to the relationships within the narrative when defining the outcome of some operations."
    "All concepts marked with the same level and not separated by a concept with a level of less numerical magnitude are siblings, and all concepts that follow after another concept with a higher level value are children of that concept."]})

(def hasMediaType
  "identifies the type of the encapsulated data and can be used to determine a method to interpret or render the content"
  {:db/ident :idmp-dtp/hasMediaType,
   :dcterms/source "ISO 11240:2021, clause 7.4.2.3.5",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-CD,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/label "has media type",
   :rdfs/range :cmns-cds/CodeElement,
   :rdfs/subPropertyOf :cmns-doc/refersTo,
   :skos/definition
   "identifies the type of the encapsulated data and can be used to determine a method to interpret or render the content",
   :skos/note
   ["If the content is compressed using a specified compression algorithm, the mediaType shall refer the mediaType of the uncompressed data, whether the data are accessed by reference or not."
    "The IANA defined domain of media types is established by the IETF RFCs 2045 and 2046. mediaType has a default value of text/plain and cannot be null. If the media type is different to text/plain, the mediaType attribute shall be populated."]})

(def hasOriginalText
  "indicates the text as seen and/or selected by the user who entered the data which represents the intended meaning of the user"
  {:db/ident :idmp-dtp/hasOriginalText,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.5.2.4.7",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ED,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :idmp-dtp/ISO21090-AnyDatatype,
   :rdfs/label "has original text",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "indicates the text as seen and/or selected by the user who entered the data which represents the intended meaning of the user",
   :skos/note
   ["The original text shall be an excerpt of the relevant information in the original sources, rather than a pointer or exact reproduction. Thus the original text shall be represented in plain text form. In specific circumstances, when the context of use is clearly described, the originalText may be a reference to some other text artefact for which the resolution scope is clearly described."
    "Local implementations might influence what is required to represent that original text."]})

(def hasPublicationDateTime
  "indicates a date and time associated with the publication of something, such as a particular version of a value set"
  {:db/ident :idmp-dtp/hasPublicationDateTime,
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-TS,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has publication date and time",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :rdfs/subPropertyOf :cmns-dt/hasObservedDateTime,
   :skos/definition
   "indicates a date and time associated with the publication of something, such as a particular version of a value set"})

(def hasReferenceURL
  "indicates a URL the target of which provides the binary content"
  {:db/ident :idmp-dtp/hasReferenceURL,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.4.2.3.4",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has reference URL",
   :rdfs/range :xsd/anyURI,
   :skos/definition
   "indicates a URL the target of which provides the binary content"})

(def hasSourceDescriptor
  "indicates a reference to the CD that was the source of this translation, if this CD was created by translating it from another CD"
  {:db/ident :idmp-dtp/hasSourceDescriptor,
   :dcterms/source "ISO 11240:2021, clause 7.4.6.3.3",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-CD,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has source descriptor",
   :rdfs/range :idmp-dtp/ISO21090-ConceptDescriptor,
   :rdfs/subPropertyOf :cmns-doc/refersTo,
   :skos/definition
   "indicates a reference to the CD that was the source of this translation, if this CD was created by translating it from another CD",
   :skos/note
   "This property is a reference. The source to which the reference points shall be provided within the scope of this CD's root CD and translations; that is, another representation of the same concept in the same attribute."})

(def hasThumbnail
  "indicates an abbreviated rendition of the full content"
  {:db/ident :idmp-dtp/hasThumbnail,
   :dcterms/source "ISO 11240:2021, clause 7.4.2.3.12",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ED,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has thumbnail",
   :rdfs/range :idmp-dtp/ISO21090-AnyDatatype,
   :rdfs/subPropertyOf :cmns-doc/refersTo,
   :skos/definition "indicates an abbreviated rendition of the full content",
   :skos/note
   "A thumbnail requires significantly fewer resources than the full content, while still maintaining some distinctive similarity with the full content. A thumbnail is typically used with by-reference encapsulated data. It allows a user to select the appropriate content more efficiently before actually downloading through the reference. Originally, the term thumbnail refers to an image in a lower resolution (or smaller size) than another image. However, the thumbnail concept can be metaphorically used for media types other than images. For example a movie may be represented by a shorter clip; an audio-clip may be represented by another audio-clip that is shorter, has a lower sampling rate, or a glossy compression; or an abstract provided for a long document. A thumbnail itself shall not contain a thumbnail."})

(def hasTranslation
  "indicates an alternate rendition of the same content translated into a different language"
  {:db/ident :idmp-dtp/hasTranslation,
   :dcterms/source "ISO 11240:2021, clause 7.4.6.3.3",
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has translation",
   :rdfs/range :idmp-dtp/ISO21090-AnyDatatype,
   :rdfs/subPropertyOf :cmns-doc/refersTo,
   :skos/definition
   "indicates an alternate rendition of the same content translated into a different language",
   :skos/note
   "Translations may not contain translations. The translations shall convey the same information, but in a different language. The translations do not take part in the test for equality, so shall not introduce any new semantics to the value."})

(def hasUpdateMode
  "allows a sending system to to identify the role that the attribute plays in processing the instance that is being represented"
  {:db/ident :idmp-dtp/hasUpdateMode,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.3.3.2",
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/label "has update mode",
   :rdfs/range :idmp-dtp/UpdateMode,
   :rdfs/subPropertyOf :cmns-dsg/describes,
   :skos/definition
   "allows a sending system to to identify the role that the attribute plays in processing the instance that is being represented"})

(def hasValidTimeHigh
  "indicates the time that the given information ceased or will cease to be correct"
  {:db/ident :idmp-dtp/hasValidTimeHigh,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.2.3.2",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-TS,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/label "has valid time high",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :rdfs/subPropertyOf :cmns-dt/hasObservedDateTime,
   :skos/definition
   "indicates the time that the given information ceased or will cease to be correct",
   :skos/note
   "Both validTimeLow and validTimeHigh shall be valid timestamps using the format described in 7.8.13.3.1 (TS.value)."})

(def hasValidTimeLow
  "indicates the time that the given information became or will become valid"
  {:db/ident :idmp-dtp/hasValidTimeLow,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.2.3.1",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-TS,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/label "has valid time low",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :rdfs/subPropertyOf :cmns-dt/hasObservedDateTime,
   :skos/definition
   "indicates the time that the given information became or will become valid",
   :skos/note
   "This is not the time that any system first observed the value, but the time that the actual value became correct (i.e. when a patient changes their name)."})

(def hasVersion
  "provides a version descriptor for the source"
  {:cmns-av/adaptedFrom
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.2.3.3",
   :db/ident :idmp-dtp/hasVersion,
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ST,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has version",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :cmns-dsg/hasDescription,
   :skos/definition "provides a version descriptor for the source",
   :skos/note
   ["Whenever a code system changes in an incompatible way, it constitutes a new code system, not simply a different version, regardless of how the vocabulary publisher calls it. For example, the publisher of ICD-9 and ICD-10 calls these code systems, 'revision 9' and 'revision 10' respectively. However, ICD-10 is a complete redesign of the ICD code, not a backward compatible version. Therefore, for the purposes of this datatype International Standard, ICD-9 and ICD-10 are different code systems, not just different versions. By contrast, when LOINC updates from revision '1.0j' to '1.0k', this would be considered as just another version of LOINC, since LOINC revisions are backwards compatible."
    "For the purposes of ISO 21090, versions of a given resource must be backwards compatible."]})

(def hasXMLEncodedData
  "indicates content represented in plain XML form"
  {:db/ident :idmp-dtp/hasXMLEncodedData,
   :dcterms/source
   "ISO 21090:2011 Health informatics - Harmonized data types for information interchange, clause 7.3.2.3.3",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ST,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has XML-encoded data",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition "indicates content represented in plain XML form"})

(def isEncodedAs
  "assigns an ISO 21090 datatype to an XML Scheme Datatype or more complex concept corresponding to the notion of an ISO 21090 datatype"
  {:db/ident :idmp-dtp/isEncodedAs,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "is encoded as",
   :skos/definition
   "assigns an ISO 21090 datatype to an XML Scheme Datatype or more complex concept corresponding to the notion of an ISO 21090 datatype"})