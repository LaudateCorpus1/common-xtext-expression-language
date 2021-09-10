/**
 * generated by Xtext 2.25.0
 */
package com.intuit.dsl.expression.impl;

import com.intuit.dsl.expression.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionFactoryImpl extends EFactoryImpl implements ExpressionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExpressionFactory init()
  {
    try
    {
      ExpressionFactory theExpressionFactory = (ExpressionFactory)EPackage.Registry.INSTANCE.getEFactory(ExpressionPackage.eNS_URI);
      if (theExpressionFactory != null)
      {
        return theExpressionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExpressionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ExpressionPackage.EXPRESSION: return createExpression();
      case ExpressionPackage.LITERAL_EXPRESSION: return createLiteralExpression();
      case ExpressionPackage.TERNARY_EXPRESSION: return createTernaryExpression();
      case ExpressionPackage.FUNCTION: return createFunction();
      case ExpressionPackage.COLLECTION_FUNCTION: return createCollectionFunction();
      case ExpressionPackage.COLLECTION_FUNCTION_CALL: return createCollectionFunctionCall();
      case ExpressionPackage.PARENT_FUNC: return createParentFunc();
      case ExpressionPackage.LAST_FUNC: return createLastFunc();
      case ExpressionPackage.DELETE: return createDelete();
      case ExpressionPackage.SPLIT: return createSplit();
      case ExpressionPackage.CONTAINS: return createContains();
      case ExpressionPackage.EXTRACT: return createExtract();
      case ExpressionPackage.DATE_FORMAT: return createDateFormat();
      case ExpressionPackage.ADD_TO_DATE: return createAddToDate();
      case ExpressionPackage.FILTER_FUNC: return createFilterFunc();
      case ExpressionPackage.FIND_FIRST_FUNC: return createFindFirstFunc();
      case ExpressionPackage.REMOVE_FUNC: return createRemoveFunc();
      case ExpressionPackage.SORT_FUNC: return createSortFunc();
      case ExpressionPackage.DEDUP_FUNC: return createDedupFunc();
      case ExpressionPackage.MAP_FUNC: return createMapFunc();
      case ExpressionPackage.RANGE: return createRange();
      case ExpressionPackage.MAP_STATEMENT: return createMapStatement();
      case ExpressionPackage.CONCAT_FUNC: return createConcatFunc();
      case ExpressionPackage.LENGTH: return createLength();
      case ExpressionPackage.LOWER_FUNC: return createLowerFunc();
      case ExpressionPackage.UPPER_FUNC: return createUpperFunc();
      case ExpressionPackage.UUID_FUNC: return createUUIDFunc();
      case ExpressionPackage.JSON: return createJson();
      case ExpressionPackage.JOIN: return createJoin();
      case ExpressionPackage.DAY_DIFFERENCE: return createDayDifference();
      case ExpressionPackage.TRANSLATE_UNICODE: return createTranslateUnicode();
      case ExpressionPackage.CURRENT_DATE: return createCurrentDate();
      case ExpressionPackage.PICK_FIRST: return createPickFirst();
      case ExpressionPackage.VARIABLE: return createVariable();
      case ExpressionPackage.KEY: return createKey();
      case ExpressionPackage.SCHEMA_VARIABLE: return createSchemaVariable();
      case ExpressionPackage.PROPERTY: return createProperty();
      case ExpressionPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case ExpressionPackage.COMPARISON: return createComparison();
      case ExpressionPackage.MEMBERSHIP: return createMembership();
      case ExpressionPackage.EQUALS: return createEquals();
      case ExpressionPackage.PLUS: return createPlus();
      case ExpressionPackage.MINUS: return createMinus();
      case ExpressionPackage.MULTI_OR_DIV_OR_MOD: return createMultiOrDivOrMod();
      case ExpressionPackage.BOOLEAN_NEGATION: return createBooleanNegation();
      case ExpressionPackage.ARITHMETIC_SIGNED: return createArithmeticSigned();
      case ExpressionPackage.FUNCTION_REFERENCE: return createFunctionReference();
      case ExpressionPackage.VARIABLE_REFERENCE: return createVariableReference();
      case ExpressionPackage.PROPERTY_EXPRESSSION: return createPropertyExpresssion();
      case ExpressionPackage.NUMBER_LITERAL: return createNumberLiteral();
      case ExpressionPackage.STRING_LITERAL: return createStringLiteral();
      case ExpressionPackage.NULL_LITERAL: return createNullLiteral();
      case ExpressionPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case ExpressionPackage.ARRAY_EXPRESSION: return createArrayExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LiteralExpression createLiteralExpression()
  {
    LiteralExpressionImpl literalExpression = new LiteralExpressionImpl();
    return literalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TernaryExpression createTernaryExpression()
  {
    TernaryExpressionImpl ternaryExpression = new TernaryExpressionImpl();
    return ternaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionFunction createCollectionFunction()
  {
    CollectionFunctionImpl collectionFunction = new CollectionFunctionImpl();
    return collectionFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionFunctionCall createCollectionFunctionCall()
  {
    CollectionFunctionCallImpl collectionFunctionCall = new CollectionFunctionCallImpl();
    return collectionFunctionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParentFunc createParentFunc()
  {
    ParentFuncImpl parentFunc = new ParentFuncImpl();
    return parentFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LastFunc createLastFunc()
  {
    LastFuncImpl lastFunc = new LastFuncImpl();
    return lastFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Delete createDelete()
  {
    DeleteImpl delete = new DeleteImpl();
    return delete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Split createSplit()
  {
    SplitImpl split = new SplitImpl();
    return split;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Contains createContains()
  {
    ContainsImpl contains = new ContainsImpl();
    return contains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Extract createExtract()
  {
    ExtractImpl extract = new ExtractImpl();
    return extract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DateFormat createDateFormat()
  {
    DateFormatImpl dateFormat = new DateFormatImpl();
    return dateFormat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AddToDate createAddToDate()
  {
    AddToDateImpl addToDate = new AddToDateImpl();
    return addToDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FilterFunc createFilterFunc()
  {
    FilterFuncImpl filterFunc = new FilterFuncImpl();
    return filterFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FindFirstFunc createFindFirstFunc()
  {
    FindFirstFuncImpl findFirstFunc = new FindFirstFuncImpl();
    return findFirstFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RemoveFunc createRemoveFunc()
  {
    RemoveFuncImpl removeFunc = new RemoveFuncImpl();
    return removeFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SortFunc createSortFunc()
  {
    SortFuncImpl sortFunc = new SortFuncImpl();
    return sortFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DedupFunc createDedupFunc()
  {
    DedupFuncImpl dedupFunc = new DedupFuncImpl();
    return dedupFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapFunc createMapFunc()
  {
    MapFuncImpl mapFunc = new MapFuncImpl();
    return mapFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapStatement createMapStatement()
  {
    MapStatementImpl mapStatement = new MapStatementImpl();
    return mapStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConcatFunc createConcatFunc()
  {
    ConcatFuncImpl concatFunc = new ConcatFuncImpl();
    return concatFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Length createLength()
  {
    LengthImpl length = new LengthImpl();
    return length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LowerFunc createLowerFunc()
  {
    LowerFuncImpl lowerFunc = new LowerFuncImpl();
    return lowerFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UpperFunc createUpperFunc()
  {
    UpperFuncImpl upperFunc = new UpperFuncImpl();
    return upperFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UUIDFunc createUUIDFunc()
  {
    UUIDFuncImpl uuidFunc = new UUIDFuncImpl();
    return uuidFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Json createJson()
  {
    JsonImpl json = new JsonImpl();
    return json;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Join createJoin()
  {
    JoinImpl join = new JoinImpl();
    return join;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DayDifference createDayDifference()
  {
    DayDifferenceImpl dayDifference = new DayDifferenceImpl();
    return dayDifference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TranslateUnicode createTranslateUnicode()
  {
    TranslateUnicodeImpl translateUnicode = new TranslateUnicodeImpl();
    return translateUnicode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CurrentDate createCurrentDate()
  {
    CurrentDateImpl currentDate = new CurrentDateImpl();
    return currentDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PickFirst createPickFirst()
  {
    PickFirstImpl pickFirst = new PickFirstImpl();
    return pickFirst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Key createKey()
  {
    KeyImpl key = new KeyImpl();
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SchemaVariable createSchemaVariable()
  {
    SchemaVariableImpl schemaVariable = new SchemaVariableImpl();
    return schemaVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanExpression createBooleanExpression()
  {
    BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
    return booleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Membership createMembership()
  {
    MembershipImpl membership = new MembershipImpl();
    return membership;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equals createEquals()
  {
    EqualsImpl equals = new EqualsImpl();
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiOrDivOrMod createMultiOrDivOrMod()
  {
    MultiOrDivOrModImpl multiOrDivOrMod = new MultiOrDivOrModImpl();
    return multiOrDivOrMod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanNegation createBooleanNegation()
  {
    BooleanNegationImpl booleanNegation = new BooleanNegationImpl();
    return booleanNegation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArithmeticSigned createArithmeticSigned()
  {
    ArithmeticSignedImpl arithmeticSigned = new ArithmeticSignedImpl();
    return arithmeticSigned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionReference createFunctionReference()
  {
    FunctionReferenceImpl functionReference = new FunctionReferenceImpl();
    return functionReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableReference createVariableReference()
  {
    VariableReferenceImpl variableReference = new VariableReferenceImpl();
    return variableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyExpresssion createPropertyExpresssion()
  {
    PropertyExpresssionImpl propertyExpresssion = new PropertyExpresssionImpl();
    return propertyExpresssion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayExpression createArrayExpression()
  {
    ArrayExpressionImpl arrayExpression = new ArrayExpressionImpl();
    return arrayExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionPackage getExpressionPackage()
  {
    return (ExpressionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExpressionPackage getPackage()
  {
    return ExpressionPackage.eINSTANCE;
  }

} //ExpressionFactoryImpl
