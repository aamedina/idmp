(ns net.wikipunk.rdf.idmp-cmpl
  "The ISO Conformance Annotations ontology provides metadata that indicates the level of conformance any class, property, or annotation used across the ISO IDMP ontologies has with respect to the relevant ISO specifications. These annotations can be used to annotate an entire ontology element or if required, annotate another annotation in the ontology to be more precise."
  {:cmns-av/copyright ["Copyright (c) 2022 Pistoia Alliance, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/META/ISOConformanceAnnotations.rdf",
   :dcterms/abstract
   "The ISO Conformance Annotations ontology provides metadata that indicates the level of conformance any class, property, or annotation used across the ISO IDMP ontologies has with respect to the relevant ISO specifications. These annotations can be used to annotate an entire ontology element or if required, annotate another annotation in the ontology to be more precise.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/references "http://purl.org/dc/terms/",
   :idmp-chg/hasMaturityLevel :idmp-chg/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/Classifiers/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/META/20221201/ISOConformanceAnnotations/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "idmp-cmpl"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ISOConformanceAnnotations/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/META/ISOConformanceAnnotations/",
   :rdfa/prefix "idmp-cmpl",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/META/ISOConformanceAnnotations/",
   :rdfs/label "ISO Conformance Annotations Ontology",
   :skos/changeNote
   "The https://spec.pistoiaalliance.org/idmp/ontology/ISO/20221001/ISOConformanceAnnotations.rdf version of this ontology was modified to add a distinct conformance level for name and annotations, including the definition, in contrast with naming conformance, which means that the concept has the same name as something in an ISO standard but not the same meaning. Two additional annotations were also included, one to say that while the ontology conforms with the definition in the standard, that definition needs clarification, and a second one to identify elements that have been added as extensions that are needed to fill gaps in the standard. These additions are not necessarily non-conformant but should be considered as additions when the standard is revised. We also changed the names of the individuals to include the class name, ConformanceToISOLevel, as a prefix in the individual name to ensure uniqueness."})

(def ConformanceToISOLevel
  "classifier used to indicate the representational conformance of element with respect to the ISO IDMP standard(s) it is derived from"
  {:db/ident :idmp-cmpl/ConformanceToISOLevel,
   :rdf/type :owl/Class,
   :rdfs/label "conformance to ISO level",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "classifier used to indicate the representational conformance of element with respect to the ISO IDMP standard(s) it is derived from"})

(def ConformanceToISOLevel-Conformant
  "compliance level indicating that the ontology element is conformant with the corresponding ISO class, property, datatype, or other individual, including but not limited to the way it is modeled, its naming, annotations, and relationships"
  {:db/ident :idmp-cmpl/ConformanceToISOLevel-Conformant,
   :rdf/type [:idmp-cmpl/ConformanceToISOLevel :owl/NamedIndividual],
   :rdfs/label "conformance to ISO level - conformant",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "compliance level indicating that the ontology element is conformant with the corresponding ISO class, property, datatype, or other individual, including but not limited to the way it is modeled, its naming, annotations, and relationships"}})

(def ConformanceToISOLevel-DefinitionallyConformant
  "compliance level indicating that the ontology element is conformant with the corresponding ISO class, property, datatype, or other individual with respect to its definition and other annotations, but may not be conformant with respect to how it is named or otherwise modeled"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Definitionally conformant elements will have annotations corresponding to what is in the ISO IDMP standard but be named and modeled differently. Examples include elements that are modeled as classes in the IDMP standard but as properties in the ontology, so the name has been rephrased as a verb or verb phrase."},
   :db/ident :idmp-cmpl/ConformanceToISOLevel-DefinitionallyConformant,
   :rdf/type [:idmp-cmpl/ConformanceToISOLevel :owl/NamedIndividual],
   :rdfs/label "conformance to ISO level - definitionally conformant",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "compliance level indicating that the ontology element is conformant with the corresponding ISO class, property, datatype, or other individual with respect to its definition and other annotations, but may not be conformant with respect to how it is named or otherwise modeled"}})

(def ConformanceToISOLevel-Extension
  "compliance level indicating that the ontology element extends the existing ISO standard with a concept that is either implied by the specification or fills a gap that was not addressed in the standard"
  {:db/ident :idmp-cmpl/ConformanceToISOLevel-Extension,
   :rdf/type [:idmp-cmpl/ConformanceToISOLevel :owl/NamedIndividual],
   :rdfs/label "conformance to ISO level - extension",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "compliance level indicating that the ontology element extends the existing ISO standard with a concept that is either implied by the specification or fills a gap that was not addressed in the standard"}})

