(ns net.wikipunk.rdf.cmns-doc
  "This ontology defines high-level concepts for representation of documents, including legal documents and any kind of record, such as a transaction record, purchase history, and payment history."
  {:cmns-av/copyright ["Copyright (c) 2014-2022 Object Management Group, Inc."
                       "Copyright (c) 2014-2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/Documents.rdf",
   :dcterms/abstract
   "This ontology defines high-level concepts for representation of documents, including legal documents and any kind of record, such as a transaction record, purchase history, and payment history.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports ["https://www.omg.org/spec/Commons/DatesAndTimes/"
                 "https://www.omg.org/spec/Commons/Collections/"
                 "https://www.omg.org/spec/Commons/PartiesAndSituations/"
                 "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI "https://www.omg.org/spec/Commons/20220601/Documents/",
   :rdf/ns-prefix-map
   {"cmns-av"  "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt"  "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "dcterms"  "http://purl.org/dc/terms/",
    "owl"      "http://www.w3.org/2002/07/owl#",
    "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
    "skos"     "http://www.w3.org/2004/02/skos/core#",
    "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/Commons/Documents/",
   :rdfa/prefix "cmns-doc",
   :rdfa/uri "https://www.omg.org/spec/Commons/Documents/",
   :rdfs/label "Commons Documents Ontology"})

(def Certificate
  "document attesting to the truth of some fact or set of facts"
  {:db/ident :cmns-doc/Certificate,
   :rdf/type :owl/Class,
   :rdfs/label "certificate",
   :rdfs/subClassOf :cmns-doc/Document,
   :skos/definition
   "document attesting to the truth of some fact or set of facts"})

(def Document
  "something tangible that records something, such as a recording or a photograph, or a writing that can be used to furnish evidence or information"
  {:db/ident :cmns-doc/Document,
   :rdf/type :owl/Class,
   :rdfs/label "document",
   :rdfs/subClassOf {:owl/onProperty     :cmns-doc/isAbout,
                     :owl/someValuesFrom :owl/Thing,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   "something tangible that records something, such as a recording or a photograph, or a writing that can be used to furnish evidence or information",
   :skos/note
   "A document, especially a legal document, may serve to establish one or several facts, and can be relied upon as a proof thereof."})

(def LegalDocument
  "document that bears the original, official, or legal form of something, that can be fully attributed to its author, that records and formally expresses a legally enforceable act, process, or contractual duty, obligation, or right and that can be used to furnish decisive evidence for that act, process, or agreement"
  {:db/ident :cmns-doc/LegalDocument,
   :rdf/type :owl/Class,
   :rdfs/label "legal document",
   :rdfs/subClassOf :cmns-doc/Document,
   :skos/definition
   "document that bears the original, official, or legal form of something, that can be fully attributed to its author, that records and formally expresses a legally enforceable act, process, or contractual duty, obligation, or right and that can be used to furnish decisive evidence for that act, process, or agreement",
   :skos/example
   "Examples include some certificates, deeds, bonds, business documents (such as articles of incorporation, bylaws, partnership agreements), contracts, certain identity documents, wills, trusts, legislative acts, notarial acts, court writs or processes (such as related complaints and pleadings in the context of litigation as well as other documents relevant to some legal issue), and any law passed by a competent legislative body in municipal (domestic) or international law.",
   :skos/note
   "In order for a document to be legal, it must conform to the laws of the jurisdiction where it will be enforced. Typically, such a document should also be properly signed, witnessed and filed to be considered legal."})

(def Notice
  "announcement, intimation, or advance warning of something, especially to allow preparations to be made"
  {:db/ident :cmns-doc/Notice,
   :rdf/type :owl/Class,
   :rdfs/label "notice",
   :rdfs/subClassOf :cmns-doc/Document,
   :skos/definition
   "announcement, intimation, or advance warning of something, especially to allow preparations to be made",
   :skos/note
   "Although many notices are delivered electronically, certain legal notices must be given given in writing, often by regular mail or hand delivery, with the sender retaining sufficient proof of having given such notice (e.g., through a certificate of service)."})

(def Record
  "memorialization and objective evidence of activities performed, events occurred, results achieved, or statements made, regardless of its characteristics, media, physical form, or the manner in which it is recorded or stored"
  {:db/ident :cmns-doc/Record,
   :rdf/type :owl/Class,
   :rdfs/label "record",
   :rdfs/subClassOf :cmns-col/Collection,
   :skos/definition
   "memorialization and objective evidence of activities performed, events occurred, results achieved, or statements made, regardless of its characteristics, media, physical form, or the manner in which it is recorded or stored",
   :skos/example
   "Records include accounts, agreements, books, drawings, letters, magnetic/optical disks, memos, micrographics, etc.",
   :skos/note
   "Records are created or received by an organization in routine transaction of its business or in pursuance of its legal obligations."})

(def Reference
  "source that may be used to ascertain, interpret, or understand something"
  {:cmns-av/explanatoryNote
   "In linguistics, a reference characterizes, provides context for, or specifies the relationship of one linguistic expression to another, i.e., provides the information necessary to interpret the dependent expression.",
   :db/ident :cmns-doc/Reference,
   :rdf/type :owl/Class,
   :rdfs/label "reference",
   :skos/definition
   "source that may be used to ascertain, interpret, or understand something"})

(def ReferenceDocument
  "document that provides pertinent details for consultation about a subject"
  {:db/ident :cmns-doc/ReferenceDocument,
   :dcterms/source
   "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15",
   :rdf/type :owl/Class,
   :rdfs/label "reference document",
   :rdfs/subClassOf [:cmns-doc/Reference :cmns-doc/Document],
   :skos/definition
   "document that provides pertinent details for consultation about a subject"})

(def Report
  "document that provides a structured description of something, prepared on ad hoc, periodic, recurring, regular, or as required basis"
  {:cmns-av/explanatoryNote
   "Reports may refer to specific periods, events, occurrences, or subjects, and may be communicated or presented in oral, electronic, or written form.",
   :db/ident :cmns-doc/Report,
   :rdf/type :owl/Class,
   :rdfs/label "report",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-doc/isReportedBy,
                      :owl/someValuesFrom :cmns-doc/ReportingParty,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-dt/DateTime,
                      :owl/onProperty :cmns-doc/hasReportDateTime,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-dt/DatePeriod,
                      :owl/onProperty :cmns-doc/hasReportingPeriod,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :cmns-doc/isReportedTo,
                      :owl/someValuesFrom :cmns-pts/PartyRole,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-dt/ExplicitDate,
                      :owl/onProperty :cmns-doc/hasReportDate,
                      :rdf/type       :owl/Restriction}
                     :cmns-doc/Document],
   :skos/definition
   "document that provides a structured description of something, prepared on ad hoc, periodic, recurring, regular, or as required basis"})

(def ReportingParty
  "party providing a report, typically in response to some contractual, legal, regulatory or other business requirement"
  {:db/ident :cmns-doc/ReportingParty,
   :rdf/type :owl/Class,
   :rdfs/label "reporting party",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-doc/authors,
                      :owl/someValuesFrom :cmns-doc/Report,
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/PartyRole],
   :skos/definition
   "party providing a report, typically in response to some contractual, legal, regulatory or other business requirement"})

(def authors
  "creates or originates and is responsible for the content of"
  {:db/ident :cmns-doc/authors,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "authors",
   :skos/definition
   "creates or originates and is responsible for the content of"})

(def hasDataSource
  "relates something, such as an agreement, contract, document, record, report, or process, to a source of data used to analyze, develop, explain, produce, or otherwise create it"
  {:db/ident :cmns-doc/hasDataSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has data source",
   :rdfs/subPropertyOf :cmns-doc/refersTo,
   :skos/definition
   "relates something, such as an agreement, contract, document, record, report, or process, to a source of data used to analyze, develop, explain, produce, or otherwise create it",
   :skos/note
   "Although in many cases an annotation property, such as dct:source, is sufficient for this purpose, there are occasions when a more complete description of a source is required, for which this property may be used."})

(def hasDateOfIssuance
  "links something, typically an agreement, contract, or report, with the date it was produced or published"
  {:db/ident :cmns-doc/hasDateOfIssuance,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/label "has date of issuance",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasStartDate,
   :skos/definition
   "links something, typically an agreement, contract, or report, with the date it was produced or published"})

(def hasExpirationDate
  "links something, such as an agreement, contract, report, other document, or perishable item, with a date beyond which it is no longer valid"
  {:db/ident :cmns-doc/hasExpirationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has expiration date",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasEndDate,
   :skos/definition
   "links something, such as an agreement, contract, report, other document, or perishable item, with a date beyond which it is no longer valid"})