(def ConformanceToISOLevel-ModelConformant
  "compliance level indicating that the ontology element is conformant with the corresponding ISO class, property, datatype, or other individual with respect to how it is modeled, but not necessarily with respect to all of its relationships"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "There are various cases in the ontologies where a given element will be modeled as a text value with some ISO 21090 Harmonized Datatype encoding, whereas we have modeled it as a named individual with additional semantics in the ontology. A class that in other aspects is modeled as defined in the relevant ISO IDMP specifications that has a relationships with this individual rather than having a text attribute for it would be considered model conformant."},
   :db/ident :idmp-cmpl/ConformanceToISOLevel-ModelConformant,
   :rdf/type [:idmp-cmpl/ConformanceToISOLevel :owl/NamedIndividual],
   :rdfs/label "conformance to ISO level - model conformant",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "compliance level indicating that the ontology element is conformant with the corresponding ISO class, property, datatype, or other individual with respect to how it is modeled, but not necessarily with respect to all of its relationships"}})

(def ConformanceToISOLevel-NameAndAnnotationConformant
  "compliance level indicating that the ontology element is conformant with the corresponding ISO class, property, datatype, or other individual with respect to its name, definition and other annotations, but may not be conformant with respect to how it is modeled"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "There are various cases in the ontologies where a given element will be modeled as a class, similarly to what is in the ISO IDMP standard, but whose relationships are specified differently. This may be because of inheritance via the patterns we have implemented, the use of restrictions, or other variations with respect to the modeling approach taken. Other cases include concepts that are modeled as roles in the ontology but as classes or properties in the IDMP standard."},
   :db/ident :idmp-cmpl/ConformanceToISOLevel-NameAndAnnotationConformant,
   :rdf/type [:idmp-cmpl/ConformanceToISOLevel :owl/NamedIndividual],
   :rdfs/label "conformance to ISO level - name and annotation conformant",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "compliance level indicating that the ontology element is conformant with the corresponding ISO class, property, datatype, or other individual with respect to its name, definition and other annotations, but may not be conformant with respect to how it is modeled"}})

(def ConformanceToISOLevel-NamingConformant
  "compliance level indicating that the ontology element is conformant with the corresponding ISO class, property, datatype, or other individual with respect to its name, and possibly other annotations, but not in terms of its definition or with respect to how it is modeled"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "One such case identified shortly after the initial 0.1 version of the ontology was released is the concept 'ingredient', which is modeled as a role rather than as a subclass of material and where the definition in ISO 11238 is distinct from the definition in the ontology."},
   :db/ident :idmp-cmpl/ConformanceToISOLevel-NamingConformant,
   :rdf/type [:idmp-cmpl/ConformanceToISOLevel :owl/NamedIndividual],
   :rdfs/label "conformance to ISO level - naming conformant",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "compliance level indicating that the ontology element is conformant with the corresponding ISO class, property, datatype, or other individual with respect to its name, and possibly other annotations, but not in terms of its definition or with respect to how it is modeled"}})

(def ConformanceToISOLevel-NeedsClarification
  "compliance level indicating that the ontology element is conformant with the ISO standard but indicates that the standard should be revised in some fashion for clarification purposes"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In this case, a usage note should accompany this annotation to say what exactly needs clarification."},
   :db/ident :idmp-cmpl/ConformanceToISOLevel-NeedsClarification,
   :rdf/type [:idmp-cmpl/ConformanceToISOLevel :owl/NamedIndividual],
   :rdfs/label "conformance to ISO level - needs clarification",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "compliance level indicating that the ontology element is conformant with the ISO standard but indicates that the standard should be revised in some fashion for clarification purposes"}})

(def ConformanceToISOLevel-NonConformant
  "compliance level indicating that the ontology element is not conformant with the corresponding ISO class, property, datatype, or other individual"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This annotation should be used when the ontology necessarily differs from the standard in some way due to an inconsistency that would be introduced if it was modeled explicitly as indicated in the UML model, for example. In this case a usage note should be included to state why we believe that the element should be modeled differently."},
   :db/ident :idmp-cmpl/ConformanceToISOLevel-NonConformant,
   :rdf/type [:idmp-cmpl/ConformanceToISOLevel :owl/NamedIndividual],
   :rdfs/label "conformance to ISO level - non-conformant",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "compliance level indicating that the ontology element is not conformant with the corresponding ISO class, property, datatype, or other individual"}})

(def hasConformanceToISOLevel
  "links something to its representational compliance with respect to the ISO IDMP standard(s) it is derived from"
  {:db/ident :idmp-cmpl/hasConformanceToISOLevel,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "has conformance to ISO level",
   :skos/definition
   "links something to its representational compliance with respect to the ISO IDMP standard(s) it is derived from"})