(def hasRecord
  "links something to a record that pertains to it"
  {:db/ident           :cmns-doc/hasRecord,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "has record",
   :rdfs/range         :cmns-doc/Record,
   :rdfs/subPropertyOf :cmns-col/comprises,
   :skos/definition    "links something to a record that pertains to it"})

(def hasReportDate
  "date on which a report was issued"
  {:db/ident           :cmns-doc/hasReportDate,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has report date"},
   :rdfs/range         :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf [:cmns-doc/hasDateOfIssuance :cmns-dt/hasExplicitDate],
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "date on which a report was issued"}})

(def hasReportDateTime
  "date and time at which a report was issued"
  {:db/ident           :cmns-doc/hasReportDateTime,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has report date time"},
   :rdfs/range         :cmns-dt/DateTime,
   :rdfs/subPropertyOf :cmns-dt/hasDateTime,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "date and time at which a report was issued"}})

(def hasReportingPeriod
  "specifies the period for which a report, document, statistical measure or something else, applies"
  {:db/ident :cmns-doc/hasReportingPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has reporting period",
   :rdfs/range :cmns-dt/ExplicitDatePeriod,
   :rdfs/subPropertyOf :cmns-dt/hasDatePeriod,
   :skos/definition
   "specifies the period for which a report, document, statistical measure or something else, applies"})

(def hasTerminationDate
  "links something, typically an agreement, contract, document, or process, with a date on which it was or will be terminated"
  {:db/ident :cmns-doc/hasTerminationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has termination date",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasEndDate,
   :skos/definition
   "links something, typically an agreement, contract, document, or process, with a date on which it was or will be terminated"})

(def isAbout
  "indicates the subject or topic of something, such as a document"
  {:db/ident :cmns-doc/isAbout,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is about",
   :skos/definition
   "indicates the subject or topic of something, such as a document"})

(def isReportedBy
  "indicates the party that authors and provides a report"
  {:db/ident :cmns-doc/isReportedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is reported by",
   :rdfs/range :cmns-pts/PartyRole,
   :rdfs/subPropertyOf :cmns-pts/hasPartyRole,
   :skos/definition "indicates the party that authors and provides a report"})

(def isReportedTo
  "indicates the party to which something is reported"
  {:db/ident           :cmns-doc/isReportedTo,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "is reported to",
   :rdfs/range         :cmns-pts/PartyRole,
   :rdfs/subPropertyOf :cmns-pts/hasPartyRole,
   :skos/definition    "indicates the party to which something is reported"})

(def records
  "documents for later reference"
  {:db/ident        :cmns-doc/records,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "records",
   :skos/definition "documents for later reference"})

(def refersTo
  "makes reference to as a source for information or explanation"
  {:db/ident :cmns-doc/refersTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "refers to",
   :skos/definition
   "makes reference to as a source for information or explanation"